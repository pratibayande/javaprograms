package module1;

import java.util.ArrayList;
import java.util.Iterator;

//WAP using .iterator method to print the objects in the forward iteration
	public class ArrayListProgram10 {
		
	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList <Integer>();
		a1.add(23);
		a1.add(56);
		a1.add(77);
		a1.add(88);
		a1.add(96);
		System.out.println(a1);
		
		Iterator<Integer>l1=a1.iterator();
		while(l1.hasNext()) 
		{
			System.out.println(l1.next());
		}
		
	}

}
