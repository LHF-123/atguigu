package com.atguigu.day14exer;

/*
 * 	虽然main中没有代码，但是main是属于T类，要执行main()，首先要初始化T类，所以这里就考了一个T类的初始化。
 * 	
 * 	T类的初始化<clinit>()
 * 	(1)k = 0;																-->k=0
 * 	(2)t1 = new T("t1");
 * 		实例初始化
 * 		第一：j = print("j");
 * 			System.out.println((++k) + ":" + str + " i=" + i + " n=" + n);	-->1:j i=0 n=0	,k=1	
			++n;															-->n=1
			return ++i;														-->i=1
																			-->j=1
 * 		第二：print("构造块");
 * 			System.out.println((++k) + ":" + str + " i=" + i + " n=" + n);	-->2:构造块 i=1 n=1	,k=2
			++n;															-->n=2
			return ++i;														-->i=2
 * 		第三：构造器
 * 			System.out.println((++k) + ":" + str + " i=" + i + " n=" + n);	-->3:t1 i=2 n=2	,k=3
			++n;															-->n=3
			++i;															-->i=3
 * 	(3)t2 = new T("t2");
 * 		实例初始化
 * 		第一：j = print("j");
 * 			System.out.println((++k) + ":" + str + " i=" + i + " n=" + n);	-->4:j i=3 n=3	,k=4	
			++n;															-->n=4
			return ++i;														-->i=4
																			-->j=4
 * 		第二：print("构造块");
 * 			System.out.println((++k) + ":" + str + " i=" + i + " n=" + n);	-->5:构造块 i=4 n=4	,k=5
			++n;															-->n=5
			return ++i;														-->i=5
 * 		第三：构造器
 * 			System.out.println((++k) + ":" + str + " i=" + i + " n=" + n);	-->6:t2 i=5 n=5	,k=6
			++n;															-->n=6
			++i;															-->i=6
 * 	(4)i = print("i");
 * 		System.out.println((++k) + ":" + str + " i=" + i + " n=" + n);		-->7:i i=6 n=6	,k=7
		++n;																-->n=7
		return ++i;															-->i=7
 * 	(5)n = 99;																-->n=99
 * 	(6)print("静态块");
 * 		System.out.println((++k) + ":" + str + " i=" + i + " n=" + n);		-->8:静态块 i=7 n=99
		++n;																-->n=100
		return ++i;															-->i=8
 * 	
 */
public class T {

	public static int k = 0;
	public static T t1 = new T("t1");
	public static T t2 = new T("t2");
	public static int i = print("i");
	public static int n = 99;
	
	public int j = print("j");
	{
		print("构造块");
	}
	
	static {
		print("静态块");
	}
	
	public T(String str) {
		System.out.println((++k) + ":" + str + " i=" + i + " n=" + n);
		++n;
		++i;
	}

	private static int print(String str) {
		System.out.println((++k) + ":" + str + " i=" + i + " n=" + n);
		++n;
		return ++i;
	}
	
	public static void main(String[] args) {
		
	}
	
}
