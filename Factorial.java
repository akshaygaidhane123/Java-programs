package day2;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String []args)
    {
      
     
       Scanner sc=new Scanner(System.in);
       int i=1,fact=1,num;
       System.out.println("Enter the number: ");
       num=sc.nextInt();
      
       while(i<=num)
       {
           fact=fact*i;
           i++;
       }
       System.out.println("Factorial of the number: "+fact);  
       
       sc.close();
    }   
}