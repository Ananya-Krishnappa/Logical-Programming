package com.bridgelabz;

import java.util.Scanner;

public class MonthlyPayment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter P,Y and R values");
		int P = sc.nextInt();
		int Y = sc.nextInt();
		int R = sc.nextInt();
		Util.montlySalary(P, Y, R);
	}
}