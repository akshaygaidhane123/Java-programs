package Lab8;

import java.util.Scanner;

class Funds extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;

    public Funds(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}

 class UserDefinedException {

    static double current_balance = 100;

    @SuppressWarnings("resource")
	public static void main(String[] args) throws Funds{
        Scanner s = new Scanner(System.in);
        System.out.println("Enter amount to withdrawal");
        int n = s.nextInt();
        try {
            if (current_balance < n) {
                throw new Funds("Insufficient funds ! your Current balance is " + current_balance);
            } else {
                System.out.println("Please Take The Money : " + n);
                
                
                s.close();

            }

        } catch (Funds mab) {
            mab.printStackTrace();
        }
    }

}