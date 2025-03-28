package com.entity.view;

import com.entity.ShenqinghezuoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 申请合作
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-20 11:00:01
 */
@TableName("shenqinghezuo")
public class ShenqinghezuoView  extends ShenqinghezuoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShenqinghezuoView(){
	}
 
 	public ShenqinghezuoView(ShenqinghezuoEntity shenqinghezuoEntity){
 	try {
			BeanUtils.copyProperties(this, shenqinghezuoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
