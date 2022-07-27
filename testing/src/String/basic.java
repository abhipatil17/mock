package String;

public class basic {
	
	public static void main(String[] args) {
		
		String a = "velocity";
		String b = "velocity";
		
		String c = new String("velocity");
		String d = new String("velocity");
		
		System.out.println(a==b); 	//true
		System.out.println(c==d); 	//false
		System.out.println(a==d); 	//false
		
		System.out.println("-----------------------");
		
		b="class";
		System.out.println(a);
		System.out.println(b);
		System.out.println(a==b);
		
	}

}
