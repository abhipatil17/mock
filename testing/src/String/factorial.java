package String;

public class factorial {
	
	public static void main(String[] args) {
		//5*4*3*2*1	in factorial we need to multiple the all value that all below the given number
		
		int a= 5;			//assign given value
		int fact = 1;		//min factorial is 1.
		
		for(int i=a;i>=1;i--) {
			fact= fact*i;	//for multiplying all value 
		}
		System.out.println(fact);
	}

}
