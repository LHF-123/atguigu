package com.study.extra;

import java.util.Scanner;

public class Day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			System.out.println("请输入月份：");
			int month = scanner.nextInt();
			System.out.println("请输入第几天：");
			int day = scanner.nextInt();
			
			int sumDays = 0;
			//方式1：
			/*if (month == 1) {
				sumDays = day;
			}else if (month == 2) {
				sumDays = 31 + day;
			}
			后面的以此类推
			*/ 
			
			//方法2：
			/*switch (month) {
			case 1:
				sumDays = day;
				break;
			case 2:
				sumDays = 31 +day;
			后面的以此类推
			*/
			
			//方法三：
			switch (month) {
			case 12:
				sumDays += 30;
			case 11:
				sumDays += 31;
			case 10:
				sumDays += 30;
			case 9:
				sumDays += 31;
			case 8:
				sumDays += 31;
			case 7:
				sumDays += 30;
			case 6:
				sumDays += 31;
			case 5:
				sumDays += 30;
			case 4:
				sumDays += 31;
			case 3:
				sumDays += 28;
			case 2:
				sumDays += 31;
			case 1:
				sumDays += day;
			//如果是5.9，因为没有break，所以会从case5进入加上4、3、2、1，最后加上9天
			}
			System.out.println("2019年" + month + "月" + day + "日是当前的第" + sumDays + "天");
		}
		scanner.close();
	}

}
