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


import com.dao.HezuofangDao;
import com.entity.HezuofangEntity;
import com.service.HezuofangService;
import com.entity.vo.HezuofangVO;
import com.entity.view.HezuofangView;

@Service("hezuofangService")
public class HezuofangServiceImpl extends ServiceImpl<HezuofangDao, HezuofangEntity> implements HezuofangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HezuofangEntity> page = this.selectPage(
                new Query<HezuofangEntity>(params).getPage(),
                new EntityWrapper<HezuofangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HezuofangEntity> wrapper) {
		  Page<HezuofangView> page =new Query<HezuofangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HezuofangVO> selectListVO(Wrapper<HezuofangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HezuofangVO selectVO(Wrapper<HezuofangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HezuofangView> selectListView(Wrapper<HezuofangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HezuofangView selectView(Wrapper<HezuofangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
