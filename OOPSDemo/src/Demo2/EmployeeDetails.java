package Demo2;

public class EmployeeDetails {

	private int eID;
	private String eName;
	private double eSalary;
	private int eAge;
	private String eDept;
	
	void enterDetails(int id,String name,double salary,int age, String Dept) {
		eID = id;
	    eName = name;
		eSalary = salary;
		eAge =age;
		eDept =Dept;
	}
	
	double hikeSalary(double salary) {
		eSalary += eSalary+(5/100*eSalary);
		System.out.println("Salary........");
		return eSalary;
	}
	double hikesalary(float hikerate) {

		// local variable
		eSalary = eSalary + ()

		// condition to check wether we have sufficient balance
		if (tempBalance > 500) // min balance is 500
		{
			balance = tempBalance;
			System.out.println("Withdrawal successfull...........");
		} else
			System.out.println("Your balance is low....");
		return balance;
	}
        void printDetails() {
		System.out.println("Employee name:" + accID);
		System.out.println("Salary:" + eSalary);
		System.out.println("id :" + eid);
	}

	// to get Pan Number

	String getPanNumber() {

		return panNumber;

	}
 
}
