package conditionalStatements;

public class ifElseIfStatement1 {
public static void main(String[]args) {
	int a=14;
	int b=37;
	if (a>=60){
		System.out.println("vaccination completed above age 60");
    }
	else if (b>=60) {
		System.out.println("vaccination completed above age 60");
	}
	else if (a>=18){
		System.out.println("vaccination completed above age 18");
	}
	else if (b>=18) {
		System.out.println("vaccination completed above age18");
	}
	else {
		System.out.println("Vaccination pending");
	}
	
}
}
