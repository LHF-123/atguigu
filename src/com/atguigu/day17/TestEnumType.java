package com.atguigu.day17;

/*
 * 	枚举：列举、罗列
 * 	
 * 	枚举是代表这样的一系列的类型，这类型有一个非常明显的特征：他们的对象是有限的几个。
 * 	例如：
 * 	week（星期），我们可以限定week类型的对象只有7个：Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
 * 	Season（季节），可以限定对象为4个：Spring,Summer,Autumn,Winter
 * 	Status（员工状态），可以限定为4个：空闲（Free），忙（Busy），休假（Vocation），离职（Left）
 * 
 * 	枚举类是JDK 1.5之后引入的
 * 	
 * 	声明的语法格式：
 * 	【权限修饰符】 enum 枚举类型名{
 * 			常量对象列表
 * 			【其它成员】
 * 	}
 * 
 * 	说明：
 * 	（1）枚举类型的构造器一定是私有的
 * 	（2）枚举类型的常量对象列表必须在枚举类的首行
 * 		如果常量对象列表后面没有其它成员，那么;（分号）可以省略，如果后面还有其它的成员;（分号）不能省略
 * 	（3）所有的枚举类型有一个直接父类java.lang.Enum，所以你不能继承其它类
 * 	（4）switch...case增加了对枚举的支持
 * 
 * 
 * 	首行：
 * 	（1）package
 * 	（2）super(), this()
 * 	（3）枚举常量对象
 * 
 * 	switch...case的表达式的类型
 * 	（1）基本数据类型：byte, short, int, char
 * 	（2）引用数据类型：枚举（JDK 1.5之后）， String（JDK 1.7之后）
 * 	switch(表达式){
 * 		case 常量名:
 * 			语句;
 * 			[break;]
 * 		....
 * 	}
 * 
 * 
 */
public class TestEnumType {
	
	public static void main(String[] args) {
//		Week week = new Week();
		
		Week monday = Week.MONDAY;
		System.out.println(monday);
		
		switch (monday) {
		case MONDAY:
			System.out.println("星期一，xxxx");
			break;
		case TUESDAY:
			System.out.println("星期二，xxx");
			break;
		}
		
	}

}
enum Week{
	MONDAY("星期一", "最困的一天"),
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY;
	
	private String name;
	private String desc;
	
	private Week(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}
	
	private Week() {
	}
	
	//重写的是Enum类的toString,不是重写Object的toString
//	@Override
//	public String toString() {
//		return name + ":" + desc;
//	}
	
	
	
}