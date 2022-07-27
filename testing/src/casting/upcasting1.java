package casting;

public class upcasting1 extends upcasting{
	
	//we acquire properties from super class
	//override non static method from super class 
	
	public void demo() {	// super class method override here
		System.out.println("demo sub class");
	}
	
	public void set() {		// super class method override here
		System.out.println("set sub class");
	}
	
	public void sub() {		//sub class method
		System.out.println("sub class");
	}
	

}
