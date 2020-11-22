package com.study.extra;

import java.util.Scanner;

public class ForBreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//两个数的最大公约数和最小公倍数
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int m = scanner.nextInt();
			int n = scanner.nextInt();
			
			//获取两个整数中的较大值、最小值
			int min = (m < n)? m : n;
			int max = (m > n)? m : n;
			
			for (int i = min; i > 0; i--) {
				if(min % i == 0 && max % i ==0) {
						System.out.println("最大公约数为：" + i);
						break;//一旦执行此结构，则退出循环
				}
			}
			
			for (int i = min; i <= max * min; i++) {
				if (i % min == 0 && i % max == 0) {
						System.out.println("最小公倍数为：" + i);
						break;
				}
			}
			
			
		}
		scanner.close();
	}

}
