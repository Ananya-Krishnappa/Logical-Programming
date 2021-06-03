package com.bridgelabz;

import java.util.Scanner;

public class BinaryConverter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		System.out.print("Output after swapping the two nibbles: " + swapNibbles(num));
	}

	static int swapNibbles(int x) {
		System.out.println(Integer.toBinaryString(x));
		return ((x & 0x0F) << 4 | (x & 0xF0) >> 4);
	}

}