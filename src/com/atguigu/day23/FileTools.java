package com.atguigu.day23;

import java.io.File;

public class FileTools {
	
	public static void main(String[] args) {
//		File file1 = new File("E:/code/测试");
//		long length = getLength(file1);
//		System.out.println("总大小：" + length);
		
		File file = new File("d:/新建文件夹");
		delete(file);
	}
	
	//可以返回一个文件或目录的大小
	public static long getLength(File dir) {
		
		if (dir.isFile()) {
			return dir.length();
		}else if (dir.isDirectory()) {
			//思路：把dir的所有的下一级的总大小累加起来
			long sum = 0;
			//(1)获取dir的多有下一级
			File[] listFiles = dir.listFiles();
			for (File file : listFiles) {
//				sum += 每一个sub的大小; sub可以是一个文件，也可以是一个目录
				sum += getLength(file);//递归，当方法自己调用自己，就叫做递归
			}
			return sum;
		}
		
		return 0;
	}
	
	//可以删除一个文件或目录，包括非空目录
	public static void delete(File dir) {
		if (dir.isDirectory()) {
			//如果是文件夹，先删除他的下一级，使得dir成为空目录
			//(1)获取dir的所有下一级
			File[] listFiles = dir.listFiles();
			//(2)遍历每一个下一级，把下一级删除了
			for (File sub : listFiles) {
				delete(sub);
			}
			
		}
		
		//如果是文件和文件夹，最后都要删除自己
		dir.delete();
	}

}
