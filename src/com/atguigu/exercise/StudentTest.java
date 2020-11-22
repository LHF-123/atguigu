package com.atguigu.exercise;
/*
 * 定义类Student，包含三个属性：学号number(int),年级state(int),成绩score(int)。
 * 创建20个学生对象，学号为1到20， 年级和成绩都由随机数确定，打印出三年级(state值为3)的学生信息。
 * 
 * 提示：
 * 1）生成随机数：Math.random(),返回值类型double
 * 2）四舍五入取整：Math.round(double d)，返回值类型long
 */
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//如果数组的元素，是类类型的：对象数组
		Student[] students = new Student[20];
		System.out.println("学号\t年级\t成绩");
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student();
			students[i].number = i + 1;
			students[i].state = (int)(Math.random()*9 + 1);//1-9年级
			students[i].score = Math.round((Math.random() * 100));
			if (students[i].state == 3) {
				System.out.println(students[i].number + "\t"
				+ students[i].state + "\t" + students[i].score + "\t");
			}
		}
	}

}

class Student{
	int number;
	int state;
	long score;
}
