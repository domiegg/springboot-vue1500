package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.CansaizhanduiDao;
import com.entity.CansaizhanduiEntity;
import com.service.CansaizhanduiService;
import com.entity.vo.CansaizhanduiVO;
import com.entity.view.CansaizhanduiView;

@Service("cansaizhanduiService")
public class CansaizhanduiServiceImpl extends ServiceImpl<CansaizhanduiDao, CansaizhanduiEntity> implements CansaizhanduiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CansaizhanduiEntity> page = this.selectPage(
                new Query<CansaizhanduiEntity>(params).getPage(),
                new EntityWrapper<CansaizhanduiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CansaizhanduiEntity> wrapper) {
		  Page<CansaizhanduiView> page =new Query<CansaizhanduiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CansaizhanduiVO> selectListVO(Wrapper<CansaizhanduiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CansaizhanduiVO selectVO(Wrapper<CansaizhanduiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CansaizhanduiView> selectListView(Wrapper<CansaizhanduiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CansaizhanduiView selectView(Wrapper<CansaizhanduiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
