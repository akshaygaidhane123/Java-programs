package lab3;





public class Account

{
	
	public static void main(String[] args) {
		
	}

	int accNum;              
    String name;             
    double balance;
	public double charge;
    
  
  public Account(int a, String n, double amount, int i)

  {

	  accNum = a;
	   	 name = n;
	   	 balance = amount;
	   	 
  }

 
public String ToString(  )
  {
	 return( "Account number: "  + this.accNum
	      + ", Name: "  + this.name
	      + ", Balance: " + this.balance );
  }
  
  
  
  public void deposit( double amount )     
  {
	 this.balance += amount;
  }
  
  
 

  public void withdraw(double amount)

  {

    if (balance >= amount)

       balance -= amount;

    else

       System.out.println("Insufficient funds");

  }

 


  
  public double getBalance()

  {

    return balance;

  }



  public String toString()

  {
	return name;

 

  }

 

 
  public void chargeFee(int charge)

  {

	  double amount = 0;
	if (balance >= amount)
		 
		  System.out.println("10000 rs charge");
	 this.balance +=charge;
	

	 // else
		//  System.out.println("no charge");

  }

 

 

}




class AccountTests {
    public static void main(String[] args)
    {
 	
	 

	      

	      Account Acc = new Account(0, null, 0, 0);

	
	      Acc.accNum = 12345;
	      Acc.name = "BALAJI";
	      Acc.balance = 500000.0;
     
	      Acc.charge = 500000.0;

	      
	      String x;
	      
	    	 x = Acc.ToString( );
	    	 System.out.println("Acc: " + x); 
	     
	    	 Acc.deposit( 45000 );
	     
	    	 x = Acc.ToString( );
	    	 System.out.println("\n After depositing 45000:\n " + x);
	     
	    	 Acc.withdraw( 100000 );
	     
	    	 x = Acc.ToString( );
	    	 System.out.println("\n After withdraw 100000: \n" + x);
	    	 
	    	 
	    	 Acc.chargeFee( 10000 );
	    	 
	    	 x = Acc.ToString( );
	    	 System.out.println("chargeFee: " + x); 
	    	 
	       }
	    }



 