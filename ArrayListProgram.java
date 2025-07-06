package module1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ArrayListProgram {

	//WAP to store dala elements in a set and to iterate the elements of set.
	public static void main(String[] args) {

		Set<String> s1=new HashSet<String>();
		//s1.add(25);
		//s1.add(369);
		//s1.add(null);
		//s1.add(null);
		//s1.add(0);
		//s1.add(25);
		s1.add("Kavita");
		s1.add("Savita");
		s1.add("sunita");
		s1.add("Babita");
		s1.add("Anita");
		
		System.out.println(s1);
		
		Iterator<String> l1= s1.iterator();
		while(l1.hasNext()) 
		{
			System.out.println(l1.next());
		}
		
		
	}

}
