package day2;
import java.util.Scanner;

class TestBook {

    public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    String name1,name2;
    int price;



   System.out.println("Enter the Book name:");
   name1 = s.nextLine();

   System.out.println("Enter the price:");
   price = s.nextInt();

 String re = s.nextLine();

   System.out.println("Enter the Author name:");
   name2 = s.nextLine();

 

   Book myObj = new Book();
   myObj.setbookName(name1);
   myObj.setbookPrice(price);
   myObj.setauthorName(name2);

 

   System.out.println("Book Details");
   System.out.println("Book Name :"+myObj.getbookName());
   System.out.println("Book Price :"+myObj.getbookPrice());
   System.out.println("Author Name :"+myObj.getauthorName());

   s.next();

   }
}