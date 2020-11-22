package com.study.extra;

public class ForForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 嵌套循环的使用
		 * 1.嵌套循环：将一个循环结构a声明在另一个循环结构b的循环体内，就构成了嵌套循环（或多重循环）
		 * 
		 */
		
		/* 输出下面的内容	i	j
		 * 	*			1	1
		 * 	**			2	2
		 * 	***			3	3
		 * 	****		4	4
		 */
		for(int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

		/* 输出下面的内容	i	j
		 * 	****		1	4
		 * 	***			2	3
		 * 	**			3	2
		 * 	*			4	1
		 */
		for(int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
