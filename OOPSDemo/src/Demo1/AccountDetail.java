package Demo1;

public class AccountDetail {
	
	private int accID;
	private String accName;
	private double balance;
	private String panNumber;
	 
	void accountDetails(int id,String name,double bal,String PanNumber) {
		accID=id;
		accName=name;
		balance=bal;
		panNumber=PanNumber;
	}

	double DepositMoney(double amount ) {
		 balance+=amount;
		 System.out.println(" Ammount Deposited................");
		 return balance;
	}
	double Withdraw (double amount) {
		double tempbalance = balance;
		tempbalance = tempbalance-amount;
		if(tempbalance>500) {
			balance = tempbalance;
			System.out.println("withdraw succesfully...........");
		}
			else {
				System.out.println("your balance is low...........");
			}
		return balance;
	}

	void printBankDetails(){
		System.out.println("Account ID"+accID);
		System.out.println("Account Name"+accName);
		System.out.println("Account Balance"+balance);
		System.out.println("Account Pan"+panNumber);
	}
	String getPanNumber() {

		return panNumber;

	}
}
 