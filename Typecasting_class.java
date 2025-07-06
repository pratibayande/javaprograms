package module1;

class Swiggy
{
	void disp() 
	{
		System.out.println("disp running");
	}
}

public class Typecasting_class extends Swiggy 
{

	public static void main(String[] args) {
		
		Swiggy a1=new Typecasting_class();			//class level typecasting implicitly
		a1.disp();
	
		Swiggy a2= (Swiggy) new Typecasting_class();	//class level upcasting explicitly
		System.out.println(a2);
		a2.disp();
		
		Typecasting_class t1=(Typecasting_class) a2; 	//downcasting explicitly
		System.out.println(t1);
		t1.disp();
	}

}
