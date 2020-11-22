package project02;
/**
 * 	CustomerView为主模块，负责菜单的显示和处理用户的操作
 * @author LHF
 *
 */
public class CustomerView {
	
	private CustomerList customerList = new CustomerList(10);
	
	//在构造器中添加一个用户方便测试
	public CustomerView() {
		// TODO Auto-generated constructor stub
		Customer cust = new Customer("张三", '男', 30, "10086", "10086@yidong.com");
		customerList.addCustomer(cust);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerView customerView = new CustomerView();
		customerView.enterMainMenu();
		
	}
	
	/**
	 * 	显示主界面的操作
	 */
	public void enterMainMenu() {
		boolean isFlag = true;
		while (isFlag) {
			
			System.out.println("\n---------------客户信息管理软件---------------\n");
			System.out.println("		  1 添加客户");
			System.out.println("		  2 修改客户");
			System.out.println("		  3 删除客户");
			System.out.println("		  4 客户列表");
			System.out.println("		  5 退	出\n");
			System.out.print("  请选择(1-5)：");
			char menu = CMUtility.readMenuSelection();//'1' 而非 1
			switch (menu) {
			case '1':
				addNewCustomer();
				break;
			case '2':
				modifyCustomer();
				break;
			case '3':
				deleteCustomer();
				break;
			case '4':
				listAllCustomer();
				break;
			case '5':
				System.out.println("确认是否退出(Y/N)：");
				char isExit = CMUtility.readConfirmSelection();
				if (isExit == 'Y') {
					isFlag = false;
				}
				
			}
			
		}
		
	}
	
	/**
	 * 	添加新客户的操作
	 */
	public void addNewCustomer() {
		//System.out.println("添加新客户的操作");
		System.out.println("---------------添加客户---------------");
		System.out.print("姓名：");
		String name = CMUtility.readString(10);
		System.out.print("性别：");
		char gender = CMUtility.readChar();
		System.out.print("年龄：");
		int age = CMUtility.readInt();
		System.out.print("电话：");
		String phone = CMUtility.readString(11);
		System.out.print("邮箱：");
		String email = CMUtility.readString(25);
		
		//将数据封装到一个Customer对象中
		Customer customer = new Customer(name, gender, age, phone, email);
		boolean addSucess = customerList.addCustomer(customer);
		if (addSucess) {
			System.out.println("---------------添加完成---------------");
		}else {
			System.out.println("---------------添加失败---------------");
		}
	}
	
	/**
	 * 	修改客户的操作
	 */
	public void modifyCustomer() {
//		System.out.println("修改客户的操作");
		System.out.println("---------------修改客户---------------");
		Customer customer;
		int number;
		
		for ( ; ; ) {
			System.out.print("请选择待修改的客户编号(-1退出)：");
			number = CMUtility.readInt();
			if (number == -1) {
				return;
			}
			
			customer = customerList.getCustomer(number - 1);//客户编号是从1开始的
			if (customer == null) {
				System.out.println("无法找到指定用户！");
			}else {
				break;//跳出循环
			}
			
		}
		
		System.out.print("姓名（" + customer.getName() + "）：");
		String name = CMUtility.readString(10, customer.getName());
		System.out.print("性别（" + customer.getGender() + "）：");
		char gender = CMUtility.readChar(customer.getGender());
		System.out.print("年龄（" + customer.getAge() + "）：");
		int age = CMUtility.readInt(customer.getAge());
		System.out.print("电话（" + customer.getPhone() + "）：");
		String phone = CMUtility.readString(11, customer.getPhone());
		System.out.print("邮箱（" + customer.getEmail() + "）：");
		String email = CMUtility.readString(25, customer.getEmail());
		
		Customer customer2 = new Customer(name, gender, age, phone, email);
		
		boolean isRepalce = customerList.replaceCustomer(number - 1, customer2);
		if (isRepalce) {
			System.out.println("---------------修改完成---------------");
		}else {
			System.out.println("---------------修改失败---------------");
		}
		
	}
	
	/**
	 * 	删除客户的操作
	 */
	public void deleteCustomer() {
//		System.out.println("删除客户的操作");
		System.out.println("---------------删除客户---------------");
		int number;
		
		for ( ; ; ) {
			System.out.print("请选择待删除的客户编号(-1退出)：");
			number = CMUtility.readInt();
			if (number == -1) {
				return;
			}
			
			Customer customer = customerList.getCustomer(number - 1);//客户编号从一开始
			if (customer == null) {
				System.out.println("无法找到指定用户！");
			}else {
				break;//跳出循环
			}
			
		}
		System.out.print("是否确认删除(Y/N)：");
		char confirmDelete = CMUtility.readConfirmSelection();
		
		if (confirmDelete == 'Y') {
			boolean isDelete = customerList.deleteCustomer(number - 1);
			if (isDelete) {
				System.out.println("---------------删除完成---------------");
			}else {
				System.out.println("---------------删除失败---------------");
			}
			
		}
		
		
	}
	
	/**
	 * 	显示所有客户的操作
	 */
	private void listAllCustomer() {
		//System.out.println("显示所有客户的操作");
		
		System.out.println("---------------客户列表---------------");
		int total = customerList.getTotal();
		if (total == 0) {
			System.out.println("没有客户记录！");
		}else {
			System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
			Customer[] custs = customerList.getAllCustomers();
			for (int i = 0; i < custs.length; i++) {
				Customer cust = custs[i];
				
//				System.out.println((i + 1) + cust[i].getName() + "\t" + cust[i].getGender() + "\t"
//				+ cust[i].getAge() + "\t" + cust[i].getPhone() + "\t" + cust[i].getEmail());
				
				System.out.println((i + 1) + "\t" + cust.info());
			}
		}
		
		
		
		System.out.println("---------------客户列表完成---------------");
	}
	
}
