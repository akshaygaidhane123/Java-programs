package lab7;

import java.util.Scanner;

public abstract class ImplMyth implements MyMyth {

	Scanner sc=new Scanner(System.in);
	public boolean	 sqr(double a) {
		return false;
	
	
	
}

	@Override
	public void cube(double a) {
		// TODO Auto-generated method stub
	a=sc.nextDouble();
	System.out.println("Enter the cube");
	
	double b = a*a*a;
	
	System.out.println("cube:"+b);
	
	
		
	}

	public ImplMyth() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void cosine(double a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sine(double a) {
		// TODO Auto-generated method stub
		
	}
}