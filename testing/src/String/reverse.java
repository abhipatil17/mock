package String;

public class reverse {
	
	public static void main(String[] args) {
		
		String a = "velocity";
		String rev = "";	//yticolev
		
		for(int i=a.length()-1;i>=0;i--) {
			rev = rev + a.charAt(i);	//to save the character
		}
		System.out.println(rev);		//to print character
	}

}
