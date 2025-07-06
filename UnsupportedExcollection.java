package module1;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

//WAP to handle UnsupportedOperationException.
public class UnsupportedExcollection {

	public static void main(String[] args) {
		
		Set<String> s=Collections.singleton("Java");
		System.out.println(s);
		List<String> l=Collections.singletonList("Python");
		System.out.println(l);
		Map<String, Integer> m=Collections.singletonMap("Selenium", 60);
		System.out.println(m);
			
		try {
			s.add("Ruby");
		}
			catch
			 (UnsupportedOperationException e){
					System.out.println("Cannot Modify set");
				}
			
		try {
			l.add("perl");
		}
			catch
			 (UnsupportedOperationException e){
					System.out.println("Cannot Modify list");
				}
		
		try {
			m.put("Ruby",25);
		}
			catch
			 (UnsupportedOperationException e){
					System.out.println("Cannot Modify map");
				}

		}

	

	

}
