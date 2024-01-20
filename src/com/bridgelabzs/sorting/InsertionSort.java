package com.bridgelabzs.sorting;k

public class InsertionSort {


    public static void main(String[] args) {
        // Sample array of numbers
        int[] array = {5, 2, 8, 1, 3};

        // Display the array before sorting
        System.out.println("Array before sorting: ");
        printArray(array);

        // Perform insertion sort
        insertionSort(array);

        // Display the array after sorting
        System.out.println("\nArray after Insertion Sort: ");
        printArray(array);
    }

    // Insertion Sort Algorithm
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Utility method to print an array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
