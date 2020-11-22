package com.atguigu.day14exer;

public class TestInit2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new B(20);//给num赋值为20
	}

}
class B extends A{
	private int b = getIntValue();
	
	{
		b++;
		System.out.println("(1)B非静态代码块");//9
		System.out.println("(1)b = " + b);//10 b=2
	}
	
	B(int num){
		super(num);//11 没有输出语句
		b = num;
		System.out.println("(2)B有参构造");//12
		System.out.println("(2)b = " + b);//13 b=20
	}

	public int getIntValue() {
		System.out.println("(3)B -> getIntValue");//7
		System.out.println("(3)b = " + b);//8 b=0
		return 1;
	}
	
}