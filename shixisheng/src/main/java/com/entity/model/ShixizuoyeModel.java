package com.entity.model;

import com.entity.ShixizuoyeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 实习作业
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShixizuoyeModel implements Serializable {
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
     * 实习作业编号
     */
    private String shixizuoyeUuidNumber;


    /**
     * 实习作业标题
     */
    private String shixizuoyeName;


    /**
     * 作业描述
     */
    private String shixizuoyeContent;


    /**
     * 作业文件
     */
    private String shixizuoyeFile;


    /**
     * 上传时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 作业打分
     */
    private Double shixizuoyeOldMoney;


    /**
     * 作业评语
     */
    private String shixizuoyePingyuContent;


    /**
     * 评论时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date updateTime;


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
	 * 获取：实习作业编号
	 */
    public String getShixizuoyeUuidNumber() {
        return shixizuoyeUuidNumber;
    }


    /**
	 * 设置：实习作业编号
	 */
    public void setShixizuoyeUuidNumber(String shixizuoyeUuidNumber) {
        this.shixizuoyeUuidNumber = shixizuoyeUuidNumber;
    }
    /**
	 * 获取：实习作业标题
	 */
    public String getShixizuoyeName() {
        return shixizuoyeName;
    }


    /**
	 * 设置：实习作业标题
	 */
    public void setShixizuoyeName(String shixizuoyeName) {
        this.shixizuoyeName = shixizuoyeName;
    }
    /**
	 * 获取：作业描述
	 */
    public String getShixizuoyeContent() {
        return shixizuoyeContent;
    }


    /**
	 * 设置：作业描述
	 */
    public void setShixizuoyeContent(String shixizuoyeContent) {
        this.shixizuoyeContent = shixizuoyeContent;
    }
    /**
	 * 获取：作业文件
	 */
    public String getShixizuoyeFile() {
        return shixizuoyeFile;
    }


    /**
	 * 设置：作业文件
	 */
    public void setShixizuoyeFile(String shixizuoyeFile) {
        this.shixizuoyeFile = shixizuoyeFile;
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
	 * 获取：作业打分
	 */
    public Double getShixizuoyeOldMoney() {
        return shixizuoyeOldMoney;
    }


    /**
	 * 设置：作业打分
	 */
    public void setShixizuoyeOldMoney(Double shixizuoyeOldMoney) {
        this.shixizuoyeOldMoney = shixizuoyeOldMoney;
    }
    /**
	 * 获取：作业评语
	 */
    public String getShixizuoyePingyuContent() {
        return shixizuoyePingyuContent;
    }


    /**
	 * 设置：作业评语
	 */
    public void setShixizuoyePingyuContent(String shixizuoyePingyuContent) {
        this.shixizuoyePingyuContent = shixizuoyePingyuContent;
    }
    /**
	 * 获取：评论时间
	 */
    public Date getUpdateTime() {
        return updateTime;
    }


    /**
	 * 设置：评论时间
	 */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
