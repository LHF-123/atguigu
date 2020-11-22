package com.atguigu.day12;

//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Scanner;

import java.util.*;

import com.atguigu.day12.day.Order;
import com.atguigu.day12exer1.Account;
//import com.atguigu.day12exer2.Account;
import com.atguigu.day12exer2.Bank;
import static java.lang.System.out;
import static java.lang.Math.*;

/*
 * 	一、package关键字的使用
 * 1.package：包
 * 2.作用：使用包的概念来区别不同的类的功能。换句话说，将相同结构或类型的类放在相同的包中，便于管理。
 * 3.package 声明在源文件的首行
 * 4.命名规范：xxxyyy.zzz.kkk
 * 5.每"."一次就相当于一层文件目录
 * 
 * 	二、import的关键字的使用
 * 1.import：导入
 * 2.我们可以在源文件中使用import显式的导入指定包下的类或接口
 * 3.声明位置：通常声明在package包声明和类文件之间
 * 4.如果使用的类或接口是当前包下的，则可以省略import的操作
 * 5.如果使用的类或接口是java.lang包下的，则也可以省略import的操作
 * 6.如果需要导入多个结构，则并列声明出即可
 * 7.可以使用“包名1.*”的方式，导入包名1下的所有结构
 * 8.如果类中出现了不同包下的同名的类，则至少有一个需要使用全类名的方式进行调用
 * 
 * 9.import static:导入指定包下的指定类或接口中的静态结构
 * 10.已经导入了a包下的所有结构，则如果需要导入a包的子包的话，仍需要import操作
 * 
 */
public class PackageImportTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Person person = new Person();
		
		Bank bank = new Bank();
		
		System.out.println("hello");
		
		String s = "123";
		
		ArrayList<Bank> list = new ArrayList<Bank>();
		
		HashMap<Person, Bank> map = new HashMap<Person, Bank>();
		
		Account account = new Account(1001, 2000, 0.0123);
		
		//Account account2 = new Account(2000);
		
		//使用全类名的方式
		com.atguigu.day12exer2.Account account2 = new com.atguigu.day12exer2.Account(2000);
		
		Date date = null;
		
		java.sql.Date date2 = null;
		
		out.println("hello1");
		
		double d = PI;
		
		Order order = null;
		
	}
}
