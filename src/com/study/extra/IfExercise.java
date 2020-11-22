package com.study.extra;

import java.util.Scanner;

public class IfExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b = true;
		if (b == false) 
			System.out.println("a");
		else if(b)
			System.out.println("b");
		else if(!b)
			System.out.println("c");
		else 
			System.out.println("d");
		
		int t;
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			t = scanner.nextInt();
			if(t == 1) {
				System.out.println("10.5岁");
			}
			if(t == 2) {
				System.out.println("21岁");
			}
			if(t > 2) {
				t = t - 2;
				System.out.println(21 + 4 * t + "岁");
			}
			
		}
		scanner.close();
	}

}
