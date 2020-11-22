package com.atguigu.day13;
/*
 * 	多态的应用：
 * 		多态的数组
 * 	数组的元素类型是父类的类型
 * 	数组的元素对象是子类的对象
 * 
 * 
 * 
 * 	需求：
 * 	（1）父类：图形Graphic，里面有一个getArea()方法
 * 	（2）子类：圆
 * 	（3）子类：矩形
 * 	（4）要用一个数组，来装各种图形的对象，并且遍历这些图形，打印他们的面积
 * 
 */
public class TestUse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Circle_1[] arr1 = new Circle_1[3];//只能装圆的对象
//		Rectangle_1[] arr2 = new Rectangle_1[3];//只能装矩形的对象
		
		Graphic[] arr3 = new Graphic[3];//创建数组对象
		arr3[0] = new Circle_1(1.2);//左边的arr3[0]的类型是Graphic，右边赋值的是Circle_1对象，他就是一个多态引用
		arr3[1] = new Circle_1(2.2);//左边的arr3[1]的类型是Graphic，右边赋值的是Circle_1对象，他就是一个多态引用
		arr3[2] = new Rectangle_1(2, 3);//左边的arr3[2]的类型是Graphic，右边赋值的是Rectangle_1对象，他就是一个多态引用
		
		for (int i = 0; i < arr3.length; i++) {
			System.out.println("面积：" + arr3[i].getArea());
		}
		
		
	}

}