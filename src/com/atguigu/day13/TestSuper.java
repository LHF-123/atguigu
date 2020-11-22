package com.atguigu.day13;

/*
 * 	回忆：this
 * 	意思：当前对象
 * 	（1）构造器中，正在创建的那个对象
 * 	（2）方法中，当前对象，表示调用这个方法的对象
 * 	用法：
 * 	（1）this.属性
 * 		当成员变量（属性）与局部变量重名时，在成员变量（属性）前面加this
 * 	（2）this.方法
 * 		当需要调用当前对象的其他成员方式时，可以用this.  也可以省略
 * 	（3）this()或this(实参列表)
 * 		访问本类的其他构造器。必须在构造器首行
 * 		this()访问本类的无参构造
 * 		this(实参列表)访问本类的有参构造
 * 
 * 	super：
 * 	意思：父类的
 * 	要求或者前提：通过super访问的属性、方法、构造器必须是在子类中可见的
 * 	不能是private，如果跨包，也不能是缺省
 * 
 * 	（1）super.属性（很少用）
 * 		什么情况必用？
 * 		当子类有与父类重名的属性时，如果要访问父类的属性，可以加super.
 * 		
 * 		如果子类没有与父类重名的属性时，那么不需要加super也可以访问
 * 
 * 		结论：看方法中的这个变量到底是哪个变量，那么原则只有一个就近原则
 * 		如果变量的前面既没有this，也没有super，先从局部变量开始找，如果局部变量没有，那么再从本类的属性列表找，如果本类没有，再从父类的属性列表找
 * 		如果变量的前面有this，先从本类的属性列表找，如果本类没有，再从父类的属性列表找
 * 		如果变量的前面有super，从父类的属性列表找
 * 
 * 	（2）super.方法
 * 		什么情况必用？
 * 		当前子类中需要调用父类"被重写"的方法时，需要加super.
 * 
 * 		如果子类没有重写该方法，可以省略super.
 * 
 * 	（3）super()或super(实参列表)
 * 		super()或super(实参列表)也必须在子类构造器的首行。
 * 		super()调用父类的无参构造，要求父类必须有无参构造
 * 		super(实参列表)调用父类的有参构造，要求父类必须有有参构造
 * 
 * 
 */
public class TestSuper {
	public static void main(String[] args) {
		/*
		 * Animal animal = new Animal("3"); Dog dog = new Dog("4", "哈巴狗");
		 * 
		 * animal.setAge("5"); System.out.println(animal.getAge());
		 * 
		 * dog.setAge("6"); System.out.println(dog.getAge());
		 * 
		 * System.out.println(dog.getInfo());
		 */
		
		Cuboid cuboid = new Cuboid(2, 4, 1);
		System.out.println(cuboid.getInfo());
		
	}
}

class Animal{
	private String age;
	
	//有参构造
	public Animal(String age) {
		//如果创建的是Animal对象，那么this就是Animal类型，如果创建的是子类Dog类，那么this就是Dog类型
		this.age = age;
	}
	
	//get/set
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
}

class Dog extends Animal{
	private String type;
	
	//有参构造
	public Dog(String age, String type) {
		super(age);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String getInfo() {
		return "年龄：" + getAge() + "，种类：" + type;
//		return "年龄：" + this.getAge() + "，种类：" + type;
	}
	
}

class Rectangle{
	private double length;
	private double width;
	
	public Rectangle() {
		super();
	}
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public String getInfo() {
		return "长： " + length + "，宽：" + width;
	}
	
}

class Cuboid extends Rectangle{
	private double height;

	public Cuboid(double length, double width, double height) {
		//System.out.println("长方形");
		super(length, width);
//		super();
//		setLength(length);
//		setWidth(width);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public String getInfo() {
		return super.getInfo() + "，高：" + height;
		//return "长： " + getLength() + "，宽：" + getWidth() + "，高：" + height;
	}
	
}
