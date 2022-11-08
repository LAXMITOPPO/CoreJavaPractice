package Demo1;

import java.util.Scanner;

public class SBIBank {
	
}
	static void menu() {
		System.out.println("1. Create Account ID ");
		System.out.println("2. Deposite money ");
		System.out.println("3. Withdraw money ");
		System.out.println("4. Display Bank Details ");
		System.out.println("5. Exit  ");
		System.out.println("Enter choice :");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccountDetail a = new AccountDetail();
		Scanner sc =new Scanner(System.in);
		int choice = 0;
		do {
			menu();
			choice = sc.nextInt();
			switch(choice) {
			case 1 :
				System.out.println("Enter the detail :");
				System.out.println("Account Id :");
				int id = sc.nextInt();
				System.out.println("Account Name :");
				String name = sc.next();
				System.out.println("Starting balance :");
				double bal = sc.nextDouble();
				System.out.println("panCard Number:");
				String PanNumber = sc.next();
				a.accountDetails(id, name, bal, PanNumber);
				break;
				
			case 2 :
				System.out.println("Enter the number :");
				double amount = sc.nextDouble();
				System.out.println("Balance :"+amount);
				break;
				
			case 3 :
				System.out.println("Enter the amount :");
				amount = sc.nextDouble();
				System.out.println("Balance :"+a.Withdraw(amount));
				break;
				
			case 4 :
				a.printBankDetails();
				break;
				
			case 5 :
				System.exit(0);
				break;
				
		 default :
			 System.out.println("Invalid input...........");
			
				
			}
			System.out.println("Do you want to perform more operatin  :(1-yes/0-no)");
			
			choice = sc.nextInt();
			
		}while (choice == 1);
		
		sc.close();
	}
}