package mainmethod;

public class StaticVariable {
static int a = 20;						// static variable
public static void main(String[] args) {
	StaticVariable z = new StaticVariable();
	StaticVariable y = new StaticVariable();
	System.out.println(z.a);
	System.out.println(y.a);
	y.a=40;					// when we change static value then it save in memory and after that whenever we call it shows latest result.
	System.out.println(z.a);
	System.out.println(y.a);
	
}
	
}
