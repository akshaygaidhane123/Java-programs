
package day2;

public class  Book {

    String bookName;
    int bookPrice;
     String authorName;

  

    public String getbookName(){
        return bookName;
    }

   public String getauthorName(){
         return authorName;
   }
   public int getbookPrice(){
       return bookPrice;
   }

 


   public void setbookName(String newName){
        this.bookName = newName;
   }
   public void setbookPrice(int bookPrice){
       this.bookPrice = bookPrice;
   }
   public void setauthorName(String author){
       this.authorName = author;
   }


}