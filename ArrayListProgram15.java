package module1;

import java.util.HashMap;

public class ArrayListProgram15 {
//WAP to store Key and Value in a Map.
	public static void main(String[] args) {
		HashMap <Integer, String> h=new HashMap<Integer, String>();
		h.put(11, "Gadag");
		h.put(12, "Belgavi");
		h.put(13, "BHEL");
		h.putIfAbsent(15, "Bidadi");
	
		HashMap <Integer, String> m=new HashMap<Integer, String>();
		m.put(415, "Radha");
		m.put(416, "Shyam");
		m.putAll(h);
		System.out.println(m);
		System.out.println(m.equals(h));
		System.out.println(m.remove(15));
		System.out.println(m.remove(416, "Shyam"));
		System.out.println(m.replace(13, "ECIL"));
		System.out.println(m.replace(11, "Gadag", "Kalaburgi"));
		System.out.println(m.containsKey(15));
		System.out.println(m.get(11));
		System.out.println(m.containsValue("ECIL"));
		System.out.println(m.size());
		

		
	}

}
