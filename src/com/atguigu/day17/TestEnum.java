package com.atguigu.day17;

/*
 * java.lang.Enum类，他是所有Java语言枚举类型的公共基本类
 * 	即所有枚举类型都继承它，不能再继承别的类
 * 	（1）name():返回此枚举常量的名称
 * 	（2）ordinal():返回枚举常量的序数（它在枚举声明中的位置，其中初始常量序数为0）
 * 	（3）int compareTo(x):默认按照枚举对象的顺序排序
 * 	（4）API中没有，编译器自动生成的
 * 		枚举类型[ ] values()
 * 		枚举类型 valueOf(常量名)
 */
public class TestEnum {

	public static void main(String[] args) {
		Week m = Week.MONDAY;
		System.out.println(m.name());
		System.out.println(m.ordinal());
		
		System.out.println(Week.SATURDAY.ordinal());
		
		Week[] values = Week.values();
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		
		Week s = Week.valueOf("SUNDAY");
		System.out.println(s);
		
	}

}
