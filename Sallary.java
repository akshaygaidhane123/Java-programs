package day1;

import java.util.Scanner;

class Sallary
{
 public static void main(String args[]) 
 {
 int basic_salary,da,hra,GrossPayment,IT;

  Scanner sc=new Scanner(System.in);

  System.out.println("Enter Basic Salary Of Employee: ");
  basic_salary=sc.nextInt();

  System.out.println("Enter Basic DA Of Employee: "); 
  da=sc.nextInt();;
 
  System.out.println("Enter Basic HRA Of Employee: ");
  hra=sc.nextInt();

  da = (int) (0.2 * basic_salary) ;
  hra = (int) (0.3* basic_salary) ;

  GrossPayment = basic_salary + da + hra;

  System.out.println("Gross Salary Of Employee: "+GrossPayment);
 



if(basic_salary>0 && basic_salary<4000)
{
IT=basic_salary*4/100;
System.out.println("\n Income tax = "+IT);
}
else if(basic_salary>=4000 && basic_salary<10000)
{
IT=basic_salary*6/100;
System.out.println("\n Income tax = "+IT);
}
else if(basic_salary>=10000 && basic_salary<17000)
{
IT=basic_salary*8/100;
System.out.println("\n Income tax = "+IT);
}
else if(basic_salary>=17000 && basic_salary<27000)
{
IT=basic_salary*10/100;
System.out.println("\n Income tax = "+IT);
}
else
{
IT=basic_salary*15/100;
System.out.println("\n Income tax = "+IT);

sc.close();
}}}
