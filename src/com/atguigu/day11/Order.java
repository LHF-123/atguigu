package com.atguigu.day11;
/*
 * 测试：java规定的4种不同的权限修饰
 */
public class Order {

	
	private int orderPrivate;
	int orderDefault;
	public int orderPublic;
	
	private void methodPrivate() {
		orderPrivate = 1;
		orderDefault = 2;
		orderPublic = 3;
	}
	
	void methodDefault() {
		orderPrivate = 1;
		orderDefault = 2;
		orderPublic = 3;
		methodPrivate();
	}
	
	public void methodPublic() {
		orderPrivate = 1;
		orderDefault = 2;
		orderPublic = 3;
	}
	
}
