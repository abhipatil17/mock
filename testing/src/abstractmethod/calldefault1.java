package abstractmethod;

public class calldefault1 implements defaultmethodinterface{
	public void mart() {
		System.out.println("all shops open");
	}
	public static void main(String[] args) {
		calldefault a = new calldefault();
		a.mart();
		a.Dmart();
		calldefault1 b = new calldefault1();
		b.mart();
		b.Dmart();
	}

}
