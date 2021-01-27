package client;

import impl.Order;
import proxy.OrderExtProxy;

public class OrderExtClient {

	public static void main(String[] args) {
		// 張三先登入系統建立了一個定單
		Order order = new OrderExtProxy("設計模式", 100, "張三");

		// 李四想要來修改 就會有警告訊息
		order.setOrderNum(123, "李四");

		System.out.println("李四修改後訂單紀錄沒有變化:" + order);

		// 張三要來修改 不會有警告訊息
		order.setOrderNum(123, "張三");

		System.out.println("張三修改後,訂單紀錄:" + order);

	}

}
