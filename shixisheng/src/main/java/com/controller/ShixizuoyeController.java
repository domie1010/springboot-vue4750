
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 实习作业
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/shixizuoye")
public class ShixizuoyeController {
    private static final Logger logger = LoggerFactory.getLogger(ShixizuoyeController.class);

    private static final String TABLE_NAME = "shixizuoye";

    @Autowired
    private ShixizuoyeService shixizuoyeService;


    @Autowired
    private TokenService tokenService;

    @Autowired
    private DictionaryService dictionaryService;//字典表
    @Autowired
    private FudaoyuanService fudaoyuanService;//辅导员
    @Autowired
    private GonggaoService gonggaoService;//公告
    @Autowired
    private JianliService jianliService;//简历
    @Autowired
    private QiyeService qiyeService;//企业
    @Autowired
    private ShixishengpeiyangService shixishengpeiyangService;//实习生培养记录
    @Autowired
    private YonghuService yonghuService;//用户
    @Autowired
    private ZhaopinService zhaopinService;//职位招聘
    @Autowired
    private ZhaopinCollectionService zhaopinCollectionService;//职位收藏
    @Autowired
    private ZhaopinLiuyanService zhaopinLiuyanService;//职位留言
    @Autowired
    private ZhaopinToudiService zhaopinToudiService;//简历投递
    @Autowired
    private UsersService usersService;//管理员


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        else if("辅导员".equals(role))
            params.put("fudaoyuanId",request.getSession().getAttribute("userId"));
        else if("企业".equals(role))
            params.put("qiyeId",request.getSession().getAttribute("userId"));
        CommonUtil.checkMap(params);
        PageUtils page = shixizuoyeService.queryPage(params);

