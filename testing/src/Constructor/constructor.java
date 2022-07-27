package Constructor;

public class constructor{ // compilation of constructor in same class
	int a;
	int b;
	int c;
	String abhi;
	String patil;
	constructor(){		// user define constructor without parameter
		a=17;
		b=37;
	}
	constructor(int d){		  //user defined constructor with datatype.
		a=d;
	}
	constructor(int d, int e){	  //user defined constructor with datatype.
		a=d;
		c=e;
	}
	constructor(int d, int e, int f){	//user defined constructor with datatype.
		a=d;
		b=f;
		c=e;
	}
	constructor(String abhi, String patil){ 	//user defined constructor with datatype.
	//	abhi="name";
	//	patil="velocity";
	
		
	}
	public void substraction() {
		System.out.println(a-b-c);
	}
	public void class1() {
		System.out.println("name");
		System.out.println("velocity");
	}
	public static void main(String[] args) {
		constructor z = new constructor();		//create object of consructor.
		z.substraction();
		z.class1();
		constructor x = new constructor(20);
		x.substraction();
		x.class1();
		constructor k = new constructor(20,30);
		k.substraction();
		k.class1();
		constructor v = new constructor(100,40,10);
		v.substraction();
		v.class1();
		constructor l = new constructor("abhi","patil");
		l.substraction();
		l.class1();
	}
	
	}
	
	

