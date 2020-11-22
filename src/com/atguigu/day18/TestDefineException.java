package com.atguigu.day18;

import java.util.Scanner;

import org.junit.Test;

/*
 * Java中都讲究“见名知意”
 * 	1、
 * 	Throwable类是Java语言中所有错误或异常的超类。
 * 	只有当对象是此类（或其子类之一）的实例时，才能通过Java虚拟机或者Java throw语句抛出
 * 	类似的，只有此类或其子类之一才可以是catch子句中的参数类型
 * 
 * 	结论：要想一个类成为“异常类型”，必须继承Throwable或者它的子类。
 * 
 * 	2、自定义异常的对象，只能由throw语句手动抛出。
 * 
 * 	3、建议自定义异常，尽量增加两个构造器
 * 		（1）无参构造尽量保留
 * 		（2）有参构造：异常类型(String message)，可以为message属性赋值
 * 
 * 
 * 	需求：
 * 		从键盘输入用户名、密码和检验码。
 * 		当校验码错误时，用异常来表示
 * 
 * 	Exception：
 * 	（1）构造器：可以为message属性赋值
 * 		new Exception("校验码错误")
 * 	（2）String getMessage()
 * 	（3）printStackTrace()：打印异常的堆栈信息
 * 
 * 	专门打印错误信息的：System.err
 * 
 */
public class TestDefineException {
	
	@Test
	public void test2() {
		System.out.println("hello");
		System.err.println("world");
	}
	
	@Test
	public void test() {
		try {
			login();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void login() throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入用户名：");
		String username = scanner.nextLine();
		
		System.out.print("请输入密码：");
		String password = scanner.nextLine();
		
		String code = "1234";
		System.out.print("请输入校验码（" + code + "）：");
		String check = scanner.nextLine();
		
		if (!code.equals(check)) {
			throw new Exception("校验码输入错误");//非运行时异常，按编译时异常
			//throw new RuntimeException("校验码输入错误");
		}
		
		//做一个假登陆
		//假设用户名：admin，密码：123
		if (!("admin".equals(username) && "123".equals(password))) {
			throw new UsernameOrPasswordError("用户名或密码错误");
		}
		
	}
}
class UsernameOrPasswordError extends Exception{

	public UsernameOrPasswordError() {
		super();
	}

	public UsernameOrPasswordError(String message) {
		super(message);
	}
	
}
