package com.cognixia.jump.corejava.advancedJava.threads;

public class NumThread extends Thread{
	
	
	//we have to override and implement the run method always, in order for a thread
	//to know what it is doing
	public void run() {
		//get the id for this thread
		System.out.println("Start Thread " + Thread.currentThread().getID());
		
		
		//use a for loop to create multiple threads
		for(int i = 0; i < 3; i++) {
			//we call the .start() to make the thread run
			//WE DO NOT call the .run() method directly
			//
		}
	}
}
