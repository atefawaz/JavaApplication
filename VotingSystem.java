package java_practice;

import java.util.Scanner;

public class VotingSystem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your age:");
		
		int age = sc.nextInt();
		
		if (age > 18) {
			System.out.println("ELIGIBLE");
		} else {
			System.out.println("Not ELIGIBLE , still young !");
		}
		
		sc.close();
		

	}

}
