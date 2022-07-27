package abstractmethod;

public class EncapsulationCall extends Encapsulation{
	
	public static void main(String[] args) {
		
		Encapsulation.set(1234);	//call static method
		
		EncapsulationCall x = new EncapsulationCall();
		x.get(12);					//call non static method
		//System.out.println(y);
	}

}
