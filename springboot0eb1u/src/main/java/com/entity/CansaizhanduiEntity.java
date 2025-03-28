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
 * 参赛战队
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-20 11:00:01
 */
@TableName("cansaizhandui")
public class CansaizhanduiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CansaizhanduiEntity() {
		
	}
	
	public CansaizhanduiEntity(T t) {
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
	 * 参赛账号
	 */
					
	private String cansaizhanghao;
	
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
