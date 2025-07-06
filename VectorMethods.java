package module1;

import java.util.Vector;

public class VectorMethods {

	public static void main(String[] args) {
		Vector <Integer> v=new Vector<Integer>();
		v.add(25);
		v.add(1, 36);
		v.addElement(14);
		v.add(0);
		v.addElement(85);
		System.out.println(v);
		System.out.println("Capacity: "+v.capacity());
		System.out.println("Contains: "+v.contains(36));
		System.out.println("Equals: "+v.equals(12));
		System.out.println("IndexOf: "+ v.indexOf(25));
		System.out.println("LastIndexOf: "+v.lastIndexOf(14));
		System.out.println("Size:"+v.size());
		System.out.println("LastIndexOf obi & ind: "+v.lastIndexOf(36, 1));
		System.out.println("GetIndex of :"+v.get(0));
		System.out.println("LastElement: "+v.lastElement());
		System.out.println("IsEmpty: " + v.isEmpty());
		System.out.println("Remove: " + v.remove(0));
	}

}
