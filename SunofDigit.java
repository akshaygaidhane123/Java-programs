package day1;

import java.util.Scanner;

public class SunofDigit {
	
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int Number, Reminder, Sum = 0;
			
		System.out.println("Please Enter any Number: ");
		Number = sc.nextInt();
		
		while(Number > 0) {
			Reminder = Number % 10;
			Sum = Sum+ Reminder;
			Number = Number / 10;
		}
System.out.println("Sum of the digits of Given Number:"+Sum);
System.out.println("Sum of the Remaning Number:"+Number);

sc.close();
	}
}
