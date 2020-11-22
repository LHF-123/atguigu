package com.atguigu.day24exer;

public class TestExer3 {
	
	public static void main(String[] args) {
		Racer t = new Racer("兔子", 100, 10000);
		Racer w = new Racer("乌龟", 1000, 1000);
		
		t.start();
		w.start();
		
		try {
			t.join();//只是阻塞main
			w.join();//只是阻塞main
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//显示谁输谁赢
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
class Racer extends Thread{
	private long timePerMeter;//跑1米的时间
	private long restTime;//跑完10米的休息时间
	private long runTotalTime;//跑30米的总时间
	

	public Racer(String name, long timePerMeter, long restTime) {
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
	}

	public long getRunTotalTime() {
		return runTotalTime;
	}
	
}