package starpattern;

public class program4 {
public static void main(String[] args) {
	int space=4;
	int star=1;
	for(int d=1;d<=5;d++) {
		for(int e=1;e<=space;e++) {
			System.out.print(" ");
		}
		for(int f=1;f<=star;f++) {
			System.out.print("*");
		}
		System.out.println();
		star++;
		space--;
	}
}
	
}
