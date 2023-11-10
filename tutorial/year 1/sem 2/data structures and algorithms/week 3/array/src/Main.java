import java.util.Arrays;

 public class Main {
     public static void main(String[] args) {
         // Creating an array of size 10
        int[] array = new int[10];
        array[0] = 56;
        array[1] = 67;
        array[2] = 19;
        array[3] = 75;
        array[4] = 97;
        array[6] = 47;
        array[7] = 11;


        boolean isFull = true;
        for (int i = 0; i < array.length; i++) {
             if (array[i] == 0) {
                 isFull = false;
                 break;
             }
         }
        if (isFull) {
             System.out.println("The array is full.");
         } else {
             System.out.println("The array is not full.");
         }

         // Printing the array
         System.out.println(Arrays.toString(array));
    }
 }


