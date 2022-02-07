package com.blz.javaproject;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		  try (Scanner reader = new Scanner(System.in)) {
			System.out.print("Enter a number: ");
	        int number = reader.nextInt();

	        if(number % 2 == 0)
	            System.out.println(number + " is even");
	        else
	            System.out.println(number + " is odd");
		}
	}
}


