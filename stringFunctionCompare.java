public class stringFunctionCompare{
	public static void main(String args[]){
		String s1 = "Tony";	//String made without new keyword points to same String that we created before i.e. s1
		String s2 = "Tony";
		String s3 = new String("Tony");	//String made with new keyword occupy another memory space even if a string with same content is present

		if(s1 == s2){	//in case of Strings == checks only if stringd are same at object level only(pointing to same memory location or not)
			System.out.println("s1 & s2 are equal");
		}
		else{
			System.out.println("s1 & s2 are not equal");
		}
		
		if(s1 == s3){
			System.out.println("s1 & s3 are equal");
		}
		else{
			System.out.println("s1 & s3 are not equal");
		}

		//to check if the content of strings are same we need to use equals() function
		if(s1.equals(s3)){
			System.out.println("s1 & s3 are equal");
		}else{
			System.out.println("s1 & s3 are not equal");
		}
	} 
}