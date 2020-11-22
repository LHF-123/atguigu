package com.atguigu.day14;

import java.util.Scanner;

/*
 * 	命名规范：
 * 	类、接口等名字首字母大写
 * 
 * 	Object的方法：
 * 	（一）Class getClass()：返回此Object的运行时类。
 * 		Class：类型
 * 	（二）String toString():建议所有子类都重写这个方法
 * 
 * 		记住：
 * 		（A）：当你打印一个对象时，默认调用这个对象的toString()
 * 		（B）：当用一个对象与String的值进行“+”拼接操作，也会自动调用这个对象的toString()
 * 	
 * 	（三）双胞胎
 * 	int hashCode()：返回该对象的哈希码值。支持此方法是为了提高哈希表（例如java.util.Hashtable 提供的哈希表）的性能。
 * 		前期时：知道它是把对象的信息，通过某种算法来计算出来的一个int值。
 * 		设计这个int的值，理想状态下，是希望每一个对象都有唯一的hash码，但是现实中，可能两个不同的对象他们的hash码相同。
 * 		问题？
 * 			（1）如果两个对象的hash码不一样  ---> 这两个对象是不相同的		可以
 * 			（2）如果两个对象的hash码一样  ---> 这两个对象是相同的		不可以
 * 			（3）如果两个对象相同   --->  他俩的hash码是相同的			可以
 * 
 * boolean equals(Object obj):指示其他某个对象是否与此对象“相等”。
 * 	（1）如果一个类没有重写Object的equals方法，而是比较属性的内容，那么效果和“==”是一样的，比较的是两个对象的地址。
 * 	（2）如果这个类不想用equals来比较地址值，而是比较属性的内容，那么需要“重写”这个方法
 * 
 * 	如果不用IDE工具生成的equals方法，那么可以自己重写，自己重写时，要遵循几个原则：
 * 		（1）自反性：x.equals(x)自己与自己一定是相同的
 * 		（2）对称性：x.equals(y)是true  y.equals(x)也要是true
 * 		（3）传递性：x.equals(y)是true  y.equals(z)是true  ---> x.equals(z)也要是true
 * 		（4）一致性：如果参与equals比较的属性的值都没有修改，那么前后两次调用应该相同
 * 			x.equals(y)是true
 * 		（5）对于任何非空引用值x， x.equals(null)都应该返回false
 * 
 * 	（四）protect void finalize():当垃圾回收器确定不存在对该对象的更多引用时，由对象的垃圾回收器调用此方法。
 * 		比喻为：对象被回收之前，留临终遗言的方法
 * 		实际中：这个方法用于彻底释放资源功能
 * 	
 * 	面试题：finalize, final, finally的区别
 * 
 * 
 */
public class TestObjectMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Object obj = "hello";//"hello"是一个字符串
		
//		System.out.println(obj.getClass());//obj这个对象运行时类型是：class java.lang.String
		
		TestObjectMethod t = new TestObjectMethod();
		//com.atguigu.day14.TestObjectMethod@15db9742
		//类名@15db9742
		System.out.println(t);
		
		System.out.println(t.hashCode());
		//十进制：366712642
		//十六进制：15DB9742
		
		String str = "对象的信息：";
		str = str + t;
		System.out.println(str);
		
		Student student = new Student("张三", 19, 99);
		System.out.println(student);
		
		String str1 = "BB";//2112
		String str2 = "Aa";//2112
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		Student stu1 = new Student("李四", 20, 59);
		Student stu2 = new Student("李四", 20, 59);
		System.out.println(stu1.equals(stu2));
		System.out.println(stu1 == stu2);//比较的是两个对象的地址
		
		Scanner input = new Scanner(System.in);
		System.out.println("请输入是否愿意：");
		String result = input.next();
		
		if ("愿意".equals(result)) {//说明String重写了Object类中的equals方法
			System.out.println("太好了");
		}
		
//		if ("愿意" == result) {
//			System.out.println("太好了");
//		}
		
		
		
		
	}

}

class Student{
	
	private String name;
	private int age;
	private int score;
	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	public Student() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}
	
//	Student stu1 = new Student("李四", 20, 59);
//	Student stu2 = new Student("李四", 20, 59);
//	System.out.println(stu1.equals(stu2));
	@Override
	public boolean equals(Object obj) {
		//this在方法中代表当前对象，调用这个方法的对象，这里代表stu1
		//obj是形参，它代表实参对象，实参对象是stu2，实参被向上转型
		if (this == obj)//比较stu1和stu2的地址，如果相同，直接返回true
			return true;
		
		if (obj == null)//如果obj是null，即stu2是null，直接返回false，因为this对象可以调用equals方法说明一定不是null，否则就空指针异常
			return false;
		
		//getClass():省略了this.getClass(),得到的是stu1的运行时类型
		//obj.getClass()：得到的是stu2的运行时类型
		if (getClass() != obj.getClass())//如果stu1和stu2是不同类型的对象，就直接返回false
			return false;
		
		//为什么这里不需要istanceof判断
		//因为上面if (getClass() != obj.getClass())保证了他俩都是Student类型，因为如果stu2不是Student，上面就return false
		//this(stu1)一定是Student类型，因为如果不是Student就要调用别的类型中的equals方法
		Student other = (Student) obj;//向下转型，这里向下转型的目的是为了调用obj对象的属性
		
		
		if (age != other.age)//如果年龄不同，就返回false
			return false;
		
		
		if (name == null) {//分为（1）name是null
			if (other.name != null)
				return false;
			
		} else if (!name.equals(other.name))//（2）name不为空，因为name是String类型，那么用equals来决定是否相同
			return false;
		
		
		if (score != other.score)//如果分数不同，就返回false
			return false;
		return true;
	}
	

	
	
}
