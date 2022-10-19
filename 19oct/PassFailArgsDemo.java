*
program: Wap to print pass and fail according to the mRKS
@author: laxmi toppo
@date: 19 oct 20222
*/
import java.util.*;
class PassFailArgDemo//declaring a class
{
	//main started
    public static void main(String args[])
	{
		//taking the input
		float  subject1,subject2,subject3,percentage;
		subject1=Float.parseFloat(args[0]);
		subject2=Flaot.parseFloat(args[1]);
		subject3=Float.parseFloat(args[2]);
		percentage=((subject1+subject2+subject3)/300)*100;
		//checking the student has cleared the exam or not
		if(percentage>=40)
	        System.out.println("congratulations..... you have passed :");
		else
			System.out.println("you have failed.........Do hardwork :");
	}//end of main
}//end of class