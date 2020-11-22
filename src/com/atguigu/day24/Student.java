package com.atguigu.day24;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Student implements Externalizable{
	private static String school;
	private int id;
	private String name;
	private transient int age;
	
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Student() {
		super();
	}

	public static String getSchool() {
		return school;
	}

	public static void setSchool(String school) {
		Student.school = school;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", school = " + school + "]";
	}
	
	//由程序员来决定，如何序列化Student的对象，即哪些成员变量需要序列化，以及顺序
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(school);
		out.writeInt(id);
		out.writeUTF(name);
		out.writeInt(age);
	}
	
	//由程序员决定，如何反序列化
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		school = in.readUTF();
		id = in.readInt();
		name = in.readUTF();
		age = in.readInt();
	}
	
}
