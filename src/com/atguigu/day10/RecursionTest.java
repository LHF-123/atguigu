package com.atguigu.day10;
/*
 * 递归方法：一个方法体内调用它自身
 * 	方法递归包含了一种隐式的循环，它会重复执行某段代码，但这种重复执行无需循环控制。
 * 	递归一定要向已知的方向递归，否则这种就变成了无穷递归，类似于死循环。
 */
public class RecursionTest {
	
	public static void main(String[] args) {
		RecursionTest test = new RecursionTest();
		int sum = test.getSum(100);
		System.out.println(sum);
		
		int result = test.getResult(5);
		System.out.println(result);
		
		int func = test.func(10);
		System.out.println(func);
	}
	
	//举例1：求100以内的自然数的和
	public int getSum(int number) {
		
		if (number == 1) {
			return 1;
		}else {
			return number + getSum(number - 1);
		}
		
	}
	
	//举例2:求n！( == n * (n - 1)! )
	public int getResult(int number) {
		
		if (number == 1) {
			return 1;
		}else {
			return number * getResult(number - 1);
		}
		
	}
	
	//举例3：已知一个数列：f(0) = 1,f(1) = 4,f(n+2) = 2*f(n+1) + f(n),
	//	其中n是大于0的整数，求f(10)的值。
	public int func(int n) {
		if (n == 0) {
			return 1;
		}else if (n == 1) {
			return 4;
		}else {
			return 2 * func(n - 1) + func(n - 2);
			//return func(n + 2) - 2 * func(n + 1);
		}
	}
	
}
