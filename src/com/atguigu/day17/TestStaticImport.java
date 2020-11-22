package com.atguigu.day17;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;

import static java.lang.Math.*;

/*
 * import导包：
 * 	（1）import 包名.类名;
 * 	（2）import 包名.*;
 * 	（3）import static 包名.类名.静态成员;
 * 	（4）import static 包名.类名.*;
 */
public class TestStaticImport {
	
	public static void main(String[] args) {
//		System.out.println(Math.PI);
//		System.out.println(Math.sqrt(6));
		
		System.out.println(PI);
		System.out.println(sqrt(6));
		
	}

}

//@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.LOCAL_VARIABLE})
@Target({METHOD, FIELD, TYPE, LOCAL_VARIABLE})
@interface C{
	
}
