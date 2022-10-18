//importing util package for Scanner Class
import java.util.Scanner;

//declaring a class
class ScannerDemo
{
  //main method
  public static void main (String args[])
  {
   //creating object of scanner class
   Scanner sc= new Scanner(System.in);
   
   //declaring and initializing local variable
   System.out.println("Enter your Name:");
   String name= sc.next(); //to take string input
   
   System.out.println("Enter your Gender(F/M):");
   char gender= sc.next().charAt(0); //to take character
   
   System.out.println("Enter your Age:");
   int age= sc.nextInt();  //to take integer input
   
   System.out.println("Enter your Marks:");
   float marks= sc.nextFloat();  //to take float input
   
   System.out.println("Enter your Pass/fail:");
   boolean pass= sc.nextBoolean();  //to take boolean input
   
   //printing the value of all the variables
   System.out.println("--------------");
   System.out.println("Name:"+ name);
   System.out.println("Gender:"+ gender);
   System.out.println("Age:"+ age);
   System.out.println("Marks:"+ marks);
   System.out.println("Pass:"+ pass);
   
  }//end of main method  
}//end of class scannerdemo
