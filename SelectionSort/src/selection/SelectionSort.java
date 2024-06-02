package selection;

import java.util.Scanner;

public class SelectionSort {

    // Function to implement Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        // One by one move the boundary of the unsorted sub array
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted array
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    // Helper function to print the array
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Main function to get user input and test the Selection Sort
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is Selection Sort!");
        System.out.println("Press Enter Key to continue...");
        scanner.nextLine();
        System.out.println("Enter the number of elements you want :- ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements one by one :- ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("This is Unsorted array:");
        printArray(arr);
        
        selectionSort(arr);
        System.out.println();
        
        System.out.println("This is Sorted array:");
        printArray(arr);
        System.out.println();
        System.out.println("End");

        scanner.close();
    }
}
