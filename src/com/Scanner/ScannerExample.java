package com.Scanner;

import java.util.Scanner;

public class ScannerExample {
	
	public static void main(String[] args) {
		
		Scanner sr = new Scanner(System.in);
		
		System.out.println("Enter your Name");
		String name = sr.nextLine();
		System.out.println(name);
		
		System.out.println("Enter your ID");
		int ID = sr.nextInt();
		System.out.println(ID);
		
		System.out.println("Enter your gender");
		String Gender = sr.next();
		System.out.println(Gender);
		
		System.out.println("Enter one word");
		char word = sr.next().charAt(5);
		System.out.println(word);
		
		

		
	}
	
	
	

}
