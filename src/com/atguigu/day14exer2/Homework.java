package com.atguigu.day14exer2;

/*
 * 	一、练习1
 * 1、声明一个交通工具类Vehicle类，包含start(),stop(),run()方法
 * 2、声明一个公交车Bus类，继承Vehicle类，增加一个方法count()
 * 3、声明一个货车Truck()类，继承Vehicle类，增加一个方法checkWeight()
 * 4、编写一个检查站Checkpoint,有一个方法check(Vehicle),在这个方法中，可以检查各种车辆，步骤
 * 	（1）stop:停车
 * 	（2）检查：如果是公交车，查人数是否超载，如果是货车，称重量是否超重
 * 	（3）start:启动
 * 	（4）run:走
 */
public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Checkpoint checkpoint = new Checkpoint();
		checkpoint.check(new Bus());
		System.out.println();
		checkpoint.check(new Truck());
				
	}

}
