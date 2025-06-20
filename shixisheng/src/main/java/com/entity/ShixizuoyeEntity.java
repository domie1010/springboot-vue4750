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
 * 实习作业
 *
 * @author 
 * @email
 */
@TableName("shixizuoye")
public class ShixizuoyeEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShixizuoyeEntity() {

	}

	public ShixizuoyeEntity(T t) {
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
     * 实习作业编号
     */
    @ColumnInfo(comment="实习作业编号",type="varchar(200)")
    @TableField(value = "shixizuoye_uuid_number")

    private String shixizuoyeUuidNumber;


    /**
     * 实习作业标题
     */
    @ColumnInfo(comment="实习作业标题",type="varchar(200)")
    @TableField(value = "shixizuoye_name")

    private String shixizuoyeName;


    /**
     * 作业描述
     */
    @ColumnInfo(comment="作业描述",type="longtext")
    @TableField(value = "shixizuoye_content")

    private String shixizuoyeContent;


    /**
     * 作业文件
     */
    @ColumnInfo(comment="作业文件",type="varchar(200)")
    @TableField(value = "shixizuoye_file")

    private String shixizuoyeFile;


    /**
     * 上传时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="上传时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 作业打分
     */
    @ColumnInfo(comment="作业打分",type="decimal(10,2)")
    @TableField(value = "shixizuoye_old_money")

    private Double shixizuoyeOldMoney;


    /**
     * 作业评语
     */
    @ColumnInfo(comment="作业评语",type="longtext")
    @TableField(value = "shixizuoye_pingyu_content")

    private String shixizuoyePingyuContent;


    /**
     * 评论时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="评论时间",type="timestamp")
    @TableField(value = "update_time",fill = FieldFill.UPDATE)

    private Date updateTime;


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
        return "Shixizuoye{" +
            ", id=" + id +
            ", yonghuId=" + yonghuId +
            ", shixizuoyeUuidNumber=" + shixizuoyeUuidNumber +
            ", shixizuoyeName=" + shixizuoyeName +
            ", shixizuoyeContent=" + shixizuoyeContent +
            ", shixizuoyeFile=" + shixizuoyeFile +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", shixizuoyeOldMoney=" + shixizuoyeOldMoney +
            ", shixizuoyePingyuContent=" + shixizuoyePingyuContent +
            ", updateTime=" + DateUtil.convertString(updateTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
