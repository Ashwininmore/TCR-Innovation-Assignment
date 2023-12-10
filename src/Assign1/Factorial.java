//Ashwini Nitin More.

package Assign1;
import java.util.*;
//Q1. Write a Java program to find the factorial of a number using recursion.

public class Factorial {
 public static void main(String[] args) {
     @SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
     System.out.println("\n Enter Number:");
     int n=sc.nextInt();
     int fact=FactM(n);
     System.out.println("Factorial of "+n+" is:"+fact);
 }
 public static int FactM(int n){
     if(n>=1){
         return n*FactM(n-1);
     }
     else{
         return 1;
     }
 }
}
