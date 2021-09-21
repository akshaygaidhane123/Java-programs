package lab4;

public class NuConeversion {


  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    int num = 14, tmp;
    tmp = num;
   
    
    int num1 = 14, tmp1;
    tmp1 = num1;
    
    
   
    
    
    String binary = "";
    while(num >= 2)
    {
      binary = num%2 + binary ;
      num = num /2;
    }
    
    
    
    String octal = "";
    while(num1 >= 8)
    {
      octal = num1%8 + octal;
      num1 = num1 /8;
    }
    
    
    
    
    
    
   
    
    
    
    
    
    binary = num + binary ;
    System.out.println("Binary of " + tmp + " is " + binary);
    
    
    octal = num1 + octal ;
    System.out.println("Octal of " + tmp1 + " is " + octal);
    
    
    
    
    
    
    
  }
}