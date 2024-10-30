//Bubble sort using java 

// Time Complexity :
//     Worst Case : O(n^2)
//     Average Case : O(n^2)
//     Best Case : O(n)

// Space Complexity :
//     Worst Case : O(1);

import java.util.Scanner;

public class BubbleSort {

    private static void bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
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

            bubbleSort(arr, n);

            System.out.println("\nArray elements after sorting: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }
}
