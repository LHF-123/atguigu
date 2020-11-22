package com.atguigu.day11;

public class ArrayUtilTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {1, 2, 5, 4};
		ArrayUtil arrayUtil = new ArrayUtil();
		arrayUtil.sort(arr,"asc");
		//arr = new int[] {};
		arrayUtil.print(arr);
	}

}
