package com.atguigu.day24;

/*
 * 	自定义异常：
 * 	（1）继承Throwable或它的子类
 * 	（2）建议保留两个构造器
 * 	（3）增加序列化版本ID
 * 	（4）自定义异常只能用throw抛出
 */
public class MyException extends Throwable{

	private static final long serialVersionUID = 1L;

	public MyException() {
		super();
	}

	public MyException(String message) {
		super(message);
	}
	
}
