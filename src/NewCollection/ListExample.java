package NewCollection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
	
	public static void main(String[] args) {
		
		List<Object> li = new LinkedList <Object>();
		
		li.add(30);
		li.add(40);
		li.add("Morning");
		li.add(500.36);
		li.add(255);
		
		System.out.println(li);
		
		int size = li.size();
		System.out.println(size);
		
		Object obj = li.get(2);
		System.out.println(obj);
		
		li.set(4, "Java"); 
		System.out.println(li);
		
		int io = li.indexOf(40);
		System.out.println(io);
		
		boolean ct = li.contains("Java");
		System.out.println(ct);
		
		List<Integer> li1 = new LinkedList<Integer>();
		
		li1.add(60);
		li1.add(42);
		li1.add(78);
		li1.add(50);
		li1.add(92);
		
		System.out.println(li1);
		
		li.addAll(li1);
		System.out.println(li1);
		
	  // li.retainAll(li1);
	  // System.out.println(li);
	   
	  // li.removeAll(li1);
	  // System.out.println(li);
	   
	   
	   //ascendingOrder
	   Collections.sort(li1);
	   System.out.println(li1);
	   
	   Collections.sort(li1, Collections.reverseOrder());
	   System.out.println(li1);
	   
	   
	   for (Integer val : li1) {
		   System.out.println(val);
		
	}
	   
	 //  li1.remove(3);
	 //  System.out.println(li1);
	   
	   li.clear();
	   System.out.println(li);
	   
	   for (int i = 0; i < li1.size(); i++) {
		   
		   System.out.println(li1.get(i));
		
	}
	   
	   
	   
	   
	   
		
		
		

		
		
		
		
		
		
		
		
	}

}
