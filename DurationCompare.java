package com.suyog.schedular;

import java.util.Comparator;

public class DurationCompare implements Comparator<Job>{

	@Override
	public int compare(Job j1, Job j2) {
		
		if(j1.getDuration() == j2.getDuration()){
		    return j1.getPriority().compareTo(j2.getPriority());
		}else{
		    return j1.getDuration() - j2.getDuration();
		}
		
	}
}
