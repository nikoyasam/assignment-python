import java.util.Scanner;

public class Case{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		char c = scanner.next().charAt(0);
		
		if (c >= 'a' && c <= 'z') {
			System.out.println(c+ "is a lowcase letter.");
		}
			
		else if (c >= 'A' && c <= 'Z') {
			System.out.println(c + " is an uppercase letter.");
		}
		else{
			System.out.println(c + " is not a letter.");
			
		}
		
	}
}
			
		