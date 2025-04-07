package com.bankingsystem.utils;

import java.util.Scanner;

import com.bankingsystem.javabean.User;

public class FundTransfer {
	static Double a;
	static Double b;
	static Scanner scanner = new Scanner(System.in);

	public void fundTransfer(User u1, User u2) {

		System.out.println("*** Do you went to Send 1st to 2nd or 2nd to 1st Account **** ");
		System.out.println("1. Account Holder  Name " + u1.getFullName()+"-------");
		System.out.println("2. Account Holder Name " + u2.getFullName()+"-------");
		String choice = scanner.nextLine();
		if (choice.equals("1")) {
			System.out.println("!!~ Enter Receiver Account No. you want to send money ***** ");
			String reAccount = scanner.nextLine();
			if (reAccount.equals(u2.getGeAccountNo())) {
				System.out.println("!!~  You are Sending Money to " + u2.getFullName());
				System.out.println("!!~ Enter Amount");
				a = scanner.nextDouble();
				if (a <= u1.getAmmount()) {
					System.out.println("!!~ Enter 6 Digit Pin");
					scanner.nextLine();
					String pinu1 = scanner.nextLine();
					if (pinu1.equals(u1.getPin())) {

						u1.setAmmount(u1.getAmmount() - a);
						u2.setAmmount(u2.getAmmount() + a);
						System.out.println("-----------***[ Fund Transfer Succesfully ]***-------------");
						System.out.println("!!~ Available Balance = " + (u1.getAmmount()));
						System.out.println("------------------------------");
					} else {
						System.out.println("!!~ Wrong Pin Number");
						System.out.println("------------------------------");
					}

				} else {
					System.out.println("!!~ Not Enough Balance in Account");
					System.out.println("------------------------------");
				}
			} else {
				System.out.println("!!~ Wrong Account Number");
				System.out.println("------------------------------");
			}
		} else if (choice.equals("2")) {
			System.out.println("!!~ Enter Receiver Account No. you want to send money ****");
			String reAccount = scanner.nextLine();
			if (reAccount.equals(u1.getGeAccountNo())) {
				System.out.println("!!~  You are Sending Money to " + u1.getFullName());
				System.out.println("!!~ Enter Amount");
				b = scanner.nextDouble();
				if (b <= u2.getAmmount()) {
					System.out.println("!!~ Enter 6 Digit Pin");
					scanner.nextLine();
					String pinu1 = scanner.nextLine();
					if (pinu1.equals(u2.getPin())) {

						u1.setAmmount(u1.getAmmount() + b);
						u2.setAmmount(u2.getAmmount() - b);
						System.out.println("-----------***[ Fund Transfer Succesfully ]***-------------");
						System.out.println("!!~ Available Balance = " + (u2.getAmmount()));
						System.out.println("------------------------------");
					} else {
						System.out.println("!!~ Wrong Pin Number");
						System.out.println("------------------------------");
					}
				} else {
					System.out.println("!!~ Not Enough Balance in Account");
					System.out.println("------------------------------");
				}

			} else {
				System.out.println("!!~ Wrong Account Number");
				System.out.println("------------------------------");
			}

		} else {
			System.out.println("Invalid choice \n");
		}
	}
}
