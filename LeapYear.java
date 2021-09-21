package day2;

import java.util.Scanner;

public class LeapYear {
	
	public static void main (String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
	
	int year;
	System.out.println("\n Enter the year");
	
	year=sc.nextInt();
	
	
	
	if(year%4==0)
	System.out.println("\n the year is leap");
	
	if(year%4!=0)
	System.out.println("\n the year is non leap");
	
	
	sc.close();
	
	}
}
