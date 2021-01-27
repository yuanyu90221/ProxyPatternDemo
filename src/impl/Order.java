package impl;

import interfaces.OrderApi;

public class Order implements OrderApi {
	/**
	 * 訂單訂購的產品名稱
	 */
	private String productName;
	/**
	 * 訂單訂購的數量
	 */
	private int orderNum;
	/**
	 * 建立訂單的人員
	 */
	private String orderUser;

	public Order(String productName, int orderNum, String orderUser) {
		this.productName = productName;
		this.orderNum = orderNum;
		this.orderUser = orderUser;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName, String user) {
		this.productName = productName;
	}

	public int getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(int orderNum, String user) {
		this.orderNum = orderNum;
	}

	public String getOrderUser() {
		return orderUser;
	}

	public void setOrderUser(String orderUser, String user) {
		this.orderUser = orderUser;
	}

	@Override
	public String toString() {
		return "Order [productName=" + productName + ", orderNum=" + orderNum + ", orderUser=" + orderUser + "]";
	}
	
}
