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


import com.dao.ShenqinghezuoDao;
import com.entity.ShenqinghezuoEntity;
import com.service.ShenqinghezuoService;
import com.entity.vo.ShenqinghezuoVO;
import com.entity.view.ShenqinghezuoView;

@Service("shenqinghezuoService")
public class ShenqinghezuoServiceImpl extends ServiceImpl<ShenqinghezuoDao, ShenqinghezuoEntity> implements ShenqinghezuoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShenqinghezuoEntity> page = this.selectPage(
                new Query<ShenqinghezuoEntity>(params).getPage(),
                new EntityWrapper<ShenqinghezuoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShenqinghezuoEntity> wrapper) {
		  Page<ShenqinghezuoView> page =new Query<ShenqinghezuoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShenqinghezuoVO> selectListVO(Wrapper<ShenqinghezuoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShenqinghezuoVO selectVO(Wrapper<ShenqinghezuoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShenqinghezuoView> selectListView(Wrapper<ShenqinghezuoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShenqinghezuoView selectView(Wrapper<ShenqinghezuoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
