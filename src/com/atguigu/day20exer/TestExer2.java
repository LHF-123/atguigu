package com.atguigu.day20exer;

//2、将一个字符串进行反转。比如将"abcdefgho"反转为"abfedcgho"
public class TestExer2 {

	public static void main(String[] args) {
		String str = "abcdefgho";
		str = reverse2(str, 2, 5);
		System.out.println(str);
	}
	
	/*
	 * 	(1)把str、字符串分为三部分
	 * 	左 +  中 +  右，要反转的中间的部分
	 * 
	 * 	(2)反转middle
	 * 	A：先把中间部分转为数组
	 * 	(3)拼接
	 */
	private static String reverse(String str, int start, int end) {
		String left = str.substring(0, start);
		String right = str.substring(end+1);
		String middle = str.substring(start, end+1);
		
		char[] charArray = middle.toCharArray();//中间的数组，首尾对应位置交换
		
		for (int i = 0; i < charArray.length/2; i++) {
			char temp = charArray[i];
			charArray[i] = charArray[charArray.length - i - 1];
			charArray[charArray.length - i - 1] = temp;
		}
		middle = new String(charArray);
		
		return left + middle + right;
	}
	
	/*
	 * (1)直接把str转为数组
	 * (2)直接交换[start, end]
	 */
	private static String reverse2(String str, int start, int end) {
		char[] charArray = str.toCharArray();//整个数组，首尾对应位置交换
		
		for (int i = start, j = end; i < j; i++, j--) {
			char temp = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = temp;
		}
		
		return new String(charArray);
	}

}
