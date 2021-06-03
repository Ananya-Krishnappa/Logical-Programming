package com.bridgelabz;

public class StopWatch {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		printHello();
		long endTime = System.currentTimeMillis();
		printElapsedTime(startTime, endTime);
	}

	private static void printElapsedTime(long startTime, long endTime) {
		long elapsedTime = endTime - startTime;
		System.out.println("Elapsed time is: " + elapsedTime);
	}

	private static void printHello() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Hello");
		}
	}
}
