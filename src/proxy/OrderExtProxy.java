package proxy;

import impl.Order;

public class OrderExtProxy extends Order {

	public OrderExtProxy(String productName, int orderNum, String orderUser) {
		super(productName, orderNum, orderUser);
	}

	public void setProductName(String productName, String user) {
		// 控制存取權限
		if (user != null && user.equals(this.getOrderUser())) {
			super.setProductName(productName, user);
		} else {
			System.out.println("Sorry, " + user + ", you don't have permission to set productName");
		}
	}

	public void setOrderNum(int orderNum, String user) {
		// 控制存取權限
		if (user != null && user.equals(this.getOrderUser())) {
			super.setOrderNum(orderNum, user);
		} else {
			System.out.println("Sorry, " + user + ", you don't have permission to set orderNum");
		}
	}

	public void setOrderUser(String orderUser, String user) {
		// 控制存取權限
		if (user != null && user.equals(this.getOrderUser())) {
			super.setOrderUser(orderUser, user);
		} else {
			System.out.println("Sorry, " + user + ", you don't have permission to set order");
		}
	}

	@Override
	public String toString() {
		return "OrderExtProxy [getProductName()=" + getProductName() + ", getOrderNum()=" + getOrderNum()
				+ ", getOrderUser()=" + getOrderUser() + "]";
	}
	
	
}
