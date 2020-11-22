package com.atguigu.day13exer2;

/*
 * 2、创建Account类的一个子类CheckAccount代表可透支的账户
 * 	该账户中定义一个属性overdraft代表可透支限额。
 * 	在CheckAccount类中重写withdraw方法
 */
public class CheckAccount extends Account {
	
	private double overdraft;
	
	public CheckAccount() {
		// TODO Auto-generated constructor stub
	}

	public CheckAccount(String id, double balance, double annualInterestRate, double overdraft) {
		super(id, balance, annualInterestRate);
		// TODO Auto-generated constructor stub
		this.overdraft = overdraft;
	}

	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}

	@Override
	public void withdraw(double amount) {
		
		if (amount < 0) {
			System.out.println("输入有误！");
		}
		
		//取款金额 <= 余额
		if (amount <= getBalance()) {
			//修改余额
			setBalance(getBalance() - amount);
		}else if (amount < getBalance() + overdraft) {
			//取款金额超过了余额，但是在可透支的范围内
			//（1）修改可透支额度
			overdraft -= amount - getBalance();
			//(2)修改余额
			setBalance(0);
		}else if (amount > getBalance() + overdraft) {
			//超过可透支的范围
			System.out.println("超过可透支额度！");
		}
		
	}
	
	

}
