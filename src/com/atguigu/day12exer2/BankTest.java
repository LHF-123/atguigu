package com.atguigu.day12exer2;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank();
		bank.addCustomer("明", "小");
		bank.addCustomer("红", "小");
		bank.addCustomer("李", "小");
		
		bank.getCustomer(0).setAccount(new Account(1000));
		bank.getCustomer(1).setAccount(new Account(2000));
		
		for (int i = 0; i < bank.getNumOfCustomers(); i++) {
			Customer customer = bank.getCustomer(i);
			Account account = customer.getAccount();
			if (account != null) {
				System.out.println("[" + customer.getLastName() + " " + customer.getFirstName() +
				"]的账户余额为" + customer.getAccount().getBalance());
			}else {
				System.out.println("[" + customer.getLastName() + " " + customer.getFirstName() +
				"]没有办理银行账户");
			}
			
		}
		
	}

}
