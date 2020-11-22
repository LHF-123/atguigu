package com.atguigu.exercise;

/*
 * 使用二维数组打印一个10行的杨辉三角
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3  1
 * 1 4 6  4  1
 * 1 5 10 10 5 1
 * 
 * ......
 * 
 * 【提示】
 * 1.第一行有一个元素，第n行有n个元素
 * 2.每一行的第一个元素和最后一个元素都是1
 * 3.从第三行开始，对于非第一个元素和最后一个元素的元素。
 * yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
 * 
 */
public class YangHuiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 二维数组的初始化
		int[][] yangHui = new int[10][];
		
		for (int i = 0; i < yangHui.length; i++) {
			yangHui[i] = new int[i + 1];
			//2. 给二维数组的所有元素赋值
			//2.1 给每行的首末元素赋值
			//yangHui[i][0] = 1;
			//yangHui[i][i] = 1;
			yangHui[i][0] = yangHui[i][i] = 1;
			
			//2.2 给每行的非首末元素赋值
			//if (i > 1) {
				//yangHui[i][1],yangHui[i][2]...yangHui[i][i-1]
				for (int j = 1; j < yangHui[i].length-1; j++) {
					yangHui[i][j] = yangHui[i - 1][j] + yangHui[i - 1][j - 1];
				}
			//}
		}
		
		
		//3. 遍历二维数组
		for (int i = 0; i < yangHui.length; i++) {
			for (int j = 0; j < yangHui[i].length; j++) {
				System.out.print(yangHui[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
