package mainmethod;

public class NonStaticMethodCall {
public static void main(String[] args) {
	NonStaticMethod b = new NonStaticMethod();
	b.ap();
	System.out.println("start non static method in diff class");
}
	
}
