package com.suyog.schedular;

public class FCFS extends SchedularAbstract{

	@Override
	public void runSchedular(int N) {
		System.out.println("FCFS output");
		SchedularAbstract.assignJobsToQueues(N);
	}
}