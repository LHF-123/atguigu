package com.atguigu.day24;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

/*
 * 	对象IO流
 * 	ObjectOutputStream:输出对象，也称为序列化
 * 
 * 	ObjectInputStream:读取对象，也称为反序列化
 * 
 * 	序列化：（好比编码，而编码是把字符串转成字节）
 * 		把对象变成字节数据
 * 
 * 	反序列化：（好比解码，而解码是吧字节转为字符串）
 * 		把字节数据重构为一个对象
 * 
 * 	ObjectOutputStream：方法
 * 		writeObject(obj)
 * 
 */
public class TestObjectIO {
	
	@Test
	public void read() throws ClassNotFoundException, IOException{
		//（1）创建IO流对象
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("resources/emp.dat"));
	
		//（2）读取
		Object obj = ois.readObject();
		System.out.println(obj);
		
		//（3）关闭IO流
		ois.close();
	
	}
	
	@Test
	public void save() throws IOException{
		Employee emp = new Employee(1, "张三", 10000);
		emp.setCompany("尚硅谷");
		
		//（1）创建IO流对象
		//ObjectOutputStream不是节点流，也要包装一个OutputStream
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("resources/emp.dat"));
		
		//（2）输出对象
		oos.writeObject(emp);
		//如果Employee类没有实现java.io.Serializable
		//会报java.io.NotSerializableException: com.atguigu.day24.Employee异常
		
		//（3）关闭IO流
		oos.close();
				
	}

}
