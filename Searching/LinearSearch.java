//Linear Search using java 

// Time Complexity :
//     Worst Case : O(n)
//     Average Case : O(n)
//     Best Case : O(1)
// Space Complexity : O(1)
import java.util.Scanner;

public class LinearSearch {

    private static int linearSearch(int[] arr, int n, int searchElement) {
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == searchElement) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the number of elements in the array:");
            int n = scanner.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            System.out.println("Enter the element to search:");
            int searchElement = scanner.nextInt();

            int index = linearSearch(arr, n, searchElement);

            if (index == -1) {
                System.out.println("Element not found in the array.");
            } else {
                System.out.println("Element found at index: " + index);
            }
        }
    }
}
