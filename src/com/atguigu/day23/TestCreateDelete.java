package com.atguigu.day23;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

/*
 * 	文件的创建：
 * 		createNewFile()
 * 	目录的创建：
 * 		mkdir()
 * 		mkdirs()
 * 
 * 	删除文件：delete()
 * 	删除目录：delete()
 * 		如何删除非空目录？
 * 
 * 	重命名：renameTo(File 新文件/目录)
 * 
 */
public class TestCreateDelete {
	
	@Test
	public void test5() throws IOException {
		File file = new File("d:/新建文件夹/java/world");
		
		file.delete();
	}
	
	@Test
	public void test4() throws IOException {
		File file = new File("d:/1.txt");
		
		file.delete();
	}
	
	@Test
	public void test3() throws IOException {
		File file = new File("d:/新建文件夹/java/world");
		
		file.mkdirs();
	}
	
	@Test
	public void test2() throws IOException {
		File file = new File("d:/新建文件夹");
		
		file.mkdir();
	}
	
	@Test
	public void test1() throws IOException {
		File file = new File("d:/1.txt");
		
		file.createNewFile();
	}

}
