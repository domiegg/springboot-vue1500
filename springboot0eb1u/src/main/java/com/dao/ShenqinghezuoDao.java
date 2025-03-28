package com.dao;

import com.entity.ShenqinghezuoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShenqinghezuoVO;
import com.entity.view.ShenqinghezuoView;


/**
 * 申请合作
 * 
 * @author 
 * @email 
 * @date 2022-04-20 11:00:01
 */
public interface ShenqinghezuoDao extends BaseMapper<ShenqinghezuoEntity> {
	
	List<ShenqinghezuoVO> selectListVO(@Param("ew") Wrapper<ShenqinghezuoEntity> wrapper);
	
	ShenqinghezuoVO selectVO(@Param("ew") Wrapper<ShenqinghezuoEntity> wrapper);
	
	List<ShenqinghezuoView> selectListView(@Param("ew") Wrapper<ShenqinghezuoEntity> wrapper);

	List<ShenqinghezuoView> selectListView(Pagination page,@Param("ew") Wrapper<ShenqinghezuoEntity> wrapper);
	
	ShenqinghezuoView selectView(@Param("ew") Wrapper<ShenqinghezuoEntity> wrapper);
	

}
