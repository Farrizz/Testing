package com.string;

public class StringFunctions {
	
	public static void main(String[] args) {
		
		String s ="Good Morning Everyone";
		String s1 = "good morning everyone";
		String s2 = null;
		String s3 = " ";
		String s4 = " Hi Brother ";
		String s5 = "";
		
		int len = s.length();
		System.out.println(len);
		
		boolean eq = s.equals(s4);
		System.out.println("Equals is : " +eq);
		
		boolean ei = s.equalsIgnoreCase(s1);
		System.out.println("Igonecase is : " +ei);
		
		String uc = s1.toUpperCase();
		System.out.println(uc);
		
		String lc = s.toLowerCase();
		System.out.println(lc);
		
		boolean sw = s4.startsWith(" ");
		System.out.println("Starts with: "+sw);
		
		boolean ew = s1.endsWith("Everyone");
		System.out.println("Ends with: "+ew);
		
		boolean cs = s.contains("f");
		System.out.println("Contains is: " +cs);
		
		int Io = s1.indexOf("n");
		System.out.println("Index of: " +Io);
		
		int lf = s1.lastIndexOf("g");
		System.out.println("LastIndexOf: " +lf);
		
		char ct = s4.charAt(2);
		System.out.println("CharAt: " +ct);
		
		String rep = s.replace("one", "1");
		System.out.println("Replace is: " +rep);
		
		String sub = s1.substring(5);
		System.out.println("SubString is: "+sub);
		
		String sub1 = s.substring(4, 12);
		System.out.println("SubString1 is: "+sub1);
		
		boolean emp = s5.isEmpty();
		System.out.println("isEmpty: " +emp);
		
		System.out.println(s4);
		String trim = s4.trim();
		System.out.println("Trim is: "+trim);
		
		String[] split = s.split(" ");
		
		 for (String str : split) {
			 
			 System.out.println(str);
			 
			 
			 
			 
			
		}
		
		
		
				
				
				
		
		
		
		
	}

}
