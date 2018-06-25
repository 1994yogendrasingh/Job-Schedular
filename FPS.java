package com.suyog.schedular;

import java.util.Collections;

public class FPS extends SchedularAbstract{

	@Override
	void runSchedular(int threads) {
		
		Collections.sort(Driver.jobsList, new PriorityCompare());
		System.out.println("FPS output");
		SchedularAbstract.assignJobsToQueues(Driver.N);
	}

}
