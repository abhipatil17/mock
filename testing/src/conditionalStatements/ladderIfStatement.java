package conditionalStatements;

public class ladderIfStatement {
public static void main(String[]args) {
	String projectdomain = "banking";
	if (projectdomain=="health care") {
		System.out.println("medical work related");
	}
	else if (projectdomain=="telecom") {
		System.out.println("for communication use");
	}
	else if(projectdomain=="banking") {
		System.out.println("money related transaction");
	}
	else {
		System.out.println("random project domain");
	}
}
}
