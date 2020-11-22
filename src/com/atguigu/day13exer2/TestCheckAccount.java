package com.atguigu.day13exer2;

/*
 * 	写一个测试类TestCheckAccount，在用户程序中，创建一个账号为11223344，余额为20000，年利率4.5%，
 * 	透支额度为5000的CheckAccount对象。
 * 	使用withdraw方法提款5000元，并打印账号余额和可透支额度
 * 	再使用withdraw方法提款18000元，并打印账号余额和可透支额度
 * 	再使用withdraw方法提款3000元，并打印账号余额和可透支额度
 * 	再使用deposit方法存款1000元，并打印账号余额和可透支额度
 * 	再使用withdraw方法提款5000元，并打印账号余额和可透支额度
 * 
 */
public class TestCheckAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckAccount cAccount = new CheckAccount("11223344", 20000, 0.045, 5000);
		
		cAccount.withdraw(5000);
		System.out.println("账户余额为：" + cAccount.getBalance());
		System.out.println("可透支额度为：" + cAccount.getOverdraft());
		System.out.println();
		
		cAccount.withdraw(18000);
		System.out.println("账户余额为：" + cAccount.getBalance());
		System.out.println("可透支额度为：" + cAccount.getOverdraft());
		System.out.println();
		
		cAccount.withdraw(3000);
		System.out.println("账户余额为：" + cAccount.getBalance());
		System.out.println("可透支额度为：" + cAccount.getOverdraft());
		System.out.println();
		
		cAccount.deposit(1000);
		System.out.println("账户余额为：" + cAccount.getBalance());
		System.out.println("可透支额度为：" + cAccount.getOverdraft());
		System.out.println();
		
		cAccount.withdraw(5000);
		System.out.println("账户余额为：" + cAccount.getBalance());
		System.out.println("可透支额度为：" + cAccount.getOverdraft());
		
		
	}

}
