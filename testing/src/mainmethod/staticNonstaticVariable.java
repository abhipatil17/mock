package mainmethod;

public class staticNonstaticVariable {
static int a=25;			// static variable
       int b=35;			// non static variable
  staticNonstaticVariable(){ // user define constructor zero arg
    	   a=30;
    	   b=35;
       }
  staticNonstaticVariable(int c){ // user define constructor with arg
    	   a=100;
    	   b=200;
       }
  staticNonstaticVariable(char d){
	  b=1;
  }
  public static void main(String[] args) {
	  System.out.println(a);
//System.out.println(b);
	staticNonstaticVariable e = new staticNonstaticVariable();
		System.out.println(e.a);
		System.out.println(e.b);
	staticNonstaticVariable f = new staticNonstaticVariable(2);
		System.out.println(f.a);
		System.out.println(f.b);
	
	staticNonstaticVariable g = new staticNonstaticVariable('a');
		System.out.println(g.a);
		System.out.println(g.b);
}
	
}
