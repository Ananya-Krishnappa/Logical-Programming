package com.bridgelabz;

public class Util {
	public static void dayOfWeek(int d, int m, int y) {
		double y0 = (y - (14 - m) / 12);
		System.out.println(y0);
		double x = (y0 + y0 / 4 - y0 / 100 + y0 / 400);
		System.out.println(x);
		double m0 = m + 12 * ((14 - m) / 12) - 2;
		System.out.println(m0);
		int d0 = (int) (d + x + 31 * m0 / 12) % 7;
		System.out.println("Day of the week is " + d0);
	}

	public static void tempConverter(int C, int F) {
		double result = (C * 9 / 5) + 32;
		System.out.println("Fahrenheit value is " + result);
		double result1 = (F - 32) * 5 / 9;
		System.out.println("Celsius value is " + result1);

	}

	public static void montlySalary(int P, int Y, int R) {
		double e = (P * R * Math.pow(1 + R, Y)) / (Math.pow(1 + R, Y) - 1);
		System.out.println("The monthly payment is " + e);
	}

	// Function to return the square root of
	// a number using Newtons method
	public static double squareRoot(double n, double l) {
		// Assuming the sqrt of n as n only
		double x = n;

		// The closed guess will be stored in the root
		double root;

		// To count the number of iterations
		int count = 0;

		while (true) {
			count++;

			// Calculate more closed x
			root = 0.5 * (x + (n / x));

			// Check for closeness
			if (Math.abs(root - x) < l)
				break;

			// Update root
			x = root;
		}

		return root;
	}
}
