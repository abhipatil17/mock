package String;

public class fibonancci {
	
	public static void main(String[] args) {
		//0 1 1 2 3 5 8 13 21 34 addition of last two digit it called fibonancci.
		
		int a=0;
		int b=1;
		int c=10;
		
		System.out.print(a+" "+b);	//print value of a & b
		
		for(int i=2;i<c;++i) {			//to rotate the loop upto value of c 
			int d=a+b;					//addition of a & b because of we want to achieve fibonancci
			System.out.print(" "+d);
			a=b;						//assign value of b to a
			b=d;						//assign value of d to b
		}
	}

}
