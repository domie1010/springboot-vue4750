package com.entity.model;

import com.entity.ShixishengpeiyangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 实习生培养记录
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShixishengpeiyangModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 实习生培养记录编号
     */
    private String shixishengpeiyangUuidNumber;


    /**
     * 实习生培养标题
     */
    private String shixishengpeiyangName;


    /**
     * 培养地点
     */
    private String shixishengpeiyangAddress;


    /**
     * 培养类型
     */
    private Integer shixishengpeiyangTypes;


    /**
     * 培养时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date shixishengpeiyangTime;


    /**
     * 培养内容
     */
    private String shixishengpeiyangContent;


    /**
     * 打分
     */
    private Double shixishengpeiyangDafen;


    /**
     * 培养结果
     */
    private Integer shixishengpeiyangJieguoTypes;


    /**
     * 培养评语
     */
    private String shixishengpeiyangPingyuContent;


    /**
     * 上传时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间  show3 listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：实习生培养记录编号
	 */
    public String getShixishengpeiyangUuidNumber() {
        return shixishengpeiyangUuidNumber;
    }


    /**
	 * 设置：实习生培养记录编号
	 */
    public void setShixishengpeiyangUuidNumber(String shixishengpeiyangUuidNumber) {
        this.shixishengpeiyangUuidNumber = shixishengpeiyangUuidNumber;
    }
    /**
	 * 获取：实习生培养标题
	 */
    public String getShixishengpeiyangName() {
        return shixishengpeiyangName;
    }


    /**
	 * 设置：实习生培养标题
	 */
    public void setShixishengpeiyangName(String shixishengpeiyangName) {
        this.shixishengpeiyangName = shixishengpeiyangName;
    }
    /**
	 * 获取：培养地点
	 */
    public String getShixishengpeiyangAddress() {
        return shixishengpeiyangAddress;
    }


    /**
	 * 设置：培养地点
	 */
    public void setShixishengpeiyangAddress(String shixishengpeiyangAddress) {
        this.shixishengpeiyangAddress = shixishengpeiyangAddress;
    }
    /**
	 * 获取：培养类型
	 */
    public Integer getShixishengpeiyangTypes() {
        return shixishengpeiyangTypes;
    }


    /**
	 * 设置：培养类型
	 */
    public void setShixishengpeiyangTypes(Integer shixishengpeiyangTypes) {
        this.shixishengpeiyangTypes = shixishengpeiyangTypes;
    }
    /**
	 * 获取：培养时间
	 */
    public Date getShixishengpeiyangTime() {
        return shixishengpeiyangTime;
    }


    /**
	 * 设置：培养时间
	 */
    public void setShixishengpeiyangTime(Date shixishengpeiyangTime) {
        this.shixishengpeiyangTime = shixishengpeiyangTime;
    }
    /**
	 * 获取：培养内容
	 */
    public String getShixishengpeiyangContent() {
        return shixishengpeiyangContent;
    }


    /**
	 * 设置：培养内容
	 */
    public void setShixishengpeiyangContent(String shixishengpeiyangContent) {
        this.shixishengpeiyangContent = shixishengpeiyangContent;
    }
    /**
	 * 获取：打分
	 */
    public Double getShixishengpeiyangDafen() {
        return shixishengpeiyangDafen;
    }


    /**
	 * 设置：打分
	 */
    public void setShixishengpeiyangDafen(Double shixishengpeiyangDafen) {
        this.shixishengpeiyangDafen = shixishengpeiyangDafen;
    }
    /**
	 * 获取：培养结果
	 */
    public Integer getShixishengpeiyangJieguoTypes() {
        return shixishengpeiyangJieguoTypes;
    }


    /**
	 * 设置：培养结果
	 */
    public void setShixishengpeiyangJieguoTypes(Integer shixishengpeiyangJieguoTypes) {
        this.shixishengpeiyangJieguoTypes = shixishengpeiyangJieguoTypes;
    }
    /**
	 * 获取：培养评语
	 */
    public String getShixishengpeiyangPingyuContent() {
        return shixishengpeiyangPingyuContent;
    }


    /**
	 * 设置：培养评语
	 */
    public void setShixishengpeiyangPingyuContent(String shixishengpeiyangPingyuContent) {
        this.shixishengpeiyangPingyuContent = shixishengpeiyangPingyuContent;
    }
    /**
	 * 获取：上传时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：上传时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间  show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show3 listShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
