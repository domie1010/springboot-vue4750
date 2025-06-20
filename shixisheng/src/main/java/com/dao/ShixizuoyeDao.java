package com.dao;

import com.entity.ShixizuoyeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShixizuoyeView;

/**
 * 实习作业 Dao 接口
 *
 * @author 
 */
public interface ShixizuoyeDao extends BaseMapper<ShixizuoyeEntity> {

   List<ShixizuoyeView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
