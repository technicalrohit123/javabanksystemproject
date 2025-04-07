package com.bankingsystem.utils;

import java.util.Scanner;

import com.bankingsystem.javabean.User;

public class ChangePin {
	static Scanner scanner = new Scanner(System.in);

	public void changePin(User u1, User u2) {
		System.out.println("****Which account's PIN do you want to change, 1st or 2nd***");
		System.out.println("1. Account Holder  Name " + u1.getFullName());
		System.out.println("2. Account Holder Name " + u2.getFullName());
		String choice4 = scanner.nextLine();
		if (choice4.equals("1")) {
			System.out.println("!!~ Please Enter your old 6 Digit Pin");
			String enterdOldPin = scanner.nextLine();
			if (enterdOldPin.equals(u1.getPin())) {
				System.out.println("!!~ Pin Verified \n");
				System.out.print("!!~ Please Enter Your New Pin: ");
				String newPin = scanner.nextLine();

				if (newPin.length() == 6 ) { //   && newPin.matches("\\d+") Validate new PIN
					u1.setPin(newPin); // Update user's PIN
					System.out.println("!!~ Pin Changed Successfully");
					System.out.println("!!~ Your New Pin is => " + newPin);
				} else {
					System.out.println("!!~ Error: New PIN must be exactly 6 digits.\n");
				}
			} else {
				System.out.println("!!~ Error: Incorrect PIN. \n");
			}
		} else if (choice4.equals("2")) {
			System.out.println("!!~ Please Enter your old 6 Digit Pin");
			String enterdOldPin = scanner.nextLine();
			if (enterdOldPin.equals(u2.getPin())) {
				System.out.println("!!~ Pin Verified \n");
				System.out.print("!!~ Please Enter Your New Pin: ");
				String newPin = scanner.nextLine();
				if (newPin.length() == 6 ) { //   && newPin.matches("\\d+") Validate new PIN
					u2.setPin(newPin); // Update user's PIN
					System.out.println("!!~ Pin Changed Successfully");
					System.out.println("!!~ Your New Pin is => " + newPin);
				} else {
					System.out.println("!!~ Error: New PIN must be exactly 6 digits. \n");
				}
             
		} else {
			System.out.println("Invalid choice \n");
		}
	}

	}}


