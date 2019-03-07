package java_examples;

import java.util.Scanner;

public class Reverse_a_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n, reverse=0;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Pleaase enter your integer number");
		n=sc.nextInt();
	
		
		for (int i = 0; i <n; i++) {
			
			
			reverse=reverse*10;
			  reverse = reverse + n%10;
	          n = n/10;
	      }
	       
	      System
	      .out.println("Reverse of the number is " + reverse);                        
			
		}
		
	
}
