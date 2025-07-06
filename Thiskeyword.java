package module1;


public class Thiskeyword {

	int age;
	String college;
	double weight;
	
	
	
	void domain(int id, String name, double inc) 
	{
		this.age=id;
		this.college=name;
		this.weight=inc;

		System.out.println("Local variable :" +id);
		System.out.println("Local variable :"+ name);
		System.out.println("Local variable :"+ inc);
		
		System.out.println("Calling global variable using this keyword");

	}
	
	public static void main(String[] args) {
		
		Thiskeyword t1=	new Thiskeyword();
		t1.domain(36, "gpt", 100);
		
		System.out.println("Global variable :"+t1.age);
		System.out.println("Global variable :"+t1.college);
		System.out.println("Global variable :"+t1.weight);

	}

}
