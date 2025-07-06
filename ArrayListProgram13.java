package module1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//WAP to store the elements in a list and use .Iterate method to iterate the elements in forwards direction.
public class ArrayListProgram13 {

	public static void main(String[] args) {
		
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(13);
		l1.add(8);
		l1.add(45);
		l1.add(78);
		Iterator<Integer> l2=l1.iterator();
		
		while(l2.hasNext()) 
		{
			System.out.println(l2.next());
		}
	}

}
