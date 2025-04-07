package com.bankingsystem.main;

import java.security.SecureRandom;
import java.util.Scanner;

import com.bankingsystem.javabean.User;
import com.bankingsystem.utils.ChangePin;
import com.bankingsystem.utils.FundTransfer;
import com.bankingsystem.utils.Withdraw;
import com.bankingsystem.velidation.VeliDationUser;


public class ProjectMain {
	String choic1;
	String yourEmail;
	static User user1;
	static User user2;
	static Scanner scanner = new Scanner(System.in);
	// init block
	{
		user1 = new User();
		user2 = new User();
		 
	}

	public static void main(String[] args) {
		
		ProjectMain p = new ProjectMain();
while (true) {
		System.out.println("1. Login  ");
		System.out.println("2. Create Account");
		String choice = scanner.nextLine();
               //Frist   .............
		if (choice.equals("1")) {
			System.out.println("***You have not created any Account***");
			continue;
		} else if (choice.equals("2")) {
			p.readInput(p.user1);
			p.showInfo(p.user1);
			 while (true) {
			System.out.println(" \n \n1. Login");
			System.out.println("2. Create Account");
			String choice1 = scanner.nextLine();

			// second.......
			if (choice1.equals("1")) {
				p.login();
			} else if (choice1.equals("2")) {
				p.readInput(p.user2);
				p.showInfo(p.user2);
	     // Third.............
				while (true) { 
				System.out.println("1. Logout");
				
				
				System.out.println("2. Account Detail");
				System.out.println("3. Account Activity");
				System.out.println("4. Fund Transfer");
				System.out.println("5. Withdraw");
				System.out.println("6. Change Pin");
				System.out.println("7. Login Account ");
				String choice2 = scanner.nextLine();
				if(choice2.equals("1"))
				{
					System.out.println("*********Logout Successfull*********");
					 System.exit(0);
				}
				else if(choice2.equals("2"))
				{
					// four..........
					
					System.out.println("*******Which account details do you want to know 1st and 2nd******");
					System.out.println("1 Account ");
					System.out.println("2 Account");
					String choice3 = scanner.nextLine();
					if(choice3.equals("1"))
					{
						p.showInfo(p.user1);
						continue;
					}
					else if(choice3.equals("2"))
					{
						p.showInfo(p.user2);
						continue;
					}
					else
					{
						System.out.println("Invaild choice ");
						continue;
					}
					}
					
				else if(choice2.equals("3"))
				{
					 System.out.println("Account Activity feature coming soon...\n");
					continue;
				}
				else if(choice2.equals("4"))
				{
					
					new FundTransfer().fundTransfer(user1, user2);
					continue;
				}
				
				else if(choice2.equals("5"))
				{
					new Withdraw().withdraw(user1,user2);
					 
					 continue;
				}
				else if(choice2.equals("6"))
				{
					new ChangePin().changePin(user1,user2);
					continue;
				}
				else if(choice2.equals("7"))
				{
					p.login();	
					continue;
				}
				
				else
				{
					System.out.println("Invalid choice");
					continue;
				}

				}
				} else {
				System.out.println("Invalid choice");
				continue;
			}
			 }
			 } else {
			System.out.println("Invalid choice");
			continue;
		}
}}

	void readInput(User u) {

		System.out.println("--------Fill Detail to Continue---------");
		System.out.println("====|  Enter Bank Name  |====");
		String bankName = scanner.nextLine();
		System.out.println("====|  Full Name  |====");
		String yourName = scanner.nextLine();
		System.out.println("====|  Email  |====");
		String yourEmail = scanner.nextLine();
		System.out.println("====|  Mobile Number  |====");
		String yourMoNumber = scanner.nextLine();
		System.out.println("====|  Create IFSC Code  |====");
		String yourIFSC = scanner.nextLine();
		System.out.println("====|  Select Account Type  |====");
		System.out.println("1.Saving");
		System.out.println("2.Current");
		String choice = scanner.nextLine();
		if (choice.equals("1"))
			u.setAccountType("Saving");
		else
			u.setAccountType("Current");

		System.out.println("====|  Enter Amount You want to Save  |====");
		double amount = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("====|  Create 6 Digit Pin  |====");
		String pin = scanner.nextLine();
		System.out.println("====|  Generating 11 Digit Account Number  |====");
		String accno = generate();
		System.out.println("-----------*******-------------");
		System.out.println("-----------***[ Account Created Successfully ]***-------------");

		u.setBankName(bankName);
		u.setAmmount(amount);
		u.setEmail(yourEmail);
		u.setFullName(yourName);
		u.setIfsc(yourIFSC);
		u.setMoNumber(yourMoNumber);
		u.setPin(pin);
		u.setGeAccountNo(accno);

	}

	void showInfo(User user) {
		System.out.println("!! Account Detail !!");
		System.out.println("!!~ Bank Name =>" + user.getBankName());
		System.out.println("!!~ Account Name =>" + user.getFullName());
		System.out.println("!!~ Account Email => " + user.getEmail());
		System.out.println("!!~ Mobile Number =>" + user.getMoNumber());
		System.out.println("!!~ Account Number =>" + user.getGeAccountNo());
		System.out.println("!!~ Account Balance =>" + user.getAmmount());
		System.out.println("!!~ Account Type =>" + user.getAccountType());
		System.out.println("!!~ IFSC Code =>" + user.getIfsc());
		System.out.println("!!~ Account Pin =>" + user.getPin());
		System.out.println("-----------*******-------------");
	}

	void login() {
		System.out.println("Welcome to bank");
		System.out.println("Login with Your Account Number");
		String accoNo = scanner.nextLine();
		System.out.println("!! Enter 6 Digit Pin !!");
		String pin = scanner.nextLine();
		if (accoNo.equals(user1.getGeAccountNo()) && pin.equals(user1.getPin())) {

			System.out.println("!! Login Successfull !!");
		} else if (accoNo.equals(user2.getGeAccountNo()) && pin.equals(user2.getPin())) {
			System.out.println("!! Login Successfull !! \n");
		} else {
			System.out.println("!! Wrong Pin !!");
		}
	}

	public static String generate() {
		SecureRandom random = new SecureRandom();
		return (1 + random.nextInt(9)) + String.format("%011d", random.nextLong() % 1_000_000_000_00L);
	}
	
	

}
