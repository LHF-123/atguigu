package com.atguigu.day12exer;

public class BoyGirlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Boy boy = new Boy("小明", 23);
		
		Girl girl = new Girl("小红", 20);
		
		girl.marry(boy);
		
		Girl girl2 = new Girl("祝英台", 21);
		int compare = girl.compare(girl2);
		System.out.println(compare);
		
		boy.shut();
	}

}
