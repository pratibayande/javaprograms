package module1;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListProgram11 {
//	WAP of ArrayList using .listIterator method to print the objects in the forward iteration as well as in backward iteration
	public static void main(String[] args) {
		
		ArrayList<Integer> a1=new ArrayList <Integer>();
		a1.add(232);
		a1.add(560);
		a1.add(707);
		a1.add(188);
		a1.add(596);
		a1.add(596);
		a1.add(null);

		//System.out.println(a1);

		ListIterator<Integer> l1=a1.listIterator();
		
		System.out.println("=======================Forword===============");
		
		while(l1.hasNext()) 
		{
			System.out.println(l1.next());
			//System.out.println("Forward iteration using listiterator: "+ l1.nextIndex());
		}
		System.out.println("=======================Backword===============");
		while(l1.hasPrevious()) 
		{
			System.out.println(l1.previous());
			//System.out.println("Backword iteration using listiterator: "+ l1.previousIndex());
		}
	}

}
