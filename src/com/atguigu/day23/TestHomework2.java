package com.atguigu.day23;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 	2、完成该方法的代码
 * 	public static void copyDir(File srcDir, File destDir){
 * 	}
 * 	功能：把srcDir文件夹复制到destDir中
 * 	例如：
 * 		copyDir("d:/javase", "d:/atguigu");
 * 		复制d:/javase整个复制到d:atguigu文件中
 */
public class TestHomework2 {
	
	public static void main(String[] args) {
		try {
			copyDir(new File("E:/code/javase"), new File("E:/code/atguigu"));
			System.out.println("复制成功");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void copyDir(File srcDir, File destDir) throws IOException{
		//最后在前面排除一下特殊情况
		if (!destDir.exists() || !destDir.isDirectory()) {
			throw new IOException(destDir.getPath() + "不是一个合法的目录");
		}
		
		//srcDir不能是destDir的父目录
		//srcDir:d:/javase
		//destDir:d:/javase/api
		if (destDir.getPath().contains(srcDir.getPath())) {
			throw new IOException("不能把父目录复制到自己的子目录中");
		}
		
		//1、如果srcDir是一个文件夹，先在destDir中创建一个srcDir文件夹
		if (srcDir.isDirectory()) {
			//（1）先在destDir中创建一个srcDir文件夹
			String filePath = destDir.getPath() + "/" + srcDir.getName();
			File file = new File(filePath);
			file.mkdir();
			
			//（2）然后把srcDir的下一级，一一复制到file中
			//第一步，获取下一级
			File[] listFiles = srcDir.listFiles();
			//第二步，遍历
			for (File sub : listFiles) {
				//把每一个下级sub复制到file中
				copyDir(sub, file);
			}
			
		}
		//2、如果srcDir是一个文件，直接把文件复制destDir中
		else if (srcDir.isFile()) {
			//（1）创建IO流
			//输出流：从srcDir中读取数据
			FileInputStream fis = new FileInputStream(srcDir);
			//输出流：把数据写到destDir/xx文件中
			String filePath = destDir.getPath() + "/" + srcDir.getName();
			FileOutputStream fos = new FileOutputStream(filePath);
			//如果要效率更高，可以给fis包装BufferedInputStream,可以给fos包装BufferedOutputStream
			
			//（2）一边读一边写
			byte[] data = new byte[1024];
			int len;
			while ((len = fis.read(data)) != -1) {
				fos.write(data, 0, len);
			}
			
			//（3）关闭IO流
			fos.close();
			fis.close();
			
		}
		
		
	}

}
