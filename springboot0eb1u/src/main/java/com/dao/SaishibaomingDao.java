package com.dao;

import com.entity.SaishibaomingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SaishibaomingVO;
import com.entity.view.SaishibaomingView;


/**
 * 赛事报名
 * 
 * @author 
 * @email 
 * @date 2022-04-20 11:00:01
 */
public interface SaishibaomingDao extends BaseMapper<SaishibaomingEntity> {
	
	List<SaishibaomingVO> selectListVO(@Param("ew") Wrapper<SaishibaomingEntity> wrapper);
	
	SaishibaomingVO selectVO(@Param("ew") Wrapper<SaishibaomingEntity> wrapper);
	
	List<SaishibaomingView> selectListView(@Param("ew") Wrapper<SaishibaomingEntity> wrapper);

	List<SaishibaomingView> selectListView(Pagination page,@Param("ew") Wrapper<SaishibaomingEntity> wrapper);
	
	SaishibaomingView selectView(@Param("ew") Wrapper<SaishibaomingEntity> wrapper);
	

}
