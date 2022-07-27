package polymorphism;

public class compilepolymorphism {
	public void add(int a, int b) {		// method overload
		System.out.println("addition="+(a+b));
	}
	public void add1(int a, int b, int c) {	//method overload
		System.out.println("addition="+(a+b+c));
	}

	public static void main(String[] args) {
		compilepolymorphism c = new compilepolymorphism();
		c.add(100, 200);
		c.add1(150, 250, 350);
	}
}
