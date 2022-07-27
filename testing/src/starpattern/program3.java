package starpattern;

public class program3 {
public static void main(String [] args) {
	int star=5;
	//int space=1;
	for(int x=1; x<=5; x++) {
		for(int y=1;y<=star;y++) {
			System.out.print("*");
		}
		//for(int z=1; z<=space;z++) {
		//	System.out.print(" ");
		//}
		System.out.println();
		star--;
		//space++;
	}
}
	
}
