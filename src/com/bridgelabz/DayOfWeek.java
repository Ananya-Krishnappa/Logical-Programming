package com.bridgelabz;

import java.util.Scanner;

public class DayOfWeek {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day,month and year");
		int d = sc.nextInt();
		int m = sc.nextInt();
		int y = sc.nextInt();
		Util.dayOfWeek(d, m, y);
	}
}
