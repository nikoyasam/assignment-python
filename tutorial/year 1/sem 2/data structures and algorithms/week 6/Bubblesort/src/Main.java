/*


public class Main {
    public static void main(String[] args) {

        int[] arr = {62,89,32,67,21,39,88,55,94};
        int n= arr.length;

        for (int i = 0; i < n-1; i++) {
            // Inner loop for comparison
            for (int j = 0; j < n-i-1; j++) {
                // Swap elements if they are in wrong order
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

 */


import java.util.Arrays;

public class Main {
    public static void bubbleSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            // Inner loop for comparison
            for (int j = 1; j < n - 1; j++) {
                // Swap elements if they are in wrong order
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }

    }

    public static void main(String[] args){
        int[] arr = {62, 89, 32, 67, 21, 39, 88, 55, 94};
        System.out.println("Original Array: " + Arrays.toString(arr));
        bubbleSort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {

        }
    }
}

