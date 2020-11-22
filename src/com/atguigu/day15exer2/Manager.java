package com.atguigu.day15exer2;

import java.util.Arrays;

/*
 * 5、声明一个Manager类，有一个Person数组，
 * 	（1）在无参构造器中，创建这个数组对象，并初始化数组的元素
 * 		里面有乒乓球运动员和篮球运动员，乒乓球教练和篮球教练。
 * 	（2）声明一个方法，返回所有教练
 * 	（3）声明一个方法，返回所有运动员
 * 	（4）声明一个方法，返回所有要用英语交流的人
 * 	（5）声明一个方法，返回所有人
 */
public class Manager {
	
	private Person[] all;
	
	public Manager() {
		all = new Person[8];
		all[0] = new BasketballCoach("杨教练");
		all[1] = new BasketballSports("易建联");
		all[2] = new BasketballSports("姚明");
		all[3] = new BasketballSports("刘翔");
		all[4] = new BasketballSports("孙悦");
		
		all[5] = new PingPangCoach("陈教练");
		all[6] = new PingPangSports("马龙");
		all[7] = new PingPangSports("张继科");
	}
	
	//（2）声明一个方法，返回所有教练
	//返回值类型：多个教练，教练类型Coach
	public Coach[] getAllCoachs() {
		//统计教练的人数
		int count = 0;
		for (int i = 0; i < all.length; i++) {
			if (all[i] instanceof Coach) {
				count++;
			}
		}
		
		//把教练对象放到allCoachs中
		Coach[] allCoachs = new Coach[count];
		
		for (int i = 0, j = 0; i < all.length; i++) {
			if (all[i] instanceof Coach) {
				allCoachs[j++] = (Coach) all[i];
			}
		}
		
		return allCoachs;
		
	}
	
	//（3）声明一个方法，返回所有运动员
	public Sportsman[] getAllSportsman() {
		//统计运动员的人数
		int count = 0;
		for (int i = 0; i < all.length; i++) {
			if (all[i] instanceof Sportsman) {
				count++;
			}
		}
		
		//把运动员对象放到Sportsman中
		Sportsman[] allSportsmans = new Sportsman[count];
		
		for (int i = 0, j = 0; i < all.length; i++) {
			if (all[i] instanceof Sportsman) {
				allSportsmans[j++] = (Sportsman) all[i];
			}
		}
		
		return allSportsmans;
		
	}
	
	//（4）声明一个方法，返回所有要用英语交流的人
	public LearningEnglish[] getAllLearningEnglishs() {
		//统计要用英语交流的人数
		int count = 0;
		for (int i = 0; i < all.length; i++) {
			if (all[i] instanceof LearningEnglish) {
				count++;
			}
		}
		
		//把要用英语交流对象放到LearningEnglish中
		LearningEnglish[] allLearningEnglishs = new LearningEnglish[count];
		
		for (int i = 0, j = 0; i < all.length; i++) {
			if (all[i] instanceof LearningEnglish) {
				allLearningEnglishs[j++] = (LearningEnglish) all[i];
			}
		}
		
		return allLearningEnglishs;
	}
	
	//（5）声明一个方法，返回所有人
	public Person[] getAll() {
//		return all;//不建议这样做，防止数据被修改
		
		return Arrays.copyOf(all, all.length);//复制一份传过去
	}

}
