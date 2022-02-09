package com.string;

public class StringTypes {
	
	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer ("Mutable");
		
		System.out.println(System.identityHashCode(sb1));
				

		StringBuffer sb2 = new StringBuffer ("Mutable");
		
		System.out.println(System.identityHashCode(sb2));
		
		
													   //Memory will shared
		System.out.println(System.identityHashCode(sb1.append(sb2)));
				

}
}