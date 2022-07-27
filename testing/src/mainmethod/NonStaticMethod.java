package mainmethod;

public class NonStaticMethod {
public void ap () {
	System.out.println("start non static method in same class");
}
public static void main(String[] args) {
	NonStaticMethod a = new NonStaticMethod();
	a.ap();
}
	
}
	

