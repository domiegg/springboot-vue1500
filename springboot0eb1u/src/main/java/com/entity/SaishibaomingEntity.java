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
 * 赛事报名
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-20 11:00:01
 */
@TableName("saishibaoming")
public class SaishibaomingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public SaishibaomingEntity() {
		
	}
	
	public SaishibaomingEntity(T t) {
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
