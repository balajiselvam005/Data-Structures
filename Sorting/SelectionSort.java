//Selection sort using java 

// Time Complexity :
//     Worst Case : O(n^2)
//     Average Case : O(n^2)
//     Best Case : O(n^2)

// Space Complexity : O(1)

import java.util.Scanner;

public class SelectionSort {

    private static void selectionSort(int[] arr, int n) {
        int minIndex;
        for (int i = 0; i < n - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != -1) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
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

            selectionSort(arr, n);

            System.out.println("\nArray elements after sorting: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }
}
