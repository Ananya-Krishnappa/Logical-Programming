package com.bridgelabz;

import java.util.Scanner;

public class VendingMachine {
	private static int totalNotes = 0;
	private static int amount = 0;

	private static void printAmount(int maxAmt) {
	    amount = amount - maxAmt;
	    totalNotes++;
	    System.out.print(maxAmt + "-");
	}

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter Amount");
	    amount = scanner.nextInt();
	    int maxAmt = 0;

	    while (amount != 0) {
	        if (amount >= 2000) {
	            maxAmt = 2000;
	        } else if (amount >= 500) {
	            maxAmt = 500;
	        } else if (amount >= 200) {
	            maxAmt = 200;
	        } else if (amount >= 100) {
	            maxAmt = 100;
	        } else if (amount >= 50) {
	            maxAmt = 50;
	        } else if (amount >= 20) {
	            maxAmt = 20;
	        }
	        // as same you can do this for
	        /*10, 5, 2, 1*/
	        printAmount(maxAmt);
	    }
	    System.out.println("\nTotal notes : " + totalNotes);
	}
}
