package Lab8;

import java.util.Scanner;

public class ExcetionAvg {


    int nu,nu1;
   
    public double avgFirstN()
    {
    	
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the nu:");
		System.out.print("Enter the nu1:");


		 nu = scan.nextInt();
		 nu1 = scan.nextInt();
    	
       
		if(nu<0)
        {
            try{
                throw new NumberFormatException();
            }
            catch(NumberFormatException nf){
                System.out.println("We Must To Enter The POsitive Number");
            }
        }
        else
        {
            int c=(nu+nu1)/2;
       
        System.out.println("THe Average is  = "+c);
        }
       scan.close();
        return nu;   
    }
   
public static void main(String[] args) {
       
       
	ExcetionAvg EA=new ExcetionAvg();
        EA.avgFirstN();   
    }

}