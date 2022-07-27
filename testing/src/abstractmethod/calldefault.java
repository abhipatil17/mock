package abstractmethod;

public class calldefault implements defaultmethodinterface{
	public void mart() {		
		System.out.println("all shops");
	}
	public void Dmart() {	// default method from interface
		System.out.println("shopping grocery");	// change implement
	}

}
