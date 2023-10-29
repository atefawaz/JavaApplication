package java_practice;

import java.util.Scanner;

public class ReverseOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		
		int num = sc.nextInt();
		int reverse = 0;
		
//		Using while loop
		
	/*	while (num != 0) {
			
			int remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
			
		
			
		} */
		
		
//		Using for loop 
		
		for (;num!= 0;num = num/10) {
			
			int remainder = num % 10;
			
			reverse = reverse *10 + remainder;
			
		}
			
		
		System.out.println("The reverse of your number is :" + reverse); 

	}

}
