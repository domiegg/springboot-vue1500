package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShenqinghezuoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShenqinghezuoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShenqinghezuoView;


/**
 * 申请合作
 *
 * @author 
 * @email 
 * @date 2022-04-20 11:00:01
 */
public interface ShenqinghezuoService extends IService<ShenqinghezuoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShenqinghezuoVO> selectListVO(Wrapper<ShenqinghezuoEntity> wrapper);
   	
   	ShenqinghezuoVO selectVO(@Param("ew") Wrapper<ShenqinghezuoEntity> wrapper);
   	
   	List<ShenqinghezuoView> selectListView(Wrapper<ShenqinghezuoEntity> wrapper);
   	
   	ShenqinghezuoView selectView(@Param("ew") Wrapper<ShenqinghezuoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShenqinghezuoEntity> wrapper);
   	

}

