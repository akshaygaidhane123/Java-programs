package Lab8;

import java.util.Scanner;


public class ExceptionArithmatic {

	public static  void main(String[] args) 
	{
    int nu,nu1;
    double a,b,c,d;
   
   
    try{
    	
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the nu:");
		System.out.print("Enter the nu1:");


		 nu = scan.nextInt();
		 nu1 = scan.nextInt();
    	
       
		
    a=nu+nu1;
    b=nu-nu1;
    c=nu*nu1;
    d=nu/nu1;
        	
                 
                 System.out.println ("Result: "+a);
                 System.out.println ("Result: "+b);
                 System.out.println ("Result: "+c);
                 System.out.println ("Result: "+d);
                 scan.close();

              }
              catch(ArithmeticException e){
               System.out.println ("You Shouldn't divide a number by zero");
               
        {
            
       
        
        }
  
	
      
    }
   

       
       
	
    }
}
