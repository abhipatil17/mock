package conditionalStatements;

public class nestedIfStatement1 {
public static void main(String[] args) {
	int student1=46, student2=89;
	if(student1>35) {
		System.out.println("distinction student1");
	if(student1>75) {
		System.out.println("second class student1");
	}
	else {
		System.out.println("student pass");
	}
	if(student2>75) {
		System.out.println("distinction student2");
	}
	else {
		System.out.println("fail student2");
	}
	}
	else {
		System.out.println("fail student1");
	}
}
}
