package com.atguigu.day24exer;

/*
 * 	案例：编写龟兔赛跑多线程程序，设赛跑长度为30米
 * 		兔子的速度是10米每秒，兔子每跑完10米休息10秒
 * 		乌龟的速度是1米每秒，乌龟每跑完10米休息1秒
 * 	要求：要等兔子和乌龟线程结束，主线程（裁判）才能公布最后结果
 * 
 * 	线程对象：兔子、乌龟、主线程
 * 
 */
public class TestExer {
	
	public static void main(String[] args) {
		TuZi t = new TuZi();
		WuGui w = new WuGui();
		
		t.start();
		w.start();
	}

}
class TuZi extends Thread{

	@Override
	public void run() {
		for (int i = 0; i <= 30; i++) {//i是距离
			try {
				//兔子的速度是10米每秒
				//跑1米需要0.1秒，100毫秒
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//兔子跑完10米休眠10秒
			try {
				if (i == 10 || i == 20) {
					System.out.println("兔子跑了" + i + "米，兔子休息中......");
					Thread.sleep(10000);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("兔子到达终点");
	}
	
}
class WuGui extends Thread{

	@Override
	public void run() {
		for (int i = 0; i <= 30; i++) {//i是距离
			try {
				//乌龟的速度是1米每秒
				//跑1米需要1秒，1000毫秒
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//乌龟跑完10米休眠1秒
			try {
				if (i == 10 || i == 20) {
					System.out.println("乌龟跑了" + i + "米，乌龟休息中......");
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("乌龟到达终点");
	}
	
}