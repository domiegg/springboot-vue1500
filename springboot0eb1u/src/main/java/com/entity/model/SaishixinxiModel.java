package com.entity.model;

import com.entity.SaishixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 赛事信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-20 11:00:01
 */
public class SaishixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 赛事图标
	 */
	
	private String saishitubiao;
		
	/**
	 * 赛事阶段
	 */
	
	private String saishijieduan;
		
	/**
	 * 举办地
	 */
	
	private String jubandi;
		
	/**
	 * 开始日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaishiriqi;
		
	/**
	 * 结束日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jieshuriqi;
		
	/**
	 * 报名状态
	 */
	
	private String baomingzhuangtai;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
				
	
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
	 * 设置：赛事阶段
	 */
	 
	public void setSaishijieduan(String saishijieduan) {
		this.saishijieduan = saishijieduan;
	}
	
	/**
	 * 获取：赛事阶段
	 */
	public String getSaishijieduan() {
		return saishijieduan;
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
	 * 设置：开始日期
	 */
	 
	public void setKaishiriqi(Date kaishiriqi) {
		this.kaishiriqi = kaishiriqi;
	}
	
	/**
	 * 获取：开始日期
	 */
	public Date getKaishiriqi() {
		return kaishiriqi;
	}
				
	
	/**
	 * 设置：结束日期
	 */
	 
	public void setJieshuriqi(Date jieshuriqi) {
		this.jieshuriqi = jieshuriqi;
	}
	
	/**
	 * 获取：结束日期
	 */
	public Date getJieshuriqi() {
		return jieshuriqi;
	}
				
	
	/**
	 * 设置：报名状态
	 */
	 
	public void setBaomingzhuangtai(String baomingzhuangtai) {
		this.baomingzhuangtai = baomingzhuangtai;
	}
	
	/**
	 * 获取：报名状态
	 */
	public String getBaomingzhuangtai() {
		return baomingzhuangtai;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
			
}
