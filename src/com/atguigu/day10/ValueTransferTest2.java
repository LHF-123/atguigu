package com.atguigu.day10;

public class ValueTransferTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Data data = new Data();
		System.out.println("m = " + data.m + ", n = " + data.n);
		
		ValueTransferTest2 v2 = new ValueTransferTest2();
		v2.swap(data);
		System.out.println("m = " + data.m + ", n = " + data.n);
	}

	public void swap(Data data) {
		int temp = data.m;
		data.m = data.n;
		data.n = temp;
	}
	
}

class Data{
	int m = 10;
	int n = 20;
}