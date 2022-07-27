package inheritance;

public class Interface1 implements Interface {
	public void m1() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		System.out.println("running m1 method");
	}
	public void m2() {
		System.out.println("running m2 method");
	}

}
