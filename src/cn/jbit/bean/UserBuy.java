package cn.jbit.bean;

// Generated 2017-3-1 15:51:07 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;

/**
 * UserBuy generated by hbm2java
 */
public class UserBuy implements java.io.Serializable {

	private String buyId;
	private Date buyTime;
	private String bonusUserId;
	private String userId;
	private BigDecimal buyPv;
	private BigDecimal bonusRate;
	private BigDecimal bonusPv;

	public UserBuy() {
	}

	public UserBuy(String buyId) {
		this.buyId = buyId;
	}

	public UserBuy(String buyId, Date buyTime, String bonusUserId,
			String userId, BigDecimal buyPv, BigDecimal bonusRate,
			BigDecimal bonusPv) {
		this.buyId = buyId;
		this.buyTime = buyTime;
		this.bonusUserId = bonusUserId;
		this.userId = userId;
		this.buyPv = buyPv;
		this.bonusRate = bonusRate;
		this.bonusPv = bonusPv;
	}

	public String getBuyId() {
		return this.buyId;
	}

	public void setBuyId(String buyId) {
		this.buyId = buyId;
	}

	public Date getBuyTime() {
		return this.buyTime;
	}

	public void setBuyTime(Date buyTime) {
		this.buyTime = buyTime;
	}

	public String getBonusUserId() {
		return this.bonusUserId;
	}

	public void setBonusUserId(String bonusUserId) {
		this.bonusUserId = bonusUserId;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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
