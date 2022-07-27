package String;

public class All_String_methods {
	
	public static void main(String[] args) {
		
		String a = "velocity";
		String b = "VELOCITY";
		String c = "CITY";
		
		System.out.println(a.charAt(3));	//to print character present at index of 3.
		System.out.println(b.replace("V", "J"));	//it should change the letter v as j
		System.out.println(b.isEmpty());	//it shows string is empty or not in boolean return type
		System.out.println(b.concat(c));	//it joins two string
		System.out.println(a.substring(3));	//it shows result next to the index of 3 and also 3.
		System.out.println(b.substring(2, 5));	//it shows result between index of 2 to 5.
		System.out.println(c.endsWith("ty"));	//it shows result end with ty letter in string and return is boolean.
		System.out.println(a.startsWith("vel"));	//it shows result start with vel letter in string and return is boolean.
		System.out.println(c.lastIndexOf("T"));	//it shows index value of letter present in string.
		System.out.println(c.indexOf("T"));	//it shows index value of letter present in string.
		System.out.println(b.contains(a));
		System.out.println(a==b);
		System.out.println(a.equals(b)); 	//it shows string is equal or not it mandatory string is uppercase or lowercase.
		System.out.println(b.equalsIgnoreCase(a)); 	//it also shows string is equal or not but it not mandatory string is case like uppercase or lowercase
		System.out.println(a.length()); 	//to find length of string
		System.out.println(a.toUpperCase()); 	// it print string in uppercase.
		System.out.println(c.toLowerCase()); 	// it print string in lowercase.
	}

}
