package com.atguigu.day23;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 	1、传统的try...catch
 * 	资源的声明，例如IO流的声明
 * 	try{
 * 	 ....
 * 	}catch(异常类型 e){
 * 	 ....
 * 	}finally{
 * 		资源的关闭
 * 	}
 * 
 *  2、try...with...resources	JDK 1.7之后引入的
 * 	语法结构
 * 	try(资源的声明){
 * 		....
 * 	}catch(异常类型 e){
 * 		....
 * 	}
 * 	finally不用写了，使用完，这个资源自动关闭
 * 	
 * 
 */
public class TestTryWithResource {
	
	public static void copyFile2(String srcPath, String destPath) {
		try (FileInputStream fis = new FileInputStream(srcPath);
			 FileOutputStream fos = new FileOutputStream(destPath);
			 BufferedInputStream bis = new BufferedInputStream(fis);
			 BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			byte[] data = new byte[1024];
			int len;
			while ((len = bis.read(data)) != -1) {
				bos.write(data, 0, len);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void copyFile(String srcPath, String destPath) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			fis = new FileInputStream(srcPath);
			fos = new FileOutputStream(destPath);
			
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			byte[] data = new byte[1024];
			int len;
			while ((len = bis.read(data)) != -1) {
				bos.write(data, 0, len);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				bis.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
			try {
				fos.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
