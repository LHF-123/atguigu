package com.atguigu.day24exer;

public class TestExer2 {
	
	public static void main(String[] args) {
		Player t = new Player("兔子", 100, 10000);
		Player w = new Player("乌龟", 1000, 1000);
		
		t.start();
		w.start();
		
	}

}
class Player extends Thread{
	private long timePerMeter;//跑1米的时间
	private long restTime;//跑完10米的休息时间
	

	public Player(String name, long timePerMeter, long restTime) {
		super(name);
		this.timePerMeter = timePerMeter;
		this.restTime = restTime;
	}

	@Override
	public void run() {
		for (int i = 0; i <= 30; i++) {//i是距离
			try {
				//跑1米需要的时间
				Thread.sleep(timePerMeter);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//每跑完10米休眠10秒
			try {
				if (i == 10 || i == 20) {
					System.out.println(getName() + "跑了" + i + "米，" + getName() +"休息中......");
					Thread.sleep(restTime);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(getName() + "到达终点");
	}
	
}