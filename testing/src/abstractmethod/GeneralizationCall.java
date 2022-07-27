package abstractmethod;

public class GeneralizationCall {
	public static void main(String[] args) {
		
		System.out.println("*****features of Airtel*****");
		
		GeneralizationAirtel a = new GeneralizationAirtel();
		a.audiocalling();
		a.sms();
		a.internet();
		
		System.out.println("*****features of Jio*****");
		
		GeneralizationJio b = new GeneralizationJio();
		b.audiocalling();
		b.sms();
		b.internet();
		
	}
}
