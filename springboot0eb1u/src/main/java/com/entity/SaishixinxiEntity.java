package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 赛事信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-20 11:00:01
 */
@TableName("saishixinxi")
public class SaishixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public SaishixinxiEntity() {
		
	}
	
	public SaishixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 赛事名称
	 */
					
	private String saishimingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date kaishiriqi;
	
	/**
	 * 结束日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：赛事名称
	 */
	public void setSaishimingcheng(String saishimingcheng) {
		this.saishimingcheng = saishimingcheng;
	}
	/**
	 * 获取：赛事名称
	 */
	public String getSaishimingcheng() {
		return saishimingcheng;
	}
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
