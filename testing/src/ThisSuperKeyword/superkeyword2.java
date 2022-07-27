package ThisSuperKeyword;

public class superkeyword2 extends superkeyword1 {
	int a=110;
	public void test() {
		System.out.println(this.a);
		System.out.println(super.a);
	}
	public static void main(String[] args) {
		superkeyword2 s = new superkeyword2();
		s.demo();
		s.test();
	}

}
