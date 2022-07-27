package inheritance;

public class superkeyword1 extends superkeyword {
	int a=90;
	public void demo() {
		int a=80;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
	public static void main(String[] args) {
		superkeyword1 s = new superkeyword1();
		s.demo();
	}

}
