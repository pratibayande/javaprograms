package module1;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

//WAP on Collections using below methods.a)singleton() b)singletonMap() c)singletonList()
	public class Singleton {
	public static void main(String[] args) {
		
	Set<String> s=Collections.singleton("Java");
	System.out.println(s);
	List<String> l=Collections.singletonList("Python");
	System.out.println(l);
	Map<String, Integer> m=Collections.singletonMap("Selenium", 60);
	System.out.println(m);
		
	}
}
