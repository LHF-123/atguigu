package com.atguigu.day14exer2;

/*
 * 	注意：方法的重写
 */
public class TestInit4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new B(20);//给num赋值为20
	}

}
class A1{
	private int a = getInt();//因为getInt方法是private，在子类中不可见，不会被重写
	
	{
		a++;
		System.out.println("(1)A非静态代码块");//3
		System.out.println("(1)a = " + a);//4 a=2
	}
	
	A1(int num){
		a = num;
		System.out.println("(2)A有参构造");//5
		System.out.println("(2)a = " + a);//6 a=20
	}

	private int getInt() {//因为getInt方法是private，在子类中不可见，不会被重写
		System.out.println("(3)A -> getInt");//1
		System.out.println("(3)a = " + a);//2 a=0
		return 1;
	}
	
}
class B1 extends A1{
	private int b = getInt();
	
	{
		b++;
		System.out.println("(1)B非静态代码块");//9
		System.out.println("(1)b = " + b);//10 b=2
	}
	
	B1(int num){
		super(num);//11 没有输出语句
		b = num;
		System.out.println("(2)B有参构造");//12
		System.out.println("(2)b = " + b);//13 b=20
	}
	
	private int getInt() {
		System.out.println("(3)B -> getInt");//7
		System.out.println("(3)b = " + b);//8 b=0
		return 1;
	}
	
}
