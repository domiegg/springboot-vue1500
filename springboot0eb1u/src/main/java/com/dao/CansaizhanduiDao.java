package com.dao;

import com.entity.CansaizhanduiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CansaizhanduiVO;
import com.entity.view.CansaizhanduiView;


/**
 * 参赛战队
 * 
 * @author 
 * @email 
 * @date 2022-04-20 11:00:01
 */
public interface CansaizhanduiDao extends BaseMapper<CansaizhanduiEntity> {
	
	List<CansaizhanduiVO> selectListVO(@Param("ew") Wrapper<CansaizhanduiEntity> wrapper);
	
	CansaizhanduiVO selectVO(@Param("ew") Wrapper<CansaizhanduiEntity> wrapper);
	
	List<CansaizhanduiView> selectListView(@Param("ew") Wrapper<CansaizhanduiEntity> wrapper);

	List<CansaizhanduiView> selectListView(Pagination page,@Param("ew") Wrapper<CansaizhanduiEntity> wrapper);
	
	CansaizhanduiView selectView(@Param("ew") Wrapper<CansaizhanduiEntity> wrapper);
	

}
