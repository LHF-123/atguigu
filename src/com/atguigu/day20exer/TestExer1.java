package com.atguigu.day20exer;

public class TestExer1 {

	public static void main(String[] args) {
		String str = trim4("   hello world		");
		System.out.println("[" + str + "]");//hello world
	}
	
	/*
	 * 	方法一：
	 * 	（1）把str转成字符串数组
	 * 	（2）遍历数组，找出第一个非空字符的startIndex和最后一个非空字符的endIndex
	 * 	（3）用这个数组[startIndex, endIndex]重新构建为一个字符串
	 */
	public static String trim1(String str) {
		//（1）把str转成字符串数组
		char[] array = str.toCharArray();
		
		//（2）遍历数组，找出第一个非空字符的startIndex和最后一个非空字符的e
		int startIndex = 0;
		int endIndex = str.length() - 1;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] <= ' ') {
				startIndex++;
			}else {
				break;
			}
		}
		
		for (int i = array.length-1; i >=0 ; i--) {
			if (array[i] <= ' ') {
				endIndex--;
			}else {
				break;
			}
		}
		
		//（3）用这个数组[startIndex, endIndex]重新构建为一个字符串
		String result = new String(array, startIndex, endIndex - startIndex +1);
		return result;
	}
	
	//方法二：
	public static String trim2(String str) {
		//（1）把str转成字符串数组
		char[] array = str.toCharArray();
		
		//（2）遍历数组，找出第一个非空字符的startIndex和最后一个非空字符的e
		int startIndex = 0;
		int endIndex = str.length() - 1;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] <= ' ') {
				startIndex++;
			}else {
				break;
			}
		}
		
		for (int i = array.length-1; i >=0 ; i--) {
			if (array[i] <= ' ') {
				endIndex--;
			}else {
				break;
			}
		}
		
		//（3）用这个数组[startIndex, endIndex]重新构建为一个字符串
		return str.substring(startIndex, endIndex + 1);
	}
	
	//方法三：
	//把开头和结尾的空格截取掉。
	//这个方法有问题，要判断很多种的空白符
	public static String trim3(String str) {
		while (str.startsWith(" ")) {
			str = str.substring(1);//把[0]的位置截取掉了
		}
		while (str.endsWith(" ")) {
			str = str.substring(0, str.length()-1);
			
		}
		return str;
	}
	
	//方法四：
	//把str前后的空白符给替换掉
	public static String trim4(String str) {
		str = str.replaceAll("^\\s*|\\s*$", "");
		return str;
	}

}
