package NewCollection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {
	
	public static void main(String[] args) {
		
		//Key		//Value				
	Map<Integer,String> m = new LinkedHashMap<>();
	
	m.put(10, "Harish");
	m.put(25, null);
	m.put(33, "Farries");
	m.put(42, "Siva");
	m.put(15, null);
	m.put(77, "Agni");
	
	System.out.println(m);
	
	int size = m.size();
	System.out.println(size);
	
	String string = m.get(33);
	System.out.println(string);
	
	Set<Integer> keySet = m.keySet();
	System.out.println(keySet);
	
	Collection<String> values = m.values();
	System.out.println(values);
	
	boolean containsKey = m.containsKey(11);
	System.out.println(containsKey);
	
	boolean containsvalue = m.containsValue("Siva");
	System.out.println(containsvalue);
	
	Set<Entry<Integer, String>> entrySet = m.entrySet();
	System.out.println(entrySet);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
	}

}
