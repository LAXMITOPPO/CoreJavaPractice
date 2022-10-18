 //importing util package for scanner class
 import java.util.Scanner;
 
//declaring class
class ScannerAdd 
{
	//main method
	public static void main(String args[])
    {
	//
	 Scanner sc= new Scanner(System.in);
	
	//declaring local variable
    System.out.println("enter first number1:");	
	int number1 = sc.nextInt();
	
	System.out.println("enter second number2:");
	int number2 = sc.nextInt();
	
	int sum=number1+number2; //sum the variables
	
	//printing the  variable
	System.out.println("sum:"+ sum);
	
	}	//end of main method
}// end of class 