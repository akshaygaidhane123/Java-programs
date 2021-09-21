package day2;



import java.util.Scanner;

public class Fibonaci {
	
	public static void main(String args[])
	{
		
	

	Scanner sc=new Scanner(System.in);
	int n,i,sum=0,a,b,c;
	
System.out.println("Enter the range");
  
n=sc.nextInt();

a=0;
b=1;
sum=a+b;
System.out.println("\n "+sum);
for(i=2;i<=n-2;i++)
{
	c=a+b;
	System.out.println(""+c);

sum=sum+c;
a=b;
b=c;
}

System.out.println("sum of range"+sum);
sc.close();



}

}
