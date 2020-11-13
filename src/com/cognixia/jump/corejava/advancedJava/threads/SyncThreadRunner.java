package com.cognixia.jump.corejava.advancedJava.threads;

public class SyncThreadRunner {

	public static void main(String[] args) {
	

		Thread[] threads = new Thread[3];
		
		for(int i = 0; i < threads.length; i++) {
			new Thread(new NumbersRunnable()).start();
		}

	}

}
