package com.atguigu.day17;

/*
 * Java中的注释：
 * 	（1）单行注释
 * 	（2）多行注释
 * 	（3）文档注释，Java特有
 * 	需要配合注解使用
 * 
 * 	二、用于文档注释的注解
 * 	@author
 * 	@version
 * 	@since
 * 	.....
 * 
 * 	@param
 * 	(1)必须该方法有形参，才能写，有几个形参，写几个
 * 	(2)@param  形参名  形参数据类型  解释
 * 	@return
 * 	(1)必须方法的返回值类型不是void，一个方法@return最多有一个
 * 	(2)@return  返回值类型  解释
 * 	@throws
 * 	(1)必须方法throws异常，有几个写几个
 * 	(2)@throws 类型  解释
 * 
 */

/**
 * @author LHF
 * @version jdk1.8
 * @since jdk1.5
 *
 */
public class TestDoc {
	/**
	 * 	这是主方法，是Java程序的入口
	 * @param args String[] 命令行参数
	 */
	public static void main(String[] args) {
		
	}
	
	/**
	 * 	求两个整数的最大值
	 * @param a int 其中一个整数
	 * @param b	int 另一个整数
	 * @return int 返回a,b中较大者
	 */
	public static int getMax(int a, int b) {
		return a>b?a:b;//三目运算符
	}
	
	/**
	 * 	求两个整数的商
	 * @param a int 被除数
	 * @param b int 除数
	 * @return int 商，只保留整数部分
	 * @throws RuntimeException 当除数为0时，会抛出异常
	 */
	public static int divide(int a, int b) throws RuntimeException{
		if (b == 0) {
			throw new RuntimeException("除数不能为0");
		}
		return a/b;
	}

}
