package com.bridgelabz;

import java.util.Scanner;

public class BinaryRepresentation {
	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal number");
		int num = sc.nextInt();
		int[] arr = new int[num];
		int[] output = twoBinary(num, arr, count);
		for (int j = 0; j < output.length; j++) {
			if (output[j] == 0) {
				break;
			}
			System.out.print(output[j]+" ");
		}
		for (int j = 0; j < output.length; j++) {
			if (output[j] == 0) {
				break;
			}
			System.out.print(Integer.toBinaryString(output[j])+" ");
		}
	}

	private static int[] twoBinary(int num, int[] arr, int count) {
		int i = 0;
		while (Math.pow(2, i) <= num) {
			i++;
		}
		i = i - 1;
		arr[count] = (int) Math.pow(2, i);
		count++;
		num = (int) (num - Math.pow(2, i));
		if (num > 0) {
			twoBinary(num, arr, count);
		} 
		return arr;
	}
}
