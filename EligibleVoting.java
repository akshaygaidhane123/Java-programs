package day2;

import java.util.Scanner;

public class EligibleVoting
{
	 public static void main(String args[])
	   {
	
int a ;

Scanner sc = new Scanner(System.in);

System.out.println("Enter the age of the person: ");


a=sc.nextInt();


 if (a>=18)
{
	System.out.println("Eigibal for voting");
}
else
{
	System.out.println(" Not Eigibal for voting");
	sc.close();
}	
}}