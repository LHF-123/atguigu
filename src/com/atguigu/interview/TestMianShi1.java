package com.atguigu.interview;

public class TestMianShi1 {

}
class Outer{
	abstract class Inner{
		public abstract void test();
	}
}

/*
 * 	考点：
 * 	（1）子类继承抽象类，需要重写抽象类的抽象方法
 * 	（2）要使用非静态的内部类，需要外部类的对象
 * 	（3）子类继承父类时，在子类的构造器中，必须调用父类的构造器
 */
class MyInner extends Outer.Inner{
	
	MyInner(Outer outer) {
		outer.super();//用外部类的对象，才能调用内部类的构造器
	}

	@Override
	public void test() {
		System.out.println("...");
	}
	
}
