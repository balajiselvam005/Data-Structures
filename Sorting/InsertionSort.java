//Insertion sort using java 

// Time Complexity :
//     Worst Case : O(n^2)
//     Average Case : O(n^2)
//     Best Case : O(n)
// Space Complexity : O(1)
import java.util.Scanner;

public class InsertionSort {

    private static void insertionSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of elements in the array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("Array elements before sorting: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }

            insertionSort(arr, n);

            System.out.println("\nArray elements after sorting: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }
}
