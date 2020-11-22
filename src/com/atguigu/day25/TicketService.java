package com.atguigu.day25;

import java.util.ArrayList;

public class TicketService {
	private ArrayList<String> all;

	public TicketService() {
		all = new ArrayList<String>();
//		all.add("01车01A");
//		all.add("01车01B");
//		all.add("01车01C");
//		all.add("01车01D");
//		all.add("01车01F");
//		
//		all.add("02车02A");
//		all.add("02车02B");
//		all.add("02车02C");
//		all.add("02车02D");
//		all.add("02车02F");
		
		for (int i = 1; i <= 300; i++) {
			all.add("车票：" + i);
		}
	}
	
	//查询是否还有票
	public boolean hasTicket() {
		return all.size() > 0;
	}
	
	//卖票
	public String sale() {
		return all.remove(0);
	}

}
