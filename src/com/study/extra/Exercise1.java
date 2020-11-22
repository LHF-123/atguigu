package com.study.extra;

public class Exercise1 {

	public static void main(String[] args) {
		int num = 826;
		
		int bai = num / 100;
		int shi = num / 10 % 10;
		//int shi = num % 100 / 10;方法都可以
		int ge = num % 10;
		
		System.out.println(num + "的百位是" + bai);
		System.out.println(num + "的十位是" + shi);
		System.out.println(num + "的个位是" + ge);
		
		
		int n = 10;
		n += (n++) + (++n);
		//n = n + (n++) + (++n)
		//n = 10 + 10  +  12
		System.out.println("n = " + n);
		
		int i = 1;
		i *= 0.1;
		System.out.println("i = " + i);
		i++;
		System.out.println("i = " + i);
		
		short s = 3;
		//s = s + 2;编译不通过，运算后是int类型
		s += 2;//运算后数据类型不变
		
		System.out.println(4 == 3);
	}

}
