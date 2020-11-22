package com.study.extra;

public class LuoJi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean x = true;
		boolean y = false;
		short z = 42;
		if((z++ == 42)&&(y = true)) 
			z++;
		System.out.println(z);
		if((x == false) || (++z == 45))
			z++;
		System.out.println("z = " + z);
		System.out.println("y = " + y);
		
	}

}
