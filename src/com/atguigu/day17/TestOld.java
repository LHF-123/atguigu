package com.atguigu.day17;

/*
 * JDK 1.5之前：如何实现枚举的需求
 * 
 * 	要点：整个系统中，某个类型的对象是有限的几个，不多也不少
 * 	（1）限制使用者随意创建对象--->构造器私有化
 * 	（2）把有限的几个对象，预先创建好，放着，供使用者使用--->在枚举类中，用静态的类变量把有限的几个对象
 * 													  存储起来，使用者通过“类名.对象名”来获取
 */
public class TestOld {
	
	public static void main(String[] args) {
//		Season s = new Season();//无法创建对象
		Season s = Season.SPRING;
		System.out.println(s);
		
		Season w = Season.WINTER;
		System.out.println(w);
		
		Season w2 = Season.WINTER;
		System.out.println(w == w2);//这里拿到的是同一个“冬天”的对象，所以地址值是相同的
		
	}

}
class Season{
	//（2）把有限的几个对象，预先创建好，那么因为构造器私有化，只能在本类中创建
	//创建好还要用变量存储起来。（局部变量、实例变量、静态类变量）
	public static final Season SPRING = new Season();
	public static final Season SUMMER = new Season();
	public static final Season AUTUMN = new Season();
	public static final Season WINTER = new Season("冬天", "冻得要死");
	
	private String name;
	private String desc;
	
	//（1）构造器私有化
	private Season() {
		
	}

	private Season(String name, String desc) {
		super();
		this.name = name;
		this.desc = desc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Season [name=" + name + ", desc=" + desc + "]";
	}
	
	
	
}
