package lab4;

public class StringClass {

	 
		public static void main(String args[]){  
			String s1="java"; 
	  
			char ch[]={'s','t','r','i','n','g','s'};  
			String s2=new String(ch);  
			  
			String s3=new String("example"); 
			
			
			//Replace
			
			String s4="Balaji"; 
			String replaceString=s4.replace('a','j');
			
			//trim
			String s5="  hello string   ";  
			
			
			//concatinate
			String s6="Balaji Dhakne";  
			
			s6.concat("computer Engineer");    
			System.out.println(s6);    
			s6=s6.concat(" Laturkar");  
			
			
			//length
			
			String s7="balaji dhakne";  
			String s8="laturkar";  
			
			//charAt
			String name="dhakne Balaji";  
			char cha=name.charAt(4);
			char c=name.charAt(7);
			
			
			//substring
			
			String s9="Balaji Rav Dhakne";  
			
			
			//Equals
			
			String s10="Dhakne";  
			String s11="Dhakne";  
			String s12="Yestarkar";  
			String s13="Engineer";  
			
			//empty
			
			String s14="";  
			
			
			//Lower case
			
			String s15="DHAKNE BALAJI SAMBHAJI";  
			String s15lower=s15.toLowerCase();  
			
		  
			System.out.println(s1);  
			System.out.println(s2);  
		System.out.println(s3);  
		System.out.println(replaceString); //Replace
		System.out.println(s5+"javatpoint");  //without trim
		System.out.println(s5.trim()+"javatpoint"); //with trim 
		System.out.println(s6);  //concatinate
		
		System.out.println("string length is s7: "+s7.length());// length    
		System.out.println("string length is:s8 "+s8.length());// length   
		
		System.out.println(cha); //charAt
		System.out.println(c); //charAt
		
		
		System.out.println(s9.substring(2,6));//substring  
		System.out.println(s9.substring(2));//substring 
		
		
		
		System.out.println(s10.equals(s11));//equal 
		System.out.println(s10.equals(s12));//equal 
		System.out.println(s10.equals(s13));//equal
		
		
		
		System.out.println(s14.isEmpty());  //empty
		System.out.println(s2.isEmpty());  //empty
		
		
		System.out.println(s15lower); //Lower
		
		}} 
