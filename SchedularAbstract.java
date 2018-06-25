package com.suyog.schedular;

import java.util.LinkedList;
import java.util.Queue;

public abstract class SchedularAbstract {
	abstract void runSchedular(int threads);
	final static void assignJobsToQueues(int N) {
		Queue[] queArray = new Queue[N];
		int jindex=0;
		
		for(int i=0; i<N; i++) {
			queArray[i] = new LinkedList<Job>();
		}
		
		while (jindex != Driver.M) {
			for(int i=0; i<N && jindex<Driver.M; i++) {
				queArray[i].add(Driver.jobsList.get(jindex));
				jindex++;
			}	
		}
		for(int i=0; i<N; i++) {
			System.out.print("Thread"+" "+ i +" - ");
			
			while(!queArray[i].isEmpty()) { 
				  Job jb = (Job)queArray[i].poll();
				  System.out.print(jb.getJobName()+" ");
			}
			System.out.println();
		}
	}
}
