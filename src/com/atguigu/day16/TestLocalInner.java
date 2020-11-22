package com.atguigu.day16;
/*
 * 	三、局部内部类
 * 	1、如何声明？
 * 	【修饰符】 class 外部类 【extends 父类】【implements 父接口们】{
 * 		
 * 		【修饰符】 返回值类型  方法名（【形参列表】）{
 * 	
 * 			【修饰符】 static class 内部类【extends 父类】【implements 父接口们】{
 * 
 * 			}
 * 
 * 		}
 * 	
 * 	}
 * 
 * 	 说明：局部内部类的修饰符
 * 	（1）权限修饰符4个
 * 	（2）static没有
 * 	（3）abstract可以有
 * 	（4）final可以有
 * 
 * 	2、使用
 * 	（1）局部内部类有作用域
 * 	（2）局部内部类中是否能使用外部类的非静态成员变量，要看所在的方法是否是静态的
 * 	（3）局部内部类中可以使用所在方法的局部变量，但是该局部变量必须加final声明
 * 		如果JDK 1.8之前，必须手动加final
 * 		如果JDK 1.8之后，自动加final。第39行省略了final
 * 
 * 	3、局部内部类也有字节码文件
 * 		外部类$数字  内部类
 * 
 * 	4、成员
 * 		不能用静态的成员
 */
public class TestLocalInner {

}
class Outer2{
	private static int i;
	private int j;
	
	public void outTest() {
		int a = 10;//局部变量，省略了final
		
		class Inner{
			public void test() {
				System.out.println(i);
				System.out.println(j);
				System.out.println(a);
			}
		}
		
		Inner inner = new Inner();
		inner.test();
		
	}//Inner的作用域只能到这里
	
	public static void outMethod() {
		class Inner{
			public void test() {
				System.out.println(i);
//				System.out.println(j);//这里不能用j，是因为outMethod()是静态的
			}
		}
	}
	
}
