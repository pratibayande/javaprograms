package module1;

import java.util.ArrayList;

public class ArrayListProgram7 {
//WAP of Arraylist using below methods.a)remove(object) b)remove(index,element) c)removeAll(Collection)
	
	public static void main(String[] args) {
		ArrayList a1=new ArrayList ();
		a1.add(25);
		a1.add("growtech");
		a1.add(null);
		a1.add(25.23);
		a1.add('A');
		
		System.out.println(a1);
		a1.remove(3);
		a1.remove(null);
		
		System.out.println(a1);

		//a1.removeAll(a1);
		
		System.out.println(a1);

		
		
		

	}

}
