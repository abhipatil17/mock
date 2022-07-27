package casting;

public class Test_upcasting {
	
	public static void main(String[]args) {
		System.out.println("*****super class objects*****");
		
		upcasting a = new upcasting();
		a.demo();
		a.set();
		a.staticTest();
		
		System.out.println("*****sub class object*****");
		
		upcasting1 b = new upcasting1();
		b.demo();
		b.set();
		b.sub();
		b.staticTest();
		
		System.out.println("*****upcasting*****");
		
		upcasting c = new upcasting1();	//upcasting syntax here we can call super class method but it shows output of override method in sub class.
		c.demo();
		c.set();
		c.staticTest();
		
		System.out.println("*****down casting*****");
		
		upcasting1 d = (upcasting1) new upcasting();
		d.demo();
		d.set();
		d.sub();
		d.staticTest();
		
	}

}
