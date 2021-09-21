
package Lab8;

import java.util.Scanner;

class IncorrectAgeException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	IncorrectAgeException(String s){
	  super(s);
	 }
	 public String toString()
	 {
	  return "Candidate is less than 18 year is not allowed to vote.";
	 }
	}



class ValidateCandidate{

	   @SuppressWarnings("resource")
	static void validate(int age) throws IncorrectAgeException{
		   
		   
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter your age");
		   age = sc.nextInt();
 
		   
		   
		   
		   
		   
	     if(age < 18)
	         throw new IncorrectAgeException("invalid candidate");
	     else
	         System.out.println("welcome to vote");
	     System.out.println("please for vote");
	     
         sc.close();

	     
	   }
	   
	   public static void main(String args[]){
	      try{
	        validate(13);
	      }catch(Exception ex){
	         
	      }

	  
	  }
	}