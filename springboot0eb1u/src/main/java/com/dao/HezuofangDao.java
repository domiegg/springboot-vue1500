package com.dao;

import com.entity.HezuofangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HezuofangVO;
import com.entity.view.HezuofangView;


/**
 * 合作方
 * 
 * @author 
 * @email 
 * @date 2022-04-20 11:00:01
 */
public interface HezuofangDao extends BaseMapper<HezuofangEntity> {
	
	List<HezuofangVO> selectListVO(@Param("ew") Wrapper<HezuofangEntity> wrapper);
	
	HezuofangVO selectVO(@Param("ew") Wrapper<HezuofangEntity> wrapper);
	
	List<HezuofangView> selectListView(@Param("ew") Wrapper<HezuofangEntity> wrapper);

	List<HezuofangView> selectListView(Pagination page,@Param("ew") Wrapper<HezuofangEntity> wrapper);
	
	HezuofangView selectView(@Param("ew") Wrapper<HezuofangEntity> wrapper);
	

}
