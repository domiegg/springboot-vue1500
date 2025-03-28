package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CansaizhanduiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CansaizhanduiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CansaizhanduiView;


/**
 * 参赛战队
 *
 * @author 
 * @email 
 * @date 2022-04-20 11:00:01
 */
public interface CansaizhanduiService extends IService<CansaizhanduiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CansaizhanduiVO> selectListVO(Wrapper<CansaizhanduiEntity> wrapper);
   	
   	CansaizhanduiVO selectVO(@Param("ew") Wrapper<CansaizhanduiEntity> wrapper);
   	
   	List<CansaizhanduiView> selectListView(Wrapper<CansaizhanduiEntity> wrapper);
   	
   	CansaizhanduiView selectView(@Param("ew") Wrapper<CansaizhanduiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CansaizhanduiEntity> wrapper);
   	

}

