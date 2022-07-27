package operators;

public class logicalOperators1 {
public static void main(String[]args) {
	System.out.println((23<53)&& (10<5)); // false
	System.out.println((11!=22)&& (20>30)); // false
	System.out.println((35==10)|| (56>123)); // false
	System.out.println((11==11)|| (20!=21)); // true
	System.out.println(!(20>=125)); // true
	System.out.println(!(125<=20)); // true
	
}
}
