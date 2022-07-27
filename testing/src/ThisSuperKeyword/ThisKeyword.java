package ThisSuperKeyword;

public class ThisKeyword {
	int i=80;		//global variable
	public void add() {
		int i=90;	//local variable
		System.out.println(i);		//call local variable
		System.out.println(this.i);	//call global variable
		}
	public static void main(String[]args) {
		ThisKeyword t = new ThisKeyword();
		t.add();
	}
		
	}


