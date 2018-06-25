package com.suyog.schedular;

import java.util.Collections;


public class SJF extends SchedularAbstract{
	@Override
	public void runSchedular(int t) {
		DurationCompare durationCompare = new DurationCompare();
		Collections.sort(Driver.jobsList, durationCompare);
		
		System.out.println("SJF output");
		SchedularAbstract.assignJobsToQueues(Driver.N);
	}
}