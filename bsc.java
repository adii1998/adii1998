import java.lang.*;
import java.util.*;
import java.util.Scanner;
class bsc{
 public static void main(String args[]){
      Scanner sc= new Scanner (System.in);
     int totalmarks= 100;

   float a =sc.nextFloat();
   System.out.print("Enter marks of basic of programm");
   
   float b = sc.nextFloat();
   System.out.print("Enter marks of conditional statement");

   float c =sc.nextFloat();
   System.out.print("Enter marks of DSA");

   float d =sc.nextFloat();
   System.out.print("Enter marks of Arrays");

   float e =sc.nextFloat();
   System.out.print("Enter marks of Strings");
  float total =(a+b+c+d+e);
  float percentage=(total/500)*100;
    

  System.out.println(percentage);
  
}
}