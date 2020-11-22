package com.atguigu.day18;

/*
 * 	异常的处理：try...catch
 * 	1、语法结构
 * 	try{
 * 		可能发生异常的代码
 * 	}catch(异常的类型1  异常名称){
 * 		捕获到该异常，要如何处理的代码：（1）什么也不写（2）打印异常（3）其它的处理方式
 * 	}catch(异常的类型2  异常名称){
 * 		捕获到该异常，要如何处理的代码
 * 	}catch(异常的类型3  异常名称){
 * 		捕获到该异常，要如何处理的代码
 * 	}
 * 	......
 * 
 * 	说明：多个catch有要求，必须是小的类型在上面，大的类型在下面，如果没有大小关系，就随意。这里的小和大是继承关系，子类小于父类。
 * 
 * 	2、执行的特点
 * 	（1）如果try中的代码没有发生异常，只执行try中，不会执行catch
 * 	（2）如果try中的代码发生异常
 * 		A：有catch可以捕获它，那么哪个可以捕获就进哪个,按顺序找catch
 * 			如果catch住了，那么会从try...catch继续运行
 * 		B：所有的catch都无法捕获它，那么自动往“上”抛
 * 			如果没catch住。当前方法就结束了，带着“异常”回到上一级调用的位置。
 * 
 * 	命令行参数：是指给main的形参赋值的实参	
 * 	如何传：（1）java TestParam LHF
 * 			（2）Run菜单 --> RunConfigurations
 * 
 */
public class TestTryCatch {
	
	public static void main(String[] args) {
		//从命令行接收两个参数，做除法
		//第一个参数：args[0]
		//第二个参数：args[1]
		try {
			String s1 = args[0];
			String s2 = args[1];
			System.out.println("被除数：" + s1);
			System.out.println("除数：" + s2);
			
			int bei = Integer.parseInt(s1);
			int chu = Integer.parseInt(s2);
			int shang = bei / chu;
			System.out.println("商：" + shang);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("参数少于两个");
		}catch (NumberFormatException e) {
			System.out.println("你传的参数不是整数");
		}catch (ArithmeticException e) {
			System.out.println("除数不能为0");
		}catch (Exception e) {
			System.out.println("所有异常");
		}
		
	}

}
