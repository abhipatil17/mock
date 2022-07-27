package abstractconcrete;

public class concrete extends abstract1{	//concrete class
	public void show() {		//abstract class incomplete method complete in concrete class
		System.out.println("running show method");
	}
	public void demo() {
		System.out.println("running show method");
	}
	public static void main(String[] args) {
		concrete c = new concrete();	//create object of concrete class
		c.demo();
		c.show();
		c.display();
	}

}
