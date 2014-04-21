package com.jshop.entity;

// Generated 2014-4-8 22:52:16 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * GoodsTwocodeRpT generated by hbm2java
 */
@Entity
@Table(name = "goods_twocode_rp_t", catalog = "jshoper3")
public class GoodsTwocodeRpT implements java.io.Serializable {

	private String id;
	private String goodsid;
	private String productname;
	private String twocodepath;
	private String state;
	private String productid;

	public GoodsTwocodeRpT() {
	}

	public GoodsTwocodeRpT(String id, String goodsid, String productname,
			String twocodepath, String state, String productid) {
		this.id = id;
		this.goodsid = goodsid;
		this.productname = productname;
		this.twocodepath = twocodepath;
		this.state = state;
		this.productid = productid;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, length = 20)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "GOODSID", nullable = false, length = 20)
	public String getGoodsid() {
		return this.goodsid;
	}

	public void setGoodsid(String goodsid) {
		this.goodsid = goodsid;
	}

	@Column(name = "PRODUCTNAME", nullable = false, length = 100)
	public String getProductname() {
		return this.productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	@Column(name = "TWOCODEPATH", nullable = false)
	public String getTwocodepath() {
		return this.twocodepath;
	}

	public void setTwocodepath(String twocodepath) {
		this.twocodepath = twocodepath;
	}

	@Column(name = "STATE", nullable = false, length = 1)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "PRODUCTID", nullable = false, length = 20)
	public String getProductid() {
		return this.productid;
	}

	public void setProductid(String productid) {
		this.productid = productid;
	}

}
