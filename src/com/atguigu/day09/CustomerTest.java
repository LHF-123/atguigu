package com.atguigu.day09;
/*
 * 类中方法的声明和使用
 * 
 * public void show(){}
 *  int getAge(){}
 * private void showNation(String nation){}
 * public String eat(String food1, String food2, String food3){}
 * 
 * 1.方法声明的格式：
 * 权限修饰符  返回值类型  方法名(形参列表){
 * 		//方法体
 * }
 * 
 * 说明：我们定义方法时，都需要考虑如上方法声明的五部分结构！！！
 * 
 * 
 * 2.细节说明
 * 2.1 权限修饰符：指明所修饰的结构可被调用的范围的大小
 * 	        技巧：暂时大家声明方法时，都使用public
 * 2.2 返回值类型：具体的数据类型  或  void(没有返回值)
 * 	   ①我们定义方法时，根据方法的实际需要，来决定是否需要返回值。如果需要，则指明返回值对应的数据类型。
 * 		如果不需要，则使用void来声明
 * 	   ②如果指明了具体的数据类型，则必须在方法执行最后，返回所要求的数据类型的变量或常量，使用return
 * 	   ③方法体中一旦执行到return，则结束此方法。
 * 	   ④声明为void的方法中，也可以使用return。
 * 
 * 2.3 方法名，属于标识符，声明时满足标识符的命名规则和规范。
 * 	        起名时要“见名知意”
 * 	   Arrays:binarySearch() / sort /...
 * 	   Math:random() / round()
 * 
 * 2.4 形参列表：可以根据需要，声明方法时，提供形参列表。只需要提供“数据类型  形参名”
 *	        如果需要声明多个变量，使用逗号，隔开。
 *
 * 2.5 方法体：真正体现一个方法的功能的部分。 
 */
public class CustomerTest {
	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.show1();
		//c1.show2();
	}
}

class Customer{
	
	String name;
	int age;
	
	//方法
	public void show1(){
		
	}
	
	private void show2(){
		
	}
	
	public int getAge(){
		return age;
	}
	
	private void showNation(String nation){
		System.out.println("我的国籍是：" + nation);
		return;//结束方法
	}
	
	public String eat(String food1, String food2, String food3){
		return food1 + food2 + food3;
	}
	
}
