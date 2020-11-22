package com.atguigu.day18;

/*
 * 	（1）关于serialVersionUID
 * 	（2）throws和throw？是否要一起使用
 * 
 * 	语法上没有要求他俩一定要一起使用：
 * 	throw + try...catch
 * 	throw(当前方法抛出) + throws(给上级处理)（这种最常见）上级接着throws还是try...catch那是他的选择
 * 
 * 	（3）如果你暂时不清楚具体的异常类型，一般可以throw RuntimeException或throw Exception的对象
 * 		如果你清楚当前的具体异常类型，那么抛出具体的异常类型会更好，信息更明确
 * 
 */
public class TestQuestion {

}
class MyException extends Exception{

	//（1）这个是IO流里面的知识，在对象序列化时才会用到
	private static final long serialVersionUID = 1L;
	
}
