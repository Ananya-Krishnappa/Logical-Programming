package com.bridgelabz;

import java.util.Scanner;

public class TempeartureConverter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter celsius value");
		int C = sc.nextInt();
		System.out.println("Enter fahrenheit value");
		int F = sc.nextInt();
		Util.tempConverter(C, F);
	}

}
