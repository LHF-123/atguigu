package com.atguigu.day17;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.annotation.Resource;

/*
 * 	自定义注解：
 * 	（1）声明
 * 	（2）使用
 * 	（3）读取
 * 
 * 	一、声明
 * 	格式：
 * 	【修饰符】 @interface 注解名{
 * 	}
 * 
 * 	二、使用
 * 	@注解名
 * 
 * 
 * 	三、读取
 * 		特别说明，如果需要用“反射”读取某个注解，那么这个注解声明时，一定要加上这个元注解@Retention(RetentionPolicy.RUNTIME)
 * 
 * 
 * 	四、元注解
 * 	元注解：注解注解的注解，给注解加的注解，在注解声明时，在上面加的注解
 * 	元数据：
 * 	元...：
 * 
 * 	1、@Target(xx)
 * 		用来标记这个注解可以用在xx位置
 * 		这个位置由ElementType枚举常量对象来指定。
 * 
 * 	2、@Retention(xx)
 * 	作用：标记这个注解可以滞留到xx阶段
 * 	这个生命周期由RetentionPolicy枚举对象来指定。SOURCE(源代码),、CLASS(字节码阶段)、RUNTIME(运行时)
 * 
 * 	3、@Documented
 * 	作用：标记这个注解是否可以被javadoc.exe读取到API中
 * 
 * 	4、@Inherited
 * 	作用：标记这个注解是否可以被子类继承
 * 	
 * 
 */
public class TestDefineAnnotation {
	
	public static void main(String[] args) {
		//下面的代码，不用会写，现在没有讲反射，但知道他的作用是读取一个注解
		Class clazz = MyClass.class;
		MyAnnotation my = (MyAnnotation) clazz.getAnnotation(MyAnnotation.class);
		System.out.println(my);
		
		Class clazz2 = SubMyClass.class;
		MyAnnotation my2 = (MyAnnotation) clazz2.getAnnotation(MyAnnotation.class);
		System.out.println(my2);
	}

}

@MyAnnotation
class MyClass{
	
	@MyAnnotation
	private int i;
	
	@MyAnnotation
	public void test() {
		
	}
	
}
class SubMyClass extends MyClass{
	
}

//声明注解
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@interface MyAnnotation{
	
}

class SuperClass{
	public void test() {
		System.out.println("父类");
	}
}
class SubClass extends SuperClass{

	@Override
	public void test() {
		System.out.println("子类");
	}
	
}
