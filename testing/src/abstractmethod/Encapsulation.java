package abstractmethod;

public class Encapsulation {	//hiding a data member from a class using "private" access specifier
	private int a=55;	// variable initialization & declaration with private access specifier
	static private int b=87;
	
	public static void set (int c) {	
		b=c;
		System.out.println(b);
	}
	
	public void get(int d) {
		a=d;
		System.out.println(a);
	
	}

}
