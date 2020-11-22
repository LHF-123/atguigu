package com.atguigu.day25;

import java.util.Random;

//2、丈夫和妻子共同用一个银行账户，丈夫负责存钱，妻子负责取钱
public class TestAccount {
	
	public static void main(String[] args) {
		Account a = new Account();
		Random r = new Random();
		
		new Thread("丈夫") {
			public void run() {
				while (true) {
					a.save(r.nextInt(1000));//[0, 1000)
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		}.start();
		
		new Thread("妻子") {
			public void run() {
				while (true) {
					a.withdraw(r.nextInt(1000));//[0, 1000)
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		}.start();
	}

}
class Account {
	//忽略了其他属性
	private double balance;
	
	public synchronized void save(double money) {
		if (money < 0) {
			throw new IllegalArgumentException(money + "不能为负数");
		}
		balance += money;
		System.out.println(Thread.currentThread().getName() + "存了：" + money + "现在余额为：" + balance);
		this.notify();
	}
	
	public synchronized void withdraw(double money) {
		if (money < 0) {
			throw new IllegalArgumentException(money + "不能为负数");
		}
		while (money > balance) {
//			throw new RuntimeException("余额不足");
					
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance -= money;
		System.out.println(Thread.currentThread().getName() + "取了：" + money + "现在余额为：" + balance);
	}
}