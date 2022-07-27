package conditionalStatements;

public class nestedIfStatement {
public static void main(String[] args) {
	String Username = "Abhi";
	String Password = "1234";
	if (Username=="Abhi") {
		System.out.println("Username correct");
	if(Password=="123") {
		System.out.println("Password correct");
		System.out.println("login successful");
		}
	else {
		System.out.println("Wrong Password");
		System.out.println("Login failed");
	}
	}
	else {
		System.out.println("Wromg Username");
		System.out.println("Login Failed");
	}
}
}
