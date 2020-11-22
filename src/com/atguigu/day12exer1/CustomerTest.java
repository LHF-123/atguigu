package com.atguigu.day12exer1;
/*
 *  写一个测试程序。
 *  1.创建一个Customer，名字叫Jane Smith,他有一个账号为1000，余额为2000元，年利率为1.23%的账户。
 *  2.对Jane Smith操作
 *  	存入100元，再取出960元。再取出2000元。
 *  	打印出Jane Smith的基本信息
 *  	
 *  	成功存入100.0元
 *  	成功取出960.0元
 *  	余额不足，取款失败！
 *  
 *  Customer [Smith, Jane] has a account : id is 1000, annualInterestRate is 1.23%, balance is 1140.0
 */
public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer("Jane", "Smith");
		
		Account account = new Account(1000, 2000, 0.0123);
		
		customer.setAccount(account);
		
		//存入100元
		customer.getAccount().deposit(100);
		
		//再取出960元
		customer.getAccount().withdraw(960);
		
		//再取出2000元
		customer.getAccount().withdraw(2000);
		
		System.out.println("Customer [" + customer.getLastName() + ", " + customer.getFirstName()
		+ "] has a account : id is " + customer.getAccount().getId() + ", annualInterestRate is "
		+ customer.getAccount().getAnnualInterestRate() * 100 + "%, balance is " 
		+ customer.getAccount().getBalance());
	}

}
