package starpattern;

public class program7 {
	public static void main(String[] args) {
		
		int count =1;
		for (int i=1;i<=4;i++){
			for (int j=4;j>=i;j--) {
				System.out.println(" ");
			}
			for(int k=1;k<=i;k++,count++) {
				System.out.println(count);
				System.out.println();
			}
			
		}
	}

}
