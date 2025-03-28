package com.entity.view;

import com.entity.CansaizhanduiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 参赛战队
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-20 11:00:01
 */
@TableName("cansaizhandui")
public class CansaizhanduiView  extends CansaizhanduiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CansaizhanduiView(){
	}
 
 	public CansaizhanduiView(CansaizhanduiEntity cansaizhanduiEntity){
 	try {
			BeanUtils.copyProperties(this, cansaizhanduiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
