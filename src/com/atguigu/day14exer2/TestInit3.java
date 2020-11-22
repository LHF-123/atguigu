package com.atguigu.day14exer2;


public class TestInit3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new B(20);//给num赋值为20
	}

}
class A{
	private int a = getInt();//等价于a = this.getInt()  这个this表示当前对象，表示正在创建的对象，
							//现在正在创建子类的对象，那么通过子类的对象调用getInt()是执行的子类的重写的getInt
	
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

	public int getInt() {//父类的getInt方法被重写，会显示子类重写后的内容
		System.out.println("(3)A -> getInt");//1
		System.out.println("(3)a = " + a);//2 a=0
		return 1;
	}
	
}
class B extends A{
	private int b = getInt();
	
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
	
	@Override
	public int getInt() {
		System.out.println("(3)B -> getInt");//7
		System.out.println("(3)b = " + b);//8 b=0
		return 1;
	}
	
}
