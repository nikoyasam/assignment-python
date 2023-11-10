import java.util.Arrays;

public class Main {
    public static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int mid_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[mid_idx]) {
                    mid_idx = j;
                }
            }
            int temp = arr[mid_idx];
            arr[mid_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {62, 89, 32, 67, 21, 39, 88, 55, 94};
        System.out.println("Original Array: " + Arrays.toString(arr));
        selectionSort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {

        }
    }
}







