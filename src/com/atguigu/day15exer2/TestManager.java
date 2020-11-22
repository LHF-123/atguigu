package com.atguigu.day15exer2;

/*
 * 6、在测试类中测试
 * 	（1）打印所有人的信息
 * 	（2）获取所有教练，调用他们的teach()
 * 	（3）获取所有运动员，调用他们的play()
 * 	（4）获取所有要用英语交流的人，调用他们的learn()
 */
public class TestManager {

	public static void main(String[] args) {
		Manager manager = new Manager();
		
		//（1）打印所有人的信息
		
		 Person[] all = manager.getAll(); for (int i = 0; i < all.length; i++) {
		 System.out.println(all[i]); }
		 
		 System.out.println("-------------------------------");
		
		 //（2）获取所有教练，调用他们的teach() 
		 Coach[] allCoachs = manager.getAllCoachs(); 
		 for (int i = 0; i < allCoachs.length; i++) { 
			 System.out.print(allCoachs[i].getName() + " "); 
			 allCoachs[i].teach(); 
		 }
		 
		 System.out.println("-------------------------------");
		 
		 //（3）获取所有运动员，调用他们的play() 
		 Sportsman[] allSportsmans = manager.getAllSportsman(); 
		 for (int i = 0; i < allSportsmans.length; i++) {
			System.out.print(allSportsmans[i].getName() + " "); 
		 	allSportsmans[i].play();
		 }
		 
		 System.out.println("-------------------------------");
		 
		
		//（4）获取所有要用英语交流的人，调用他们的learn()
		LearningEnglish[] allLearningEnglishs = manager.getAllLearningEnglishs();
		for (int i = 0; i < allLearningEnglishs.length; i++) {
			System.out.print(allLearningEnglishs[i] + " ");
			allLearningEnglishs[i].learn();
		}
		
	}

}
