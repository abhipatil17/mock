package abstractmethod;

public class callStatic implements StaticMethodInterface {
	public void m1() {
		System.out.println("m1 method run");
	}
	public void m2() {
		System.out.println("m2 methid run");
	}
	public static void main(String[] args) {
		StaticMethodInterface.demo();
		callStatic a = new callStatic();
		a.m1();
		a.m2();
		
	}
}
