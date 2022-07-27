package conditionalStatements;

public class ifElseStatement1 {
public static void main(String[]args) {
	float percentage = 60.35f;
	float percentage1 = 80.55f;
	if(percentage >75) {
		System.out.println("selected for next round");
	}
	if (percentage1 >75) {
		System.out.println("candidate selected for next round");
	}
	else {
		System.out.println("candidate is disqualify");
	}
}
}
