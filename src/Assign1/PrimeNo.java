//Ashwini Nitin More

package Assign1;
import java.util.Scanner;
//Q2. Implement a Java program to check if a number is prime.

public class PrimeNo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The No:");
		int n=sc.nextInt();
		boolean flag=false;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				flag=true;
				break;
			}
		}
		if(flag==false && n!=1) {
			System.out.println("Number is prime");
		}
		else {
			System.out.println("Number is not prime");
		}
	}
}
