package com.atguigu.day12exer2;

public class Bank {
	
	private Customer[] customers;//多个客户
	private int numberOfCustomers;//记录银行客户的个数
	
	public Bank() {
		customers = new Customer[10];
	}
	
	//添加客户
	public void addCustomer(String f, String l) {
		
		if (numberOfCustomers < customers.length) {
			//创建指定姓名的客户
			Customer customer = new Customer(f, l);
			
//			customers[numberOfCustomers] = customer;
//			numberOfCustomers++;
			
			customers[numberOfCustomers++] = customer;
		}else {
			System.out.println("银行客户已满！");
		}

		
	}
	
	//返回银行中客户的个数
	public int getNumOfCustomers() {
		return numberOfCustomers;
		//错误的
//		return customers.length;
	}
	
	//返回指定索引位置上的客户
	public Customer getCustomer(int index) {
		if (index >= 0 && index < numberOfCustomers) {
			return customers[index];
		}
		return null;
		//抛出异常
//		throw new RuntimeException("您输入的索引有误");
	}
	
}
