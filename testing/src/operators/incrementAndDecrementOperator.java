package operators;

public class incrementAndDecrementOperator {
public static void main(String[]args) {
	// variable declaration
	int a=14, b=23;
	int Report1, Report2;
	// original value
	System.out.println("value of a="+a);
	// increment operator
	Report1=++a;
	System.out.println("after increment="+Report1);
	// original value
	System.out.println("value of b="+b);
	// decrement operator
	Report2=--b;
	System.out.println("after decrement="+ Report2);
	
}
}
