package com.suyog.schedular;

public class SchedularManager {
	
	public static SchedularAbstract getSchedularInstance(String schedularType) {
		if(schedularType.equals("FCFS")) {
			return new FCFS();
		}
		else if(schedularType.equals("SJF")) {
			return new SJF();
		}
		else if(schedularType.equals("FPS")) {
			return new FPS();
		}
		return null;
	}
}
