package cn.jbit.bean;

// Generated 2017-3-1 15:51:07 by Hibernate Tools 3.4.0.CR1

/**
 * Inventory generated by hbm2java
 */
public class Inventory implements java.io.Serializable {

	private String id;
	private String goodsId;
	private Integer num;
	private String state;

	public Inventory() {
	}

	public Inventory(String id) {
		this.id = id;
	}

	public Inventory(String id, String goodsId, Integer num, String state) {
		this.id = id;
		this.goodsId = goodsId;
		this.num = num;
		this.state = state;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public Integer getNum() {
		return this.num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

}