        //字典表数据转换
        List<ShixizuoyeView> list =(List<ShixizuoyeView>)page.getList();
        for(ShixizuoyeView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ShixizuoyeEntity shixizuoye = shixizuoyeService.selectById(id);
        if(shixizuoye !=null){
            //entity转view
            ShixizuoyeView view = new ShixizuoyeView();
            BeanUtils.copyProperties( shixizuoye , view );//把实体数据重构到view中
            //级联表 用户
            //级联表
            YonghuEntity yonghu = yonghuService.selectById(shixizuoye.getYonghuId());
            if(yonghu != null){
            BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "username", "password", "newMoney", "yonghuId"});//把级联的数据添加到view中,并排除id和创建时间字段,当前表的级联注册表
            view.setYonghuId(yonghu.getId());
            }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody ShixizuoyeEntity shixizuoye, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,shixizuoye:{}",this.getClass().getName(),shixizuoye.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("用户".equals(role))
            shixizuoye.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<ShixizuoyeEntity> queryWrapper = new EntityWrapper<ShixizuoyeEntity>()
            .eq("yonghu_id", shixizuoye.getYonghuId())
            .eq("shixizuoye_name", shixizuoye.getShixizuoyeName())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShixizuoyeEntity shixizuoyeEntity = shixizuoyeService.selectOne(queryWrapper);
        if(shixizuoyeEntity==null){
            shixizuoye.setInsertTime(new Date());
            shixizuoye.setCreateTime(new Date());
            shixizuoyeService.insert(shixizuoye);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ShixizuoyeEntity shixizuoye, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,shixizuoye:{}",this.getClass().getName(),shixizuoye.toString());
        ShixizuoyeEntity oldShixizuoyeEntity = shixizuoyeService.selectById(shixizuoye.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("用户".equals(role))
//            shixizuoye.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        if("".equals(shixizuoye.getShixizuoyeContent()) || "null".equals(shixizuoye.getShixizuoyeContent())){
                shixizuoye.setShixizuoyeContent(null);
        }
        if("".equals(shixizuoye.getShixizuoyeFile()) || "null".equals(shixizuoye.getShixizuoyeFile())){
                shixizuoye.setShixizuoyeFile(null);
        }
        if("".equals(shixizuoye.getShixizuoyePingyuContent()) || "null".equals(shixizuoye.getShixizuoyePingyuContent())){
                shixizuoye.setShixizuoyePingyuContent(null);
        }
        shixizuoye.setUpdateTime(new Date());

            shixizuoyeService.updateById(shixizuoye);//根据id更新
            return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<ShixizuoyeEntity> oldShixizuoyeList =shixizuoyeService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        shixizuoyeService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //.eq("time", new SimpleDateFormat("yyyy-MM-dd").format(new Date()))
        try {
            List<ShixizuoyeEntity> shixizuoyeList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            ShixizuoyeEntity shixizuoyeEntity = new ShixizuoyeEntity();
//                            shixizuoyeEntity.setYonghuId(Integer.valueOf(data.get(0)));   //用户 要改的
//                            shixizuoyeEntity.setShixizuoyeUuidNumber(data.get(0));                    //实习作业编号 要改的
//                            shixizuoyeEntity.setShixizuoyeName(data.get(0));                    //实习作业标题 要改的
//                            shixizuoyeEntity.setShixizuoyeContent("");//详情和图片
//                            shixizuoyeEntity.setShixizuoyeFile(data.get(0));                    //作业文件 要改的
//                            shixizuoyeEntity.setInsertTime(date);//时间
//                            shixizuoyeEntity.setShixizuoyeOldMoney(data.get(0));                    //作业打分 要改的
//                            shixizuoyeEntity.setShixizuoyePingyuContent("");//详情和图片
//                            shixizuoyeEntity.setUpdateTime(sdf.parse(data.get(0)));          //评论时间 要改的
//                            shixizuoyeEntity.setCreateTime(date);//时间
                            shixizuoyeList.add(shixizuoyeEntity);


                            //把要查询是否重复的字段放入map中
                                //实习作业编号
                                if(seachFields.containsKey("shixizuoyeUuidNumber")){
                                    List<String> shixizuoyeUuidNumber = seachFields.get("shixizuoyeUuidNumber");
                                    shixizuoyeUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> shixizuoyeUuidNumber = new ArrayList<>();
                                    shixizuoyeUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("shixizuoyeUuidNumber",shixizuoyeUuidNumber);
                                }
                        }

                        //查询是否重复
                         //实习作业编号
                        List<ShixizuoyeEntity> shixizuoyeEntities_shixizuoyeUuidNumber = shixizuoyeService.selectList(new EntityWrapper<ShixizuoyeEntity>().in("shixizuoye_uuid_number", seachFields.get("shixizuoyeUuidNumber")));
                        if(shixizuoyeEntities_shixizuoyeUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(ShixizuoyeEntity s:shixizuoyeEntities_shixizuoyeUuidNumber){
                                repeatFields.add(s.getShixizuoyeUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [实习作业编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        shixizuoyeService.insertBatch(shixizuoyeList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }




    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        CommonUtil.checkMap(params);
        PageUtils page = shixizuoyeService.queryPage(params);

        //字典表数据转换
        List<ShixizuoyeView> list =(List<ShixizuoyeView>)page.getList();
        for(ShixizuoyeView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段

        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Integer id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ShixizuoyeEntity shixizuoye = shixizuoyeService.selectById(id);
            if(shixizuoye !=null){


                //entity转view
                ShixizuoyeView view = new ShixizuoyeView();
                BeanUtils.copyProperties( shixizuoye , view );//把实体数据重构到view中

                //级联表
                    YonghuEntity yonghu = yonghuService.selectById(shixizuoye.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "username", "password", "newMoney", "yonghuId"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody ShixizuoyeEntity shixizuoye, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,shixizuoye:{}",this.getClass().getName(),shixizuoye.toString());
        Wrapper<ShixizuoyeEntity> queryWrapper = new EntityWrapper<ShixizuoyeEntity>()
            .eq("yonghu_id", shixizuoye.getYonghuId())
            .eq("shixizuoye_uuid_number", shixizuoye.getShixizuoyeUuidNumber())
            .eq("shixizuoye_name", shixizuoye.getShixizuoyeName())
//            .notIn("shixizuoye_types", new Integer[]{102})
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShixizuoyeEntity shixizuoyeEntity = shixizuoyeService.selectOne(queryWrapper);
        if(shixizuoyeEntity==null){
            shixizuoye.setInsertTime(new Date());
            shixizuoye.setCreateTime(new Date());
        shixizuoyeService.insert(shixizuoye);

            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

}

