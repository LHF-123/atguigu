package com.atguigu.day09;
/*
 * 类中属性（或成员变量）的声明和使用
 * 
 * 成员变量 VS 局部变量
 * 
 * 相同点：
 * 1.声明变量的结构：数据类型 变量名 = 变量值
 * 2.先声明，后使用
 * 3.都有对应的作用域
 * 
 * 不同点：
 * 1.类中声明变量位置的不同
 * 成员变量：直接声明在类中
 * 局部变量：方法的形参、方法的内部、构造器的内部、构造器的形参、代码块的内部、。。。
 * 
 * 2.权限修饰符的使用
 * 成员变量声明前，可以使用权限修饰符进行修饰。而局部变量不可以
 * 常见的权限修饰符有： public \ private \ 缺省
 * 
 * 3.针对变量值的说明
 * 成员变量有默认初始化值。
 * 		跟之前讲过的数据类型默认初始化值相同
 * 
 * 
 * 而局部变量没有默认初始化值，在调用之前必须显式初始化
 * 
 * 
 * 4.内存中加载的位置不同
 * 	局部变量：声明在栈空间中
 * 	成员变量：声明在堆空间中
 * 
 * 
 * 回顾：分类一：按照数据类型分：基本数据类型（8种） VS 引用数据类型（数组、类、接口）
 * 		分类二：按照类中声明的位置：成员变量 VS 局部变量
 * 
 */
//User的测试类
public class UserTest {
	
	public static void main(String[] args) {
		
		User u1 = new User();
		
		System.out.println("name=" + u1.name + ",age=" + u1.age + ",isMale=" + u1.isMale);
		
		u1.eat("蛋糕");
	}
	
}

class User{
	public String name;
	int age;
	boolean isMale;
	
	//方法
	public void eat(String food) {//food局部变量
		System.out.println("喜欢吃：" + food);
	}
	
	public void showNation() {
		String nation = "CHN";//局部变量
		//String nation;
		System.out.println("我的国籍是：" + nation);
	}
}
