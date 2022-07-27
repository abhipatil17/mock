package String;

public class count_spaces_in_string {
	
	public static void main(String[] args) {
		
		String a =" velocity   is the best  training  center   "; 	//to count spaces
		int count=0;
		
		for(int i=0;i<=a.length()-1;i++) {	//to find string value
			char b = a.charAt(i);			//save all string value in b
			if(b==' ') {					//compare b with space
				count++;					//count the space when string have space
			}
		}
			System.out.println(count);		
		
	}

}
