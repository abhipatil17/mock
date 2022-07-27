package polymorphism;

public class run extends runtimepolymorphism{	//super class method is hide
	public static void demo() {
		System.out.println("demo is not running");	// change implementation
	}
	public static void main(String[] args) {
		//run r = new run();	//call sub class method is called method hiding
		run.demo();
	}

}
