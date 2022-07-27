package primeAssignment;

public class primeNumber {
	// print prime number between 1 to 100
		public static void main(String[] args) {
			int i=0,count,j;
			for(i=1;i<=100;i++) {	//use this for loop for print number between 1 to 100
				 count=0;			//	i=3
			for(j=1;j<=i;j++) {		//	j=1,2,3			this for loop for print specific value is prime or not
				if(i%j==0) 			//count=0,1,3
					count++;
				}
				if(count==2) {
					System.out.println(i);
					//System.out.println("prime number");
				}				
				else {
					//System.out.println("not prime number");
				}
			
			}
				
		}}
		
	

