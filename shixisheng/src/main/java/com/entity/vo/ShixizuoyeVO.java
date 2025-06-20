package com.entity.vo;

import com.entity.ShixizuoyeEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 实习作业
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shixizuoye")
public class ShixizuoyeVO implements Serializable {
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
     * 实习作业编号
     */

    @TableField(value = "shixizuoye_uuid_number")
    private String shixizuoyeUuidNumber;


    /**
     * 实习作业标题
     */

    @TableField(value = "shixizuoye_name")
    private String shixizuoyeName;


    /**
     * 作业描述
     */

    @TableField(value = "shixizuoye_content")
    private String shixizuoyeContent;


    /**
     * 作业文件
     */

    @TableField(value = "shixizuoye_file")
    private String shixizuoyeFile;


    /**
     * 上传时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 作业打分
     */

    @TableField(value = "shixizuoye_old_money")
    private Double shixizuoyeOldMoney;


    /**
     * 作业评语
     */

    @TableField(value = "shixizuoye_pingyu_content")
    private String shixizuoyePingyuContent;


    /**
     * 评论时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "update_time")
    private Date updateTime;


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
	 * 设置：实习作业编号
	 */
    public String getShixizuoyeUuidNumber() {
        return shixizuoyeUuidNumber;
    }


    /**
	 * 获取：实习作业编号
	 */

    public void setShixizuoyeUuidNumber(String shixizuoyeUuidNumber) {
        this.shixizuoyeUuidNumber = shixizuoyeUuidNumber;
    }
    /**
	 * 设置：实习作业标题
	 */
    public String getShixizuoyeName() {
        return shixizuoyeName;
    }


    /**
	 * 获取：实习作业标题
	 */

    public void setShixizuoyeName(String shixizuoyeName) {
        this.shixizuoyeName = shixizuoyeName;
    }
    /**
	 * 设置：作业描述
	 */
    public String getShixizuoyeContent() {
        return shixizuoyeContent;
    }


    /**
	 * 获取：作业描述
	 */

    public void setShixizuoyeContent(String shixizuoyeContent) {
        this.shixizuoyeContent = shixizuoyeContent;
    }
    /**
	 * 设置：作业文件
	 */
    public String getShixizuoyeFile() {
        return shixizuoyeFile;
    }


    /**
	 * 获取：作业文件
	 */

    public void setShixizuoyeFile(String shixizuoyeFile) {
        this.shixizuoyeFile = shixizuoyeFile;
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
	 * 设置：作业打分
	 */
    public Double getShixizuoyeOldMoney() {
        return shixizuoyeOldMoney;
    }


    /**
	 * 获取：作业打分
	 */

    public void setShixizuoyeOldMoney(Double shixizuoyeOldMoney) {
        this.shixizuoyeOldMoney = shixizuoyeOldMoney;
    }
    /**
	 * 设置：作业评语
	 */
    public String getShixizuoyePingyuContent() {
        return shixizuoyePingyuContent;
    }


    /**
	 * 获取：作业评语
	 */

    public void setShixizuoyePingyuContent(String shixizuoyePingyuContent) {
        this.shixizuoyePingyuContent = shixizuoyePingyuContent;
    }
    /**
	 * 设置：评论时间
	 */
    public Date getUpdateTime() {
        return updateTime;
    }


    /**
	 * 获取：评论时间
	 */

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
