package client;

import impl.Order;
import interfaces.OrderApi;
import proxy.DynamicProxy;

public class DynamicProxyClient {

	public static void main(String[] args) {
		// 張三先登入系統建立了一個定單
		Order order = new Order("設計模式", 100, "張三");
		
		// 建立一個動態代理
		DynamicProxy dynamicProxy = new DynamicProxy();
		// 把訂單跟動態代理關聯起來
		OrderApi orderApi = dynamicProxy.getProxyInterface(order);
		// 李四想要來修改 就會有警告訊息
		orderApi.setOrderNum(123, "李四");

		System.out.println("李四修改後訂單紀錄沒有變化:" + orderApi);

		// 張三要來修改 不會有警告訊息
		orderApi.setOrderNum(123, "張三");

		System.out.println("張三修改後,訂單紀錄:" + orderApi);
		
	}
}
