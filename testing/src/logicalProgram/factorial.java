package logicalProgram;

public class factorial {
	public static void main(String[] args) {
		int a= 5;		//5*4*3*2*1
		int f= 1;
		for(int i=a;i>=1;i--) {
			f= f*i;
		}
		System.out.println(f);
		
		}
}
