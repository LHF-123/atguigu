package com.atguigu.day14exer2;

public class Checkpoint {
	public void check(Vehicle v) {
		v.stop();
		
		if (v instanceof Bus) {
			Bus bus = (Bus)v;
			bus.count();
		}else if (v instanceof Truck) {
			Truck truck = (Truck)v;
			truck.checkWeight();
		}
		
		v.start();
		v.run();
	}
}
