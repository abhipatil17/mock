package mainmethod;

public class UserDefineMethosWithReturnType {
static int demo(){
	int x = 17;
	int y = 20;
	int z = x+y;
	return z;
}
static String demo1() {
	return "welcome";
}
public static void main(String[]args) {
	int z = demo();		//save return type value in datatype then it call with method name.
	String x = demo1();	
System.out.println(x);
System.out.println(z);

}
	
}
