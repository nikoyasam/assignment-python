public class Main{
	public static void main(String args[]){
		int miles;
		int yards;
		double kilometers;
		
		miles = 26;
		yards = 385;
		
		kilometers = 1.609 * (miles + (yards / 1760.0));
		
		System.out.println("A marathon is " + kilometers + " kilometers.");
		
	}
}

 
		
		
