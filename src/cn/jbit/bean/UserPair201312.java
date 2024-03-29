package cn.jbit.bean;

// Generated 2017-3-1 15:51:07 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;

/**
 * UserPair201312 generated by hbm2java
 */
public class UserPair201312 implements java.io.Serializable {

	private String pairId;
	private Date date;
	private String bonusUserId;
	private Integer leftUser;
	private Integer rightUser;
	private Integer leftKeep;
	private Integer rightKeep;
	private BigDecimal eachPv;
	private BigDecimal sumPairPv;
	private BigDecimal bonusRate;
	private BigDecimal bonusPv;

	public UserPair201312() {
	}

	public UserPair201312(String pairId) {
		this.pairId = pairId;
	}

	public UserPair201312(String pairId, Date date, String bonusUserId,
			Integer leftUser, Integer rightUser, Integer leftKeep,
			Integer rightKeep, BigDecimal eachPv, BigDecimal sumPairPv,
			BigDecimal bonusRate, BigDecimal bonusPv) {
		this.pairId = pairId;
		this.date = date;
		this.bonusUserId = bonusUserId;
		this.leftUser = leftUser;
		this.rightUser = rightUser;
		this.leftKeep = leftKeep;
		this.rightKeep = rightKeep;
		this.eachPv = eachPv;
		this.sumPairPv = sumPairPv;
		this.bonusRate = bonusRate;
		this.bonusPv = bonusPv;
	}

	public String getPairId() {
		return this.pairId;
	}

	public void setPairId(String pairId) {
		this.pairId = pairId;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getBonusUserId() {
		return this.bonusUserId;
	}

	public void setBonusUserId(String bonusUserId) {
		this.bonusUserId = bonusUserId;
	}

	public Integer getLeftUser() {
		return this.leftUser;
	}

	public void setLeftUser(Integer leftUser) {
		this.leftUser = leftUser;
	}

	public Integer getRightUser() {
		return this.rightUser;
	}

	public void setRightUser(Integer rightUser) {
		this.rightUser = rightUser;
	}

	public Integer getLeftKeep() {
		return this.leftKeep;
	}

	public void setLeftKeep(Integer leftKeep) {
		this.leftKeep = leftKeep;
	}

	public Integer getRightKeep() {
		return this.rightKeep;
	}

	public void setRightKeep(Integer rightKeep) {
		this.rightKeep = rightKeep;
	}

	public BigDecimal getEachPv() {
		return this.eachPv;
	}

	public void setEachPv(BigDecimal eachPv) {
		this.eachPv = eachPv;
	}

	public BigDecimal getSumPairPv() {
		return this.sumPairPv;
	}

	public void setSumPairPv(BigDecimal sumPairPv) {
		this.sumPairPv = sumPairPv;
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
