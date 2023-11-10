import java.util.Scanner;

public class New{
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the temperature in celsius: ");
		int a = scanner.nextInt();
		
		if (a>=25){
			System.out.println("It is hot");
			
		}
			
		else {
			System.out.println("It is cold");
			
		}
		
	}
	
}
			