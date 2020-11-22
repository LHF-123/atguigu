package com.atguigu.exercise;

public class ValueTransferExer {

	public static void main(String[] args) {
		ValueTransferExer t = new ValueTransferExer();
		t.first();
	}

	private void first() {
		// TODO Auto-generated method stub
		int i = 5;
		Value v = new Value();
		v.i = 25;
		second(v, i);
		System.out.println(v.i);//20
	}

	private void second(Value v, int i) {
		// TODO Auto-generated method stub
		i = 0;
		v.i = 20;
		Value val = new Value();
		v = val;
		System.out.println(v.i + " " + i);//v.i == 15  i == 0
		
	}
	
}

class Value{
	int i = 15;
}



