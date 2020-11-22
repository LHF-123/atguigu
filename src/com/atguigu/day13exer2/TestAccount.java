package com.atguigu.day13exer2;

/*
 * 	写一个测试类TestAccount，在用户程序中，创建一个账号为11223344，余额为20000，年利率4.5%的Account对象。
 * 	使用withdraw方法提款30000元，并打印余额。
 * 	再使用withdraw方法提款2500元，使用deposit方法存款3000元，然后打印余额和月利率
 */
public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account("11223344", 20000, 0.045);
		
		account.withdraw(30000);
		System.out.println("余额为：" + account.getBalance());
		
		account.withdraw(2500);
		System.out.println("余额为：" + account.getBalance());
		
		account.deposit(3000);
		System.out.println("余额为：" + account.getBalance());
		System.out.println("月利率为：" + account.getMonthlyInterest() * 100 + "%");
		
	}

}
