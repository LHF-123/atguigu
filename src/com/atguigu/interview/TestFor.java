package com.atguigu.interview;

/*
 * 	for循环的执行过程：
 * 	for(初始化表达式①;循环条件②;迭代表达式③){
 * 		循环体语句④
 * 	}
 * 
 * 	（1）初始化表达式①
 * 	（2）循环条件②
 * 	（3）如果成立，执行循环体语句④，继续迭代表达式③，回到（2）
 * 		如果不成立，直接结束for
 */
public class TestFor {

	static boolean foo(char c) {
		System.out.println(c);
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		for (foo('A'); foo('B') && i < 2; foo('C')) {
			i++;
			foo('D');
		}
		/*
		 * (1)foo('A')				-->A
		 * (2)foo('B') && i < 2		-->B
		 * (3)i++; foo('D');		-->D i=1
		 * (4)foo('C')				-->C
		 * (5)foo('B') && i < 2		-->B
		 * (6)i++; foo('D');		-->D i=2
		 * (7)foo('C')				-->C
		 * (8)foo('B') && i < 2		-->B  因为i < 2不满足，结束循环
		 */
	}

}
