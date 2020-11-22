package com.atguigu.day24;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import org.junit.Test;

/*
 * 	面试题：序列化对象类型，要求实现什么接口？
 * 	java.io.Serializable
 * 
 * 	只有这一种吗？
 * 	也可以实现java.io.Externalizable接口，但是实现这个接口，必须实现（重写）两个抽象方法
 * 	void writeExternal(ObjectOutput out)
 * 	void readExternal(ObjectInput in) 
 * 
 * 	有了这两个方法，如何序列化和反序列化都是程序员说了算。
 * 	哪些属性序列化，以及顺序都是自己定，不像Serializable（顺序都是默认的，static和transient不参与）
 * 
 */
public class TestExternalizable {
	
	@Test
	public void read() throws ClassNotFoundException, IOException{
		//（1）创建IO流对象
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("resources/stu.dat"));
	
		//（2）读取
		Object obj = ois.readObject();
		System.out.println(obj);
		
		//（3）关闭IO流
		ois.close();
	
	}
	
	@Test
	public void save() throws IOException{
		Student stu = new Student(1, "张三", 23);
		stu.setSchool("尚硅谷");
		
		//（1）创建IO流对象
		//ObjectOutputStream不是节点流，也要包装一个OutputStream
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("resources/stu.dat"));
		
		//（2）输出对象
		oos.writeObject(stu);
		//如果Employee类没有实现java.io.Serializable
		//会报java.io.NotSerializableException: com.atguigu.day24.Employee异常
		
		//（3）关闭IO流
		oos.close();
				
	}
}
