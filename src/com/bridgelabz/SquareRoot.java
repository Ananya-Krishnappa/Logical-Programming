package com.bridgelabz;

import java.util.Scanner;

public class SquareRoot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		double l = 0.00001;
		System.out.println(Util.squareRoot(n, l));
	}
}
