package interfaces;

public interface OrderApi {
	/***
	 * 獲得訂單訂購的產品名稱
	 * 
	 * @return 訂單訂購的產品名稱
	 */
	public String getProductName();

	/**
	 * 設定訂單訂購的產品名稱
	 * 
	 * @param productName 訂單訂購的產品名稱
	 * @param user        操作人員
	 */
	public void setProductName(String productName, String user);

	/**
	 * 獲得訂單訂購的數量
	 * 
	 * @return 訂單訂購的數量
	 */
	public int getOrderNum();

	/**
	 * 設定訂單訂購的數量
	 * 
	 * @param orderNum 訂單訂購的數量
	 * @param user     操作人員
	 */
	public void setOrderNum(int orderNum, String user);

	/**
	 * 獲得建立訂單的人員
	 * 
	 * @return 建立訂單的人員
	 */
	public String getOrderUser();

	/**
	 * 設定建立訂單的人員
	 * 
	 * @param orderUser 設定建立訂單的人員
	 * @param user      操作人員
	 */
	public void setOrderUser(String orderUser, String user);

}
