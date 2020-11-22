package com.study.extra;

public class BreakContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 			使用范围			循环结构中作用		相同点
		 * break	switch-case		结束当前循环		关键字后面不可声明表达式或语句。因为不可执行
		 * 			循环结构中
		 * 
		 * continue 循环结构中			结束当次循环		关键字后面不可声明表达式或语句。因为不可执行
		 * 
		 */
		
		for (int i = 1; i <= 10; i++) {
			
			if(i % 4 == 0) {
				//break;//123
				continue;//123567910
			}
			System.out.println(i);
			
		}
		System.out.println();
		
		
		System.out.println("*******************");
		
		label:for (int i = 1; i <= 4; i++) {
			
			for (int j = 1; j < 10; j++) {
				
				if (j % 4 == 0) {
					//break label;//显式的表示结束指定层次上的循环
					continue label;
				}
				System.out.print(j);
				
			}
			System.out.println();
		}
		
	}

}
