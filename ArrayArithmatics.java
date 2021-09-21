/*Declare three array of integer types ,Accept values for two array.Perform arithmetic
operation on both array values and store corresponding values in third array.
E,,g, : c[0]=a[0]+b[0]

*/





package lab3;
import java.util.Scanner;
public class ArrayArithmatics {

  public static void main ( String[] args )
   {
      Scanner sc = new Scanner(System.in);
      System.out.print(" Input the length \n");
      int len = sc.nextInt();

      int[] arrA   = new int[len];
      int[] arrB   = new int[len];
      int[] sum    = new int[len];
      for (int i = 0; i < len; i++){
        System.out.print("\n Enter a value for first array, position " + i + ": ");
        arrA[i] = sc.nextInt();
    }
    for (int i = 0; i < len; i++){
        System.out.print("\n Enter a value for second array, position " + i + ": ");
        arrB[i] = sc.nextInt();
    }

    for (int i=0; i<arrA.length; i++) {
        for ( i=0; i<arrB.length; i++) {
            sum[i]=arrA[i]+arrB[i];

   }


}

System.out.println("\n sum of array: " + sum[0]+"," + sum[1] + ","  + sum[2] + ","  + sum[3] );
sc.close();


} }