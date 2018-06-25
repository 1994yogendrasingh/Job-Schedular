package com.suyog.schedular;

import java.util.LinkedList;
import java.util.Scanner;

public class Driver{
	
	static public Scanner sc = new Scanner(System.in);
	public static int M, N;
	public static LinkedList<Job> jobsList = new LinkedList<>();
	static private void init() {
		System.out.println("Enter number of jobs");
		M = sc.nextInt();
		System.out.println("Enter number of threads");
		N = sc.nextInt();
		for(int i=0; i<M; i++) {
			jobsList.add(new Job(sc.next(), sc.nextInt(), sc.next(), sc.nextInt(), sc.next()));
		}
	}
	
	public static void main(String[] args) {
		init();
		SchedularAbstract jsFCFS = SchedularManager.getSchedularInstance("FCFS");
		SchedularAbstract jsSJF = SchedularManager.getSchedularInstance("SJF");
		SchedularAbstract jsFPS = SchedularManager.getSchedularInstance("FPS");
		jsFCFS.runSchedular(N);
		System.out.println();
		jsSJF.runSchedular(N);
		System.out.println();
		jsFPS.runSchedular(N);
	}

}