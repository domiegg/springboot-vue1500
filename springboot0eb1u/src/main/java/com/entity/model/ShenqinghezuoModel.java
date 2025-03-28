package com.entity.model;

import com.entity.ShenqinghezuoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 申请合作
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-20 11:00:01
 */
public class ShenqinghezuoModel  implements Serializable {
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
	 * 公司账号
	 */
	
	private String gongsizhanghao;
		
	/**
	 * 公司名称
	 */
	
	private String gongsimingcheng;
		
	/**
	 * 策划书
	 */
	
	private String cehuashu;
		
	/**
	 * 合同
	 */
	
	private String hetong;
		
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
	 * 设置：公司账号
	 */
	 
	public void setGongsizhanghao(String gongsizhanghao) {
		this.gongsizhanghao = gongsizhanghao;
	}
	
	/**
	 * 获取：公司账号
	 */
	public String getGongsizhanghao() {
		return gongsizhanghao;
	}
				
	
	/**
	 * 设置：公司名称
	 */
	 
	public void setGongsimingcheng(String gongsimingcheng) {
		this.gongsimingcheng = gongsimingcheng;
	}
	
	/**
	 * 获取：公司名称
	 */
	public String getGongsimingcheng() {
		return gongsimingcheng;
	}
				
	
	/**
	 * 设置：策划书
	 */
	 
	public void setCehuashu(String cehuashu) {
		this.cehuashu = cehuashu;
	}
	
	/**
	 * 获取：策划书
	 */
	public String getCehuashu() {
		return cehuashu;
	}
				
	
	/**
	 * 设置：合同
	 */
	 
	public void setHetong(String hetong) {
		this.hetong = hetong;
	}
	
	/**
	 * 获取：合同
	 */
	public String getHetong() {
		return hetong;
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
