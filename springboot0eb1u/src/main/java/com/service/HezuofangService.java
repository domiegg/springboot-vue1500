package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HezuofangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HezuofangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HezuofangView;


/**
 * 合作方
 *
 * @author 
 * @email 
 * @date 2022-04-20 11:00:01
 */
public interface HezuofangService extends IService<HezuofangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HezuofangVO> selectListVO(Wrapper<HezuofangEntity> wrapper);
   	
   	HezuofangVO selectVO(@Param("ew") Wrapper<HezuofangEntity> wrapper);
   	
   	List<HezuofangView> selectListView(Wrapper<HezuofangEntity> wrapper);
   	
   	HezuofangView selectView(@Param("ew") Wrapper<HezuofangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HezuofangEntity> wrapper);
   	

}

