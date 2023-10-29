package java_practice;

import java.util.Scanner;

public class LowerUpperCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Write a word :");
		
		String word  = sc.next();
		
		if (!word.isEmpty()) {
			
			char firstchar = word.charAt(0);
			
			if (Character.isUpperCase(firstchar)) {
				
				word = word.toLowerCase();
				
				System.out.println(word);
				
				
			} else {
				
				word = word.toUpperCase();
				
				System.out.println(word);
				
			}
		}
		
		sc.close();

	}

}
