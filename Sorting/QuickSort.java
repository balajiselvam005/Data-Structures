//Quick sort using java 

// Time Complexity :
// Worst Case : O(n^2)
// Average Case : O(n logn)
// Best Case : O(n logn)
// Space Complexity : 
// Worst Case : O(n)
// Average Case : O(logn)
// Best Case : O(logn)
import java.util.Scanner;

public class QuickSort {

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;

        return i + 1;
    }

    private static void quickSort(int[] a, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(a, start, end); // Corrected arguments
            quickSort(a, start, pivotIndex - 1);
            quickSort(a, pivotIndex + 1, end);
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of elements in the array: ");
            int n = scanner.nextInt();

            int[] arr = new int[n];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            System.out.println("Array elements before sorting: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }

            quickSort(arr, 0, n - 1);

            System.out.println("\nArray elements after sorting: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }
}
