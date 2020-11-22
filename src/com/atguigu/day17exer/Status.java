package com.atguigu.day17exer;

/*
 * 1、声明一个枚举类型Status,
 * 	Status（员工状态），可以限定为4个：空闲（Free），忙（Busy），休假（Vocation），离职（Left）
 * 
 * 2、给Status声明一个属性，String desc,并在创建常量对象时，为desc赋值对应的意思，例如Busy对象赋值忙
 */
public enum Status {
	//常量对象建议大写
	FREE("空闲"),
	BUSY("忙"),
	VOCATION("休假"),
	LEFT("离职");
	
	private String desc;

	private Status(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return name() + ":" + desc;
	}
	
	

}
