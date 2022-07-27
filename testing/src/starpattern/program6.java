package starpattern;

public class program6 {
public static void main(String[] args) {
	int star=9;
	int space=0;
	for(int k=1;k<=5;k++) {
		for(int m=1;m<=space;m++) {
			System.out.print(" ");
		}
		for(int l=1;l<=star;l++) {
			System.out.print("*");
		}
		
		System.out.println();
		star =star-2;
		space++;
	}
}
	
}
