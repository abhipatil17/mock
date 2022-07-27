package multipleinheritance;

public class test implements A,B{
	public void m1() {
		System.out.println("m1 is running");
	}
	public void m2() {
		System.out.println("m2 is running");
	}
	public void m3() {
		System.out.println("m3 is running");
	}
	public void m4() {
		System.out.println("m4 is running");
	}
	public static void main(String[] args) {
		test t = new test();
		t.m1();
		t.m2();
		t.m3();
		t.m4();
	}
	

}
