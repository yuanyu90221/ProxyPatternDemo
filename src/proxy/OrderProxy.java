package proxy;

import impl.Order;
import interfaces.OrderApi;

public class OrderProxy implements OrderApi {

	/**
	 * 持有被代理的實際目標物件
	 */
	private Order order = null;

	/**
	 * constructor,傳入被代理的實際目標物件
	 * 
	 * @param realSubject 被代理的實際目標物件
	 */
	public OrderProxy(Order realSubject) {
		this.order = realSubject;
	}

	@Override
	public void setProductName(String productName, String user) {
		// 控制存取權限
		if (user != null && user.equals(this.getOrderUser())) {
			order.setProductName(productName, user);
		} else {
			System.out.println("Sorry, " + user + ", you don't have permission to set productName");
		}
	}

	@Override
	public void setOrderNum(int orderNum, String user) {
		// 控制存取權限
		if (user != null && user.equals(this.getOrderUser())) {
			order.setOrderNum(orderNum, user);
		} else {
			System.out.println("Sorry, " + user + ", you don't have permission to set orderNum");
		}
	}

	@Override
	public void setOrderUser(String orderUser, String user) {
		// 控制存取權限
		if (user != null && user.equals(this.getOrderUser())) {
			order.setOrderUser(orderUser, user);
		} else {
			System.out.println("Sorry, " + user + ", you don't have permission to set order");
		}
	}

	@Override
	public String getOrderUser() {
		return this.order.getOrderUser();
	}

	@Override
	public String getProductName() {
		return this.order.getProductName();
	}

	@Override
	public int getOrderNum() {
		return this.order.getOrderNum();
	}
	
	@Override
	public String toString() {
		return "OrderProxy [" + ", getOrderUser()=" + getOrderUser() + ", getProductName()="
				+ getProductName() + ", getOrderNum()=" + getOrderNum() + "]";
	}
}
