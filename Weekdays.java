package java_practice;

import java.util.Scanner;

public class Weekdays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the day number : ");
		
		int day = sc.nextInt();
		
		switch (day) {
		case 1 : 
			System.out.println("Its monday !");
			break;
		case 2 : 
			System.out.println("Its tuesday !");
			break;
			
		case 3 :
			System.out.println("Its wednesday Thursday !");
			break;
		case 4 : 
			System.out.println("Its Thursday !");
			break;
		case 5 : 
			System.out.println("Its Friday !");
			break;
		case 6 : 
			System.out.println("Its Saturday !");
			break;
		case 7 : 
			System.out.println("Its sunday !") ; 
			break;
		default :
			System.out.println("Error please change the number !!!!!");
			
		}
		
		

	}

}
