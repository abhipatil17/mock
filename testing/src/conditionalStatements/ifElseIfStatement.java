package conditionalStatements;

public class ifElseIfStatement {
public static void main(String[]args) {
	int marks=25;
	if (marks>=75) {
		System.out.println("distinction");
	}
	else if (marks>=60) {
		System.out.println("first class");
	}
	else if (marks>=45){
		System.out.println("second class");
	}
	else {
		System.out.println("student is fail");
	}
}
}
