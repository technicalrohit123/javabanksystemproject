package com.simple;

import java.util.Scanner;

public class calculater {

	
	public static void main(String[] args) {
		   int a, b, c, ch;
	        Scanner sc = new Scanner(System.in);

	        // Input numbers
	        System.out.print("Enter the 1st number: ");
	        a = sc.nextInt();

	        System.out.print("Enter the 2nd number: ");
	        b = sc.nextInt();

	        // Input choice
	        System.out.print("Enter your choice (1 for Addition, 2 for Subtraction, 3 for Multiplication, 4 for Division, 5 for Remainder): ");
	        ch = sc.nextInt();

	        switch (ch) {
	            case 1: // Addition
	                c = a + b;
	                System.out.println("Addition: " + c);
	                break;
	            case 2: // Subtraction
	                c = a - b;
	                System.out.println("Subtraction: " + c);
	                break;
	            case 3: // Multiplication
	                c = a * b;
	                System.out.println("Multiplication: " + c);
	                break;
	            case 4: // Division
	                if (b != 0) {
	                    c = a / b;
	                    System.out.println("Division: " + c);
	                } else {
	                    System.out.println("Error: Division by zero is not allowed.");
	                }
	                break;
	            case 5: // Remainder
	                if (b != 0) {
	                    c = a % b;
	                    System.out.println("Remainder: " + c);
	                } else {
	                    System.out.println("Error: Division by zero is not allowed.");
	                }
	                break;
	            default: // Invalid choice
	                System.out.println("Invalid choice. Please select a valid option.");
	        }

	        sc.close(); // Close the scanner to avoid resource leaks
	    }
	}