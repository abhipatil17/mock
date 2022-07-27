package inheritance;

public class RunMultilevelInheritance extends multiLevelInheritance1{
	public void development() {
		System.out.println("developer");
	}
	
	public static void main(String[] args) {
		RunMultilevelInheritance r = new RunMultilevelInheritance();
		r.velocity();
		r.velocity1();
		r.development();
	}

}
