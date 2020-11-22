package com.atguigu.day11;
/*
 * 面向对象的特征一：封装与隐藏
 * 
 * 1.封装性设计的由来？
 * 	创建了类的对象之后，我们可以使用“对象.属性”方式调用或设置属性的值。在赋值时，要求考虑到变量的数据类型
 * 	和储值范围。但是，我们在实际问题，需要额外的属性赋值时，加入限制条件。这些限制条件不可能在变量声明时做添加，
 * 	我们只能通过方法中给变量赋值，同时添加限制条件（setXxx()体现）。同时，我们应该禁止通过“对象.属性”的方式
 * 	给属性赋值。
 * 		此外为了能调用此属性，我们再提供获取属性的方法（getXxx()）
 * 
 * 2.封装性的体现（狭义上）
 * 	将类的属性私有化，同时提供公共的get()和set()方法来获取和设置此属性
 *
 * 3.封装性的体现（广义上）
 * java规范的4种权限修饰符：private < 缺省  < protected < public。修饰相应的结构，体现这个结构被调用时，可见性大小。
 * 	4中权限可以修饰类内部的成员：属性、方法、构造器、内部类
 * 	类本身可以使用两种权限修饰：缺省、public
 */
public class AnimalTest {
	
	public static void main(String[] args) {
		Animal a1 = new Animal();
		a1.eat();
		
		a1.setName("Tom");
		//a1.legs = 2;
		
		a1.setLegs(2);
		System.out.println("动物名称为" + a1.getName());
		System.out.println("腿的个数为：" + a1.getLegs());
	
		//a1.legs = -4;
	}
	
}

class Animal{
	
	private String name;
	private int legs;
	
	public void eat() {
		System.out.println("动物进食");
	}
	
	public void sleep() {
		System.out.println("动物睡觉");
	}
	
	public void setLegs(int l) {
		if(l < 0 || l % 2 != 0 || l > 36) {
			System.out.println("输入的数据不合法！");
			//throw new RuntimeException("输入的数据不合法！");
		}else {
			//此时的legs即为调用setLegs方法的对象的legs
			legs = l;
		}
	}
	
	public int getLegs() {
		return legs;
	}
	
	//设置
	public void setName(String n) {
		if (n.length() <= 2 || n.length() > 10 ) {
			System.out.println("输入名要大于两位小于十位！");
		} else {
			name = n;
		}
	}
	
	//获取
	public String getName() {
		return name;
	}
	
}