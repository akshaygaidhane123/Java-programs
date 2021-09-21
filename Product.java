package lab13;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Product {
	public static void main(String args[]){
        LinkedList<String> al=new LinkedList<String>();
        LinkedList<String> a2=new LinkedList<String>();
        al.add("P001");
        al.add("P002"); 
        al.add("P003"); 
        System.out.println("Product Id\t\t Product name"); 
        Iterator<String> itr = al.iterator();
        
        

       
        a2.add("\t\t\t Maruti800");
        a2.add(" \t\t\tMarutiZen"); 
        a2.add(" \t\t\tMarutiEsteem"); 
        
        Iterator<String> itr1 = a2.iterator();
        
        while(itr.hasNext()){ 
        	
            System.out.println(itr.next());
            
            
            System.out.println(itr1.next());
        }
    }
}