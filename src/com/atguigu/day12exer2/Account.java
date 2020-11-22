package com.atguigu.day12exer2;
/*
 * 在提款方法withdraw()中，需要判断用户余额是否能满足提款数额的要求，如果不能则给出提示。deposit()方法表示存款。
 */
public class Account {
	
	private double balance;
	
	public Account(double init_balance) {
		this.balance = init_balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	//存款
	public void deposit(double amt) {
		if (amt > 0) {
			balance += amt;
			System.out.println("成功存款" + amt + "元");
		}
	}
	
	//取钱
	public void withdraw(double amt) {
		if (balance >= amt) {
			balance -= amt;
			System.out.println("成功取出" + amt + "元");
			return;
		}
		System.out.println("余额不足，取款失败");
	}
	
}
