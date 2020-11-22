package com.atguigu.day13exer2;

/*
 * 1、写一个名为Account的类模拟账户
 * 	该类包括的属性：账号id，余额balance，年利率annualInterestRate
 * 	包含的方法，访问器方法（getter和setter方法），
 * 	返回月利率的方法getMonthlyInterest(),取款方法withdraw(),存款方法deposit().
 */
public class Account {
	
	private String id;
	private double balance;
	private double annualInterestRate;
	
	public Account() {
		
	}

	public Account(String id, double balance, double annualInterestRate) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	//返回月利率的方法getMonthlyInterest()
	public double getMonthlyInterest() {
		//月利率 = 年利率 / 12;
		return annualInterestRate / 12;
	}
	
	//取款方法withdraw()
	//参数：你取的金额
	public void withdraw(double amount) {
		
		//当取款金额小于0时
		if (amount < 0) {
			System.out.println("输入有误！");
			return;
		}
		
		//当余额不足时
		if (amount > balance) {
			System.out.println("余额不足！");
		}else {
			//当余额足够时
			balance -= amount;
		}
		
	}
	
	//存款方法deposit()
	//参数：你存的金额
	public void deposit(double amount) {
		
		//当存款金额小于0时
		if (amount < 0) {
			System.out.println("输入有误！");
			return;
		}else {
			//当存款金额大于0时
			balance += amount;
		}
		
	}
	
}
