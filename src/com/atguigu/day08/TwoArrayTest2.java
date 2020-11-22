package com.atguigu.day08;

/*
 * 二维数组的使用：5-6知识点
 * 
 * 5.二维数组元素的默认初始化
 * 
 * 以动态初始化方式来解释
 * 
 * 二维数组的外层元素的初始化值为：地址值或null
 * 		①二维数组的内层元素的初始化值为：如果外层元素初始化值为地址值时，此时内层元素默认初始化值与一维数组不同类型的默认初始化值相同。
 * 		   即：整型：0;浮点型：0.0;字符型：'\u0000';布尔型：false;引用类型：null;
 * 		②如果外层元素的初始化值为null，则内层元素还不存在。试图调用的话，会报NullPointerException
 * 
 * 补充：查看二维数组变量的值，只要初始化过的二维数组，存储的都是地址值
 * 		比如如下问题的：arr1,arr2....
 * 
 * 6.二维数组的内存解析
 */
public class TwoArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {1,2,3};
		System.out.println(arr);//[I@15db9742
		//[代表一维数组，I代表int类型后面是地址值
		
		int[][] arr1 = new int[3][2];
		
		//外层元素
		System.out.println(arr1[0]);//[I@6d06d69c
		System.out.println(arr1[1]);//[I@7852e922
		System.out.println(arr1[2]);//[I@4e25154f
		
		//内层元素
		System.out.println(arr1[0][0]);//0
		
		System.out.println("**************************");
		
		
		double[][] arr2 = new double[3][2];
		
		//外层元素
		System.out.println(arr2[0]);//[D@70dea4e
		System.out.println(arr2[1]);//[D@5c647e05
		System.out.println(arr2[2]);//[D@33909752
		
		//内层元素
		System.out.println(arr2[0][0]);//0.0
		
		System.out.println("**************************");
		
		String[][] arr3 = new String[3][4];
		
		System.out.println(arr3[0]);//[Ljava.lang.String;@55f96302
		
		System.out.println(arr3[0][1]);//null
		
		System.out.println(arr1);//[[I@3d4eac69
		System.out.println(arr2);//[[D@42a57993
		System.out.println(arr3);//[[Ljava.lang.String;@75b84c92
		
		System.out.println("/**************************");
		
		int[][] arr4 = new int[3][];
		
		//外层元素
		System.out.println(arr4[0]);//null
		System.out.println(arr4[1]);//null
		System.out.println(arr4[2]);//null
		//内层元素
		//System.out.println(arr4[0][0]);//报错
		
		
		System.out.println("/**************************");
		
		String[][] arr5 = new String[3][];
		
		//外层元素
		System.out.println(arr5[0]);//null
		System.out.println(arr5[1]);//null
		System.out.println(arr5[2]);//null
		//内层元素
		//System.out.println(arr5[0][0]);//报错
		
	}

}
