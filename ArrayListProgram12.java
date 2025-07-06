package module1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//WAP to store the elements in a List and iterate them in forward and backwards way
public class ArrayListProgram12 {

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList <Integer>();
		l1.add(32);
		l1.add(56);
		l1.add(77);
		l1.add(88);
		l1.add(59);
	ListIterator<Integer> l2=l1.listIterator();
	
	System.out.println("Forward Iteration");
	while(l2.hasNext()) 
	{
		System.out.println(l2.next());
	}
	System.out.println("Backword Iteration");
	
	while(l2.hasPrevious()) 
	{
		System.out.println(l2.previous());
	}
	}

}
