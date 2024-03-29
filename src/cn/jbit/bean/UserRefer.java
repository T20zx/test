package cn.jbit.bean;

// Generated 2017-3-1 15:51:07 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;

/**
 * UserRefer generated by hbm2java
 */
public class UserRefer implements java.io.Serializable {

	private String referLogId;
	private Date referTime;
	private String userId;
	private String referId;
	private BigDecimal buyPv;
	private BigDecimal bonusRate;
	private BigDecimal bonusPv;

	public UserRefer() {
	}

	public UserRefer(String referLogId) {
		this.referLogId = referLogId;
	}

	public UserRefer(String referLogId, Date referTime, String userId,
			String referId, BigDecimal buyPv, BigDecimal bonusRate,
			BigDecimal bonusPv) {
		this.referLogId = referLogId;
		this.referTime = referTime;
		this.userId = userId;
		this.referId = referId;
		this.buyPv = buyPv;
		this.bonusRate = bonusRate;
		this.bonusPv = bonusPv;
	}

	public String getReferLogId() {
		return this.referLogId;
	}

	public void setReferLogId(String referLogId) {
		this.referLogId = referLogId;
	}

	public Date getReferTime() {
		return this.referTime;
	}

	public void setReferTime(Date referTime) {
		this.referTime = referTime;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getReferId() {
		return this.referId;
	}

	public void setReferId(String referId) {
		this.referId = referId;
	}

	public BigDecimal getBuyPv() {
		return this.buyPv;
	}

	public void setBuyPv(BigDecimal buyPv) {
		this.buyPv = buyPv;
	}

	public BigDecimal getBonusRate() {
		return this.bonusRate;
	}

	public void setBonusRate(BigDecimal bonusRate) {
		this.bonusRate = bonusRate;
	}

	public BigDecimal getBonusPv() {
		return this.bonusPv;
	}

	public void setBonusPv(BigDecimal bonusPv) {
		this.bonusPv = bonusPv;
	}

}
