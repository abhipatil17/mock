package inheritance;

public class son extends father{
	
		public void bike() {
			System.out.println("bike");
		}
	public static void main(String[] args) {
		son s = new son();
		s.money();
		s.car();
		s.home();
		s.bike();
	}

}
