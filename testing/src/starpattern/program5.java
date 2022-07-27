package starpattern;

public class program5 {
public static void main(String[] args) {
	int space=4;
	int star=1;
	for(int g=1;g<=5;g++) {
		for(int h=1;h<=space;h++) {
			System.out.print(" ");
		}
		for(int j=1;j<=star;j++) {
			System.out.print(j);
		}
		System.out.println();
		space--;
		star=star+2;
	}
}
	
}
