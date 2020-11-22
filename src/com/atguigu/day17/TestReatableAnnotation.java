package com.atguigu.day17;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

/*
 * JDK 1.8可重复注解
 * 	（1）必须在@RoleAnnotation上面加一个元注解@Repeatable(xx)
 * 		这个可重复注解在哪个容器可以使用，这个容器必须是一个注解的类型
 * 	（2）这个可重复的注解，必须和容器的target是一样的，或者比容器的这个target要大
 */
@RoleAnnotations({@RoleAnnotation(role = "admin"), @RoleAnnotation(role = "manager"), @RoleAnnotation(role = "saler")})
public class TestReatableAnnotation {
	
	//使用注解，因为@RoleAnnotations注解的配置参数是RoleAnnotation[]，那么每一个数组的元素就是一个注解@RoleAnnotation(role = "admin")
	@RoleAnnotations({@RoleAnnotation(role = "admin"), @RoleAnnotation(role = "manager"), @RoleAnnotation(role = "saler")})
	public void add() {
		
	}
	
	@RoleAnnotation(role = "admin")
	@RoleAnnotation(role = "manager")
	@RoleAnnotation(role = "saler")
	public void update() {
		
	}

}
//自定义一个注解，这个注解有一个配置参数role，它的类型是String，这个注解只能用在方法上
@Repeatable(RoleAnnotations.class)//RoleAnnotations是容器，是因为他的配置参数的类型是RoleAnnotation[]
@Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
@interface RoleAnnotation{
	String role() default "admin";
}

//这是另一个自定义注解
//它的配置参数value，它的类型注解的数组类型
@Target({ElementType.METHOD,ElementType.TYPE})
@interface RoleAnnotations{
	RoleAnnotation[] value();
}