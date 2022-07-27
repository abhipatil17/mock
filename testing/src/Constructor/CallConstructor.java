package Constructor;

public class CallConstructor {			// call constructor in diff class
public static void main(String[] args) {
	constructor q = new constructor();
	q.class1();
	q.substraction();
	constructor w = new constructor(65,35);
	w.class1();
	w.substraction();
	constructor r = new constructor("xyz","pqr");
	r.class1();
	r.substraction();
}
	
}
