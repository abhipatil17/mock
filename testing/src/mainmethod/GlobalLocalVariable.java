package mainmethod;

public class GlobalLocalVariable {
	int a=90;			// global variable
	public void demo() {
		int b=80;		// local variable
	System.out.println(a);
	System.out.println(b);
	}
	public void demo1() {
		int c=70;		// local variable
	System.out.println(a);
	//System.out.println(b); // we can't call local variable in diff method
	System.out.println(c);
	}
	public static void main(String[] args) {
		GlobalLocalVariable x = new GlobalLocalVariable();
		x.demo();
		x.demo1();
		
	}
}
