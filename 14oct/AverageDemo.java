import java.util.Scanner;
//declaring class
class AverageDemo
{
	//main method
    public static void main(String args[])
	{
     Scanner sc =new Scanner(System.in);
     
	 //declaring local variable
     System.out.println("Enter first number1");	
     int number1= sc.nextInt();
	 System.out.println("Enter second number2");
	 int number2= sc.nextInt();
	 System.out.println("Enter third number3");
	 int number3= sc.nextInt();
	 
	 //calculating the variable
	 int sum= number1+number2+number3;
	 int average= sum/3;
	 
	 //printing the output
	 System.out.println("Average:"+ average);
	 
	} //end of main
} //end of class avragedemo
 