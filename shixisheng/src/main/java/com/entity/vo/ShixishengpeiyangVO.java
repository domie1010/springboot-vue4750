package com.entity.vo;

import com.entity.ShixishengpeiyangEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 实习生培养记录
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shixishengpeiyang")
public class ShixishengpeiyangVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 实习生培养记录编号
     */

    @TableField(value = "shixishengpeiyang_uuid_number")
    private String shixishengpeiyangUuidNumber;


    /**
     * 实习生培养标题
     */

    @TableField(value = "shixishengpeiyang_name")
    private String shixishengpeiyangName;


    /**
     * 培养地点
     */

    @TableField(value = "shixishengpeiyang_address")
    private String shixishengpeiyangAddress;


    /**
     * 培养类型
     */

    @TableField(value = "shixishengpeiyang_types")
    private Integer shixishengpeiyangTypes;


    /**
     * 培养时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "shixishengpeiyang_time")
    private Date shixishengpeiyangTime;


    /**
     * 培养内容
     */

    @TableField(value = "shixishengpeiyang_content")
    private String shixishengpeiyangContent;


    /**
     * 打分
     */

    @TableField(value = "shixishengpeiyang_dafen")
    private Double shixishengpeiyangDafen;


    /**
     * 培养结果
     */

    @TableField(value = "shixishengpeiyang_jieguo_types")
    private Integer shixishengpeiyangJieguoTypes;


    /**
     * 培养评语
     */

    @TableField(value = "shixishengpeiyang_pingyu_content")
    private String shixishengpeiyangPingyuContent;


    /**
     * 上传时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间  show3 listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：实习生培养记录编号
	 */
    public String getShixishengpeiyangUuidNumber() {
        return shixishengpeiyangUuidNumber;
    }


    /**
	 * 获取：实习生培养记录编号
	 */

    public void setShixishengpeiyangUuidNumber(String shixishengpeiyangUuidNumber) {
        this.shixishengpeiyangUuidNumber = shixishengpeiyangUuidNumber;
    }
    /**
	 * 设置：实习生培养标题
	 */
    public String getShixishengpeiyangName() {
        return shixishengpeiyangName;
    }


    /**
	 * 获取：实习生培养标题
	 */

    public void setShixishengpeiyangName(String shixishengpeiyangName) {
        this.shixishengpeiyangName = shixishengpeiyangName;
    }
    /**
	 * 设置：培养地点
	 */
    public String getShixishengpeiyangAddress() {
        return shixishengpeiyangAddress;
    }


    /**
	 * 获取：培养地点
	 */

    public void setShixishengpeiyangAddress(String shixishengpeiyangAddress) {
        this.shixishengpeiyangAddress = shixishengpeiyangAddress;
    }
    /**
	 * 设置：培养类型
	 */
    public Integer getShixishengpeiyangTypes() {
        return shixishengpeiyangTypes;
    }


    /**
	 * 获取：培养类型
	 */

    public void setShixishengpeiyangTypes(Integer shixishengpeiyangTypes) {
        this.shixishengpeiyangTypes = shixishengpeiyangTypes;
    }
    /**
	 * 设置：培养时间
	 */
    public Date getShixishengpeiyangTime() {
        return shixishengpeiyangTime;
    }


    /**
	 * 获取：培养时间
	 */

    public void setShixishengpeiyangTime(Date shixishengpeiyangTime) {
        this.shixishengpeiyangTime = shixishengpeiyangTime;
    }
    /**
	 * 设置：培养内容
	 */
    public String getShixishengpeiyangContent() {
        return shixishengpeiyangContent;
    }


    /**
	 * 获取：培养内容
	 */

    public void setShixishengpeiyangContent(String shixishengpeiyangContent) {
        this.shixishengpeiyangContent = shixishengpeiyangContent;
    }
    /**
	 * 设置：打分
	 */
    public Double getShixishengpeiyangDafen() {
        return shixishengpeiyangDafen;
    }


    /**
	 * 获取：打分
	 */

    public void setShixishengpeiyangDafen(Double shixishengpeiyangDafen) {
        this.shixishengpeiyangDafen = shixishengpeiyangDafen;
    }
    /**
	 * 设置：培养结果
	 */
    public Integer getShixishengpeiyangJieguoTypes() {
        return shixishengpeiyangJieguoTypes;
    }


    /**
	 * 获取：培养结果
	 */

    public void setShixishengpeiyangJieguoTypes(Integer shixishengpeiyangJieguoTypes) {
        this.shixishengpeiyangJieguoTypes = shixishengpeiyangJieguoTypes;
    }
    /**
	 * 设置：培养评语
	 */
    public String getShixishengpeiyangPingyuContent() {
        return shixishengpeiyangPingyuContent;
    }


    /**
	 * 获取：培养评语
	 */

    public void setShixishengpeiyangPingyuContent(String shixishengpeiyangPingyuContent) {
        this.shixishengpeiyangPingyuContent = shixishengpeiyangPingyuContent;
    }
    /**
	 * 设置：上传时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：上传时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间  show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show3 listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
