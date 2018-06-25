package com.suyog.schedular;

public class Job {
	private String jobName="";
	private int duration;
	private String priority="";
	private int deadline;
	private String userType = "";
	Job(String jn, int dur, String pr, int dl, String ut){
		this.jobName = jn;
		this.duration = dur;
		this.priority = pr;
		this.deadline = dl;
		this.userType = ut;
	}
	public String getJobName() {
		return this.jobName;
	}
	public int getDuration() {
		return this.duration;
	}
	public String getPriority() {
		return this.priority;
	}
	public int getDeadLine() {
		return this.deadline;
	}
	public String getUserType() {
		return this.userType;
	}
}
