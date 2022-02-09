package com.string;

public class StringTypes2 {
	
	public static void main(String[] args) {
		
		
		//Non Literal or Updated Mutable
		
		
		String sb1 = new String ("Hassan");
		
		
		System.out.println(System.identityHashCode(sb1));
		
		
		
		String sb2 = new String ("Hassan");
		
		
		System.out.println(System.identityHashCode(sb2));
		
		
	}

}
