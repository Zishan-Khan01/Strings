import java.util.Scanner;
public class inputNOutput{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		//to take a single word as input(before space is encountered)
		String name = sc.next();
		System.out.println(name);

		//to take a whole line as input(even after space is encountered)
		String name1 = sc.nextLine();
		System.out.println(name1);
	}
}