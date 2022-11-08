/*
 * OPPS
 * @Author :Laxmi Toppo
 * @Date :26 oct 2022
 */
//declaring package
package Demo;

public class AccountDetails {

	
	private int accID;
	private String accName;
	private double balance;
	private String panNumber;
	
	void enterBankDetails(int id,String name,double bal,String pannumber) {
		accID = id;
		accName = name;
		balance = bal;
		panNumber = pannumber;
	}
	
	double depositMoney(double amount) {
		balance += amount;
		System.out.println("Amount deposited........");
		return balance;
	}
	double withdraw(double amount) {

		// local variable
		double tempBalance = balance;
		tempBalance = tempBalance - amount;

		// condition to check wether we have sufficient balance
		if (tempBalance > 500) // min balance is 500
		{
			balance = tempBalance;
			System.out.println("Withdrawal successfull...........");
		} else
			System.out.println("Your balance is low....");
		return balance;
	}
        void printBankDetails() {
		System.out.println("Account ID:" + accID);
		System.out.println("Account Name:" + accName);
		System.out.println("Balance :" + balance);
	}

	// to get Pan Number

	String getPanNumber() {

		return panNumber;

	}
 

	
}//end of class
