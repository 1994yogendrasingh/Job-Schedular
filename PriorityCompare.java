package com.suyog.schedular;

import java.util.Comparator;

public class PriorityCompare implements Comparator<Job>{
	public int compare(Job j1, Job j2) {
		if(j1.getPriority().equals(j2.getPriority())) {
			if(j1.getUserType().equals(j2.getUserType())){
				return j1.getDuration() - j2.getDuration();
			}
			else {
				if(j1.getUserType().equals("root") ||  (j1.getUserType().equals("admin")&&j2.getUserType().equals("user"))) {
					return -1;
				}
				else if(j1.getUserType().equals("user") ||  (j1.getUserType().equals("admin")&&j2.getUserType().equals("root"))) {
					return 2;
				}
			}
		}
		else 
			return j1.getPriority().compareTo(j2.getPriority());
		return 0;
		
	}
}
/*
r ret 2
a u ret 2
a r ret -1
u ret -1*/