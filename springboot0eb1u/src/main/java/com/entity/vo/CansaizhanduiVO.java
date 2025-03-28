package com.entity.vo;

import com.entity.CansaizhanduiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 参赛战队
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-20 11:00:01
 */
public class CansaizhanduiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 战队名称
	 */
	
	private String zhanduimingcheng;
		
	/**
	 * 头像
	 */
	
	private String touxiang;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
		
	/**
	 * 邮箱
	 */
	
	private String youxiang;
		
	/**
	 * 所属国家
	 */
	
	private String suoshuguojia;
				
	
	/**
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
				
	
	/**
	 * 设置：战队名称
	 */
	 
	public void setZhanduimingcheng(String zhanduimingcheng) {
		this.zhanduimingcheng = zhanduimingcheng;
	}
	
	/**
	 * 获取：战队名称
	 */
	public String getZhanduimingcheng() {
		return zhanduimingcheng;
	}
				
	
	/**
	 * 设置：头像
	 */
	 
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}
				
	
	/**
	 * 设置：联系方式
	 */
	 
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
				
	
	/**
	 * 设置：邮箱
	 */
	 
	public void setYouxiang(String youxiang) {
		this.youxiang = youxiang;
	}
	
	/**
	 * 获取：邮箱
	 */
	public String getYouxiang() {
		return youxiang;
	}
				
	
	/**
	 * 设置：所属国家
	 */
	 
	public void setSuoshuguojia(String suoshuguojia) {
		this.suoshuguojia = suoshuguojia;
	}
	
	/**
	 * 获取：所属国家
	 */
	public String getSuoshuguojia() {
		return suoshuguojia;
	}
			
}
