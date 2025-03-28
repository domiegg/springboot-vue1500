package com.entity.model;

import com.entity.SaishibaomingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 赛事报名
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-20 11:00:01
 */
public class SaishibaomingModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 赛事图标
	 */
	
	private String saishitubiao;
		
	/**
	 * 举办地
	 */
	
	private String jubandi;
		
	/**
	 * 参赛账号
	 */
	
	private String cansaizhanghao;
		
	/**
	 * 战队名称
	 */
	
	private String zhanduimingcheng;
		
	/**
	 * 报名日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date baomingriqi;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：赛事图标
	 */
	 
	public void setSaishitubiao(String saishitubiao) {
		this.saishitubiao = saishitubiao;
	}
	
	/**
	 * 获取：赛事图标
	 */
	public String getSaishitubiao() {
		return saishitubiao;
	}
				
	
	/**
	 * 设置：举办地
	 */
	 
	public void setJubandi(String jubandi) {
		this.jubandi = jubandi;
	}
	
	/**
	 * 获取：举办地
	 */
	public String getJubandi() {
		return jubandi;
	}
				
	
	/**
	 * 设置：参赛账号
	 */
	 
	public void setCansaizhanghao(String cansaizhanghao) {
		this.cansaizhanghao = cansaizhanghao;
	}
	
	/**
	 * 获取：参赛账号
	 */
	public String getCansaizhanghao() {
		return cansaizhanghao;
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
	 * 设置：报名日期
	 */
	 
	public void setBaomingriqi(Date baomingriqi) {
		this.baomingriqi = baomingriqi;
	}
	
	/**
	 * 获取：报名日期
	 */
	public Date getBaomingriqi() {
		return baomingriqi;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
