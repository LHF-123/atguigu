package com.atguigu.day14exer;

public class TestInit1 {

	public static void main(String[] args) {
		
		A obj = new A(20);//给num赋值为20
		
	}

}
class A{
	private int a = getInt();
	
	{
		a++;
		System.out.println("(1)A非静态代码块");//3
		System.out.println("(1)a = " + a);//4 a=2
	}
	
	A(int num){
		a = num;
		System.out.println("(2)A有参构造");//5
		System.out.println("(2)a = " + a);//6 a=20
	}

	public int getInt() {
		System.out.println("(3)A -> getInt");//1
		System.out.println("(3)a = " + a);//2 a=0
		return 1;
	}
	
}