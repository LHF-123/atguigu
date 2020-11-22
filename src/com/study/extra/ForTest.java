package com.study.extra;

import java.util.Scanner;

public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		for (System.out.print('a'); num <= 3; System.out.print('b'),num++) {
			System.out.print('c');
		}//acbcbcb
		
		//1~150如果是3的倍数加foo，5的倍数加biz，7的倍数加baz
		for (int i = 1; i <= 150; i++) {
			System.out.print(i);
			if(i % 3 == 0) {
				System.out.print(" foo");
			}
			if (i % 5 == 0) {
				System.out.print(" biz");
			}
			if (i % 7 == 0) {
				System.out.print(" baz");
			}
			System.out.println();
		}
		
		//100以内7的倍数的个数和总和
		int sum = 0, count = 0;
		for (int j = 1; j <= 100; j++) {
			if(j % 7 == 0) {
				sum += j;
				count++;
			}
		}
		System.out.println("100以内7的倍数的总和为" + sum);
		System.out.println("100以内7的倍数的个数为" + count);
		
		
		//两个数的最大公约数和最小公倍数，简便的看ForBreakTest.java
		Scanner scanner = new Scanner(System.in);
		int m, n;
		while(scanner.hasNext()) {
			m = scanner.nextInt();
			n = scanner.nextInt();
			int count1 = 1,count2 = 1;
			if(m >= n) {
				for (int i = n; i > 0; i--) {
					if(n % i == 0 && m % i ==0) {
						
						if (count1 == 1) {
							System.out.println("最大公约数为：" + i);
						}
						count1++;
					}
				}
				for (int i = n; i <= m * n; i++) {
					if (i % n == 0 && i % m == 0) {
						
						if (count2 == 1) {
							System.out.println("最小公倍数为：" + i);
						}
						count2++;
					}
				}
			}
			
			if(n >= m) {
				for (int i = m; i > 0; i--) {
					if(n % i == 0 && m % i ==0) {
						if (count1 == 1) {
							System.out.println("最大公约数为：" + i);
						}
						count1++;
					}
				}
				for (int i = m; i <= m * n; i++) {
					if (i % n == 0 && i % m == 0) {
						
						if (count2 == 1) {
							System.out.println("最小公倍数为：" + i);
						}
						count2++;
					}
				}
			}
			
			
		}
		
		
		
		scanner.close();
	}

}
