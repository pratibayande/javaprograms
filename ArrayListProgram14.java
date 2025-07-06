package module1;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ArrayListProgram14 {

	public static void main(String[] args) {

		Vector<Integer> a = new Vector<Integer>();

		a.addElement(25);
		a.add(26);
		a.add(2, null);
		a.add(25);
		a.add(null);
		System.out.println(a);

		System.out.println("Enumarator");

		Enumeration<Integer> e = a.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

		System.out.println("Iterator");

		Iterator<Integer> l = a.iterator();
		while (l.hasNext()) {
			System.out.println(l.next());
		}

		System.out.println("List Iterator forward");

		ListIterator<Integer> l2 = a.listIterator();
		while (l2.hasNext()) {
			System.out.println(l2.next());
		}
		
		System.out.println("List Iterator backword");

		while (l2.hasPrevious()) {
			System.out.println(l2.previous());
		}
	
	}

}
