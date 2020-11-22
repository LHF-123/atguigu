package com.study.extra;

public class FamilyAccount {
	
	public static void main(String[] args) {
		
		boolean isFlag = true;
		
		int balance = 10000;//初始金额
		
		String detail = "收支\t账户金额\t收支金额\t说    明\n";
		
		while(isFlag) {
			
			System.out.println("-----------------家庭收支记账软件-----------------\n");
			System.out.println("\t\t1 收支明细");
			System.out.println("\t\t2 登记收入");
			System.out.println("\t\t3 登记支出");
			System.out.println("\t\t4 退        出\n");
			
			System.out.print("请选择(1-4)：");
			
			char selection = Utility.readMenuSelection();
			
			switch (selection) {
			case '1':
				//System.out.println("收支明细");
				System.out.println("-----------------当前收支明细-----------------");
				System.out.println(detail);
				System.out.println("-------------------------------------------");
				break;
			case '2':
				//System.out.println("登记收入");
				System.out.print("本次收入金额：");
				int moneyIn = Utility.readNumber();
				System.out.println("本次收入说明：");
				String explainIn = Utility.readString();
				
				balance += moneyIn;
				detail += ("收入\t" + balance + "\t" +moneyIn + "\t" + explainIn + "\n");
				
				System.out.println("-----------------登记完成-----------------");
				break;
			case '3':
				//System.out.println("登记支出");
				System.out.print("本次支出金额：");
				int moneyOut = Utility.readNumber();
				System.out.println("本次支出说明：");
				String explainOut = Utility.readString();
				
				balance -= moneyOut;
				detail += ("支出\t" + balance + "\t" +moneyOut + "\t" + explainOut + "\n");
				
				System.out.println("-----------------登记完成-----------------");
				break;
			case '4':
				//System.out.println("退   出");
				System.out.print("确认是否退出(Y/N)：");
				char isExit = Utility.readConfirmSelection();
				if (isExit == 'Y') {
					isFlag = false;
				}
				break;
			}
			
		}
		
	}
	
}
