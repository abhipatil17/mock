package scanner;

import java.util.Scanner;

public class scanner1 {

	public static void main(String[] args) {
		Scanner demo =new Scanner(System.in);
	System.out.println("enter the value");
	int value = demo.nextInt();
	boolean xyz = demo.hasNext();
	System.out.println("you entered value" + value);
	System.out.println(xyz);
	

	}
}
