package project02;

/**
 * 	CustomerList为Customer对象的管理模块，内部使用数组管理一组Customer对象
 * @author LHF
 *
 */
public class CustomerList {
	
	private Customer[] customers;//用来保存客户对象的数组
	private int total;//记录已保存客户对象的数量
	
	/**
	 * 	CustomerList构造器
	 * @param totalCustomer：指明创建的Customer数组的长度
	 */
	public CustomerList(int totalCustomer) {
		// TODO Auto-generated constructor stub
		customers = new Customer[totalCustomer];
	}
	
	/**
	 * 	将指定的customer添加到customers数组中
	 * @param customer
	 * @return 是否添加成功。true：添加成功 ; false：添加失败
	 */
	public boolean addCustomer(Customer customer) {
		
		if (total >= customers.length) {
			return false;
		}
//		customers[total] = customer;
//		total++; 或
		customers[total++] = customer;
		return true;
	}
	
	/**
	 * 	替换指定索引位置上的客户
	 * @param index：要替换的位置
	 * @param cust：要替换为的对象
	 * @return 替换是否成功。
	 */
	public boolean replaceCustomer(int index, Customer cust) {
		if (index < 0 || index >= total) {
			return false;
		}
		
		customers[index] = cust;
		return true;
	}
	
	/**
	 * 	删除指定索引位置上的元素
	 * @param index
	 * @return 删除是否成功
	 */
	public boolean deleteCustomer(int index) {
		if (index < 0 || index >= total) {
			return false;
		}
		
		for (int i = index; i < total - 1; i++) {
			customers[i] = customers[i + 1];
		}
//		customers[total - 1] = null;
//		total--;  或
		customers[--total] = null;
		return true;
	}
	
	/**
	 * 
	 * @return 返回所有构成的数组
	 */
	public Customer[] getAllCustomers() {
		//return customers;
		
		Customer[] custs = new Customer[total];
		for (int i = 0; i < custs.length; i++) {
			custs[i] = customers[i];
		}
		
		return custs;
		
	}
	
	/**
	 * 	返回指定索引位置上的客户
	 * @param index
	 * @return
	 */
	public Customer getCustomer(int index) {
		
		if (index < 0 || index >= total) {
			return null;
		}
		
		return customers[index];
		
	}
	
	/**
	 * 	返回存储的客户的数量
	 * @return
	 */
	public int getTotal() {
		return total;
	}
	
}
