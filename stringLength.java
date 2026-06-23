public class stringLength{
	static void printLetters(String str){
		//here string length is a function unlike arrays.length which is a property
		for(int i=0; i<str.length(); i++){
			System.out.print(str.charAt(i)+" ");
		}
		System.out.println();
	}

	public static void main(String args[]){
		String fullName = "Tony Stark";
		//here string length is a function unlike arrays.length which is a property
		System.out.println(fullName.length());
	
		printLetters("Tony Stark");
	}
}