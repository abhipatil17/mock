package operators;

public class logicalOperators {
	public static void main(String[]args) {
		// && operator (And)					when 1 condition true then and operator shows true result.
		System.out.println((10>5)&& (12>3)); // true
		System.out.println((10>5)&& (12<3)); // false
		// || operator (or)						when 2 condition true then operator shows true result.
		System.out.println((10>5)|| (12>3)); // true
		System.out.println((10>5)|| (12<3)); // true
		System.out.println((10<5)|| (12<3)); // false
		// !operator (Not)						when result is true then it shows false.
		System.out.println(!(3==5)); // true
		System.out.println(!(5>3)); // false
	}

}
