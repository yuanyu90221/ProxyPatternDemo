package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import impl.Order;
import interfaces.OrderApi;

public class DynamicProxy implements InvocationHandler {

	/**
	 * 被代理的物件
	 */
	private OrderApi order = null;
	
	/**
	 * 
	 * @param order
	 * @return 
	 */
	public OrderApi getProxyInterface(Order order) {
		// 設定被代理的物件 讓invoke使用
		this.order = order;
		// 把真正的訂單物件跟動態代理關聯起來
		OrderApi orderApi = (OrderApi) Proxy.newProxyInstance(order.getClass().getClassLoader(),
				order.getClass().getInterfaces(), this);
		return orderApi;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// 如果是呼叫setter方法就需要檢查許可權
		if (method.getName().startsWith("set")) {
			// 如果不是建立人 那就不能修改
			if (order.getOrderUser()!= null && order.getOrderUser().equals(args[1])) {
				return method.invoke(order, args);
			} else {
				System.out.println("Sorry," + args[1] + ", you don't have permission to change this data");
			}
		} else {
			// 不是呼叫 setter方法 就繼續執行
			return method.invoke(order, args);
		}
		return null;
	}

}
