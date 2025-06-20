package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 实习生培养记录
 *
 * @author 
 * @email
 */
@TableName("shixishengpeiyang")
public class ShixishengpeiyangEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShixishengpeiyangEntity() {

	}

	public ShixishengpeiyangEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 用户
     */
    @ColumnInfo(comment="用户",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 实习生培养记录编号
     */
    @ColumnInfo(comment="实习生培养记录编号",type="varchar(200)")
    @TableField(value = "shixishengpeiyang_uuid_number")

    private String shixishengpeiyangUuidNumber;


    /**
     * 实习生培养标题
     */
    @ColumnInfo(comment="实习生培养标题",type="varchar(200)")
    @TableField(value = "shixishengpeiyang_name")

    private String shixishengpeiyangName;


    /**
     * 培养地点
     */
    @ColumnInfo(comment="培养地点",type="varchar(200)")
    @TableField(value = "shixishengpeiyang_address")

    private String shixishengpeiyangAddress;


    /**
     * 培养类型
     */
    @ColumnInfo(comment="培养类型",type="int(11)")
    @TableField(value = "shixishengpeiyang_types")

    private Integer shixishengpeiyangTypes;


    /**
     * 培养时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="培养时间",type="timestamp")
    @TableField(value = "shixishengpeiyang_time")

    private Date shixishengpeiyangTime;


    /**
     * 培养内容
     */
    @ColumnInfo(comment="培养内容",type="longtext")
    @TableField(value = "shixishengpeiyang_content")

    private String shixishengpeiyangContent;


    /**
     * 打分
     */
    @ColumnInfo(comment="打分",type="decimal(10,2)")
    @TableField(value = "shixishengpeiyang_dafen")

    private Double shixishengpeiyangDafen;


    /**
     * 培养结果
     */
    @ColumnInfo(comment="培养结果",type="int(11)")
    @TableField(value = "shixishengpeiyang_jieguo_types")

    private Integer shixishengpeiyangJieguoTypes;


    /**
     * 培养评语
     */
    @ColumnInfo(comment="培养评语",type="longtext")
    @TableField(value = "shixishengpeiyang_pingyu_content")

    private String shixishengpeiyangPingyuContent;


    /**
     * 上传时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="上传时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间   listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 获取：创建时间   listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间   listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Shixishengpeiyang{" +
            ", id=" + id +
            ", yonghuId=" + yonghuId +
            ", shixishengpeiyangUuidNumber=" + shixishengpeiyangUuidNumber +
            ", shixishengpeiyangName=" + shixishengpeiyangName +
            ", shixishengpeiyangAddress=" + shixishengpeiyangAddress +
            ", shixishengpeiyangTypes=" + shixishengpeiyangTypes +
            ", shixishengpeiyangTime=" + DateUtil.convertString(shixishengpeiyangTime,"yyyy-MM-dd") +
            ", shixishengpeiyangContent=" + shixishengpeiyangContent +
            ", shixishengpeiyangDafen=" + shixishengpeiyangDafen +
            ", shixishengpeiyangJieguoTypes=" + shixishengpeiyangJieguoTypes +
            ", shixishengpeiyangPingyuContent=" + shixishengpeiyangPingyuContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
