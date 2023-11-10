import java.util.InputMismatchException;
import java.util.Scanner;
public class Main{
    public static int getValue(){
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        while (true) {
            try {
                System.out.println("Enter a value");
                value = scanner.nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("ERROR! Invalid input enter valid numeric data");

            }

            if(value<1 || value> 100){
                System.out.println("ERROR! Invalid input!Enter value between 1 and 100");
            }
            else{
                break;
            }
        }
        return value;


    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        getValue();
    }


}