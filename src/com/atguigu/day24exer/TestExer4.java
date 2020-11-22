package com.atguigu.day24exer;

//volatile关键字：每次都去主存获取新的值
public class TestExer4 {
	
	public static void main(String[] args) {
		Runner t = new Runner("兔子", 100, 10000);
		Runner w = new Runner("乌龟", 1000, 1000);
		
		t.start();
		w.start();
		
		//一直监视是否有人跑完
		while (true) {
			if (t.isEnded() || w.isEnded()) {
				break;
			}
		}
		/*
		 * 	当main线程很频繁不断的连续的去获取ended变量的值，获取很多次之后发现这个值一直没变
		 * 	这个时候程序就自我优化了，它就不去（主存）重新获取新的值，而是用原来的值（缓存）一直在判断
		 */
		
		//显示谁输谁赢
		if (t.isEnded() && !w.isEnded()) {
			System.out.println("兔子赢");
		}else if (!t.isEnded() && w.isEnded()) {
			System.out.println("乌龟赢");
		}else {//都到达终点了
			long tRun = t.getRunTotalTime();
			long wRun = w.getRunTotalTime();
			
			if (tRun < wRun) {
				System.out.println("兔子赢");
			}else if (tRun > wRun) {
				System.out.println("乌龟赢");
			}else {
				System.out.println("平手");
			}
		}
		
	}

}
class Runner extends Thread{
	private long timePerMeter;//跑1米的时间
	private long restTime;//跑完10米的休息时间
	private long runTotalTime;//跑30米的总时间
	private volatile boolean ended;//如果为true，已经跑完
	//volatile关键字：每次都去主存获取新的值

	public Runner(String name, long timePerMeter, long restTime) {
		super(name);
		this.timePerMeter = timePerMeter;
		this.restTime = restTime;
	}

	@Override
	public void run() {
		long start = System.currentTimeMillis();
		for (int i = 0; i <= 30; i++) {//i是距离
			try {
				//跑1米需要的时间
				Thread.sleep(timePerMeter);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(getName() + "已经跑了" + i + "米");
			
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
		long end = System.currentTimeMillis();
		runTotalTime = end - start;
		ended = true;
		System.out.println(getName() + ":" + ended);
	}

	public long getRunTotalTime() {
		return runTotalTime;
	}

	public boolean isEnded() {
		return ended;
	}
	
}