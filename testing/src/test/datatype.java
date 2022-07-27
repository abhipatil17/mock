package test;

public class datatype {
	public static void main(String[] args)
	{
		boolean stdPass = true; // conditional data type only true or false o/p
		byte stdmaxmarks= 100; //value from -128 to 127 instead of int to save memory
		short stdtotalmarks = 500; // values from -32768 to 32767
		int stdrollno = 3276789; // greater than short value
		long stdmobileno = 7709469094l; // l is mandatory when we declare long
		double stdavgmarks = 14.26587426; // use for fractional number max 15 digit
		float stdpercentage = 78.65f; // f is mandatory
		char stdgrade = 'A';
		System.out.println(stdPass);
		System.out.println(stdmaxmarks);
		System.out.println(stdtotalmarks);
		System.out.println(stdrollno);
		System.out.println(stdmobileno);
		System.out.println(stdavgmarks);
		System.out.println(stdpercentage);
		System.out.println(stdgrade);
	}
}
