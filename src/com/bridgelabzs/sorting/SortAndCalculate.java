package com.bridgelabzs.sorting;

import java.util.Arrays;

public class SortAndCalculate {
    public static void main(String[] args) {
        // Sample array of numbers
        int[] numbers = {4, 2, 8, 1, 5};

        // Call the method to sort, calculate average, and find even index elements
        int[] sortedNumbers = sortAndCalculate(numbers);

        // Print the results
        System.out.println("Original Array of Numbers: " + Arrays.toString(numbers));
        System.out.println("Sorted Array of Numbers: " + Arrays.toString(sortedNumbers));

        // Calculate average and sum of numbers in the array
        double average = calculateAverage(sortedNumbers);
        int sum = calculateSum(sortedNumbers);

        System.out.println("Average of Numbers: " + average);
        System.out.println("Sum of Numbers: " + sum);

        // Calculate average index
        double averageIndex = calculateAverageIndex(sortedNumbers);
        System.out.println("Average Index: " + averageIndex);

        // Find elements at even indices
        int[] evenIndexElements = getEvenIndexElements(sortedNumbers);
        System.out.println("Elements at Even Indices: " + Arrays.toString(evenIndexElements));
    }

    public static int[] sortAndCalculate(int[] arr) {
        // Sort the array of numbers
        Arrays.sort(arr);
        return arr;
    }

    public static double calculateAverage(int[] arr) {
        // Calculate the average of numbers in the array
        double sum = calculateSum(arr);
        return sum / arr.length;
    }

    public static int calculateSum(int[] arr) {
        // Calculate the sum of numbers in the array
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static double calculateAverageIndex(int[] arr) {
        // Calculate the average index of numbers in the array
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += i;
        }
        return sum / arr.length;
    }

    public static int[] getEvenIndexElements(int[] arr) {
        // Extract elements at even indices
        int[] evenIndexElements = new int[arr.length / 2];
        for (int i = 0; i < arr.length; i += 2) {
            evenIndexElements[i / 2] = arr[i];
        }
        return evenIndexElements;
    }
}


//public class SortAndCalculate {
//    public static void main(String[] args) {
//        // Sample array of numbers
//        int[] numbers = {4, 2, 8, 1, 5};
//
//        // Call the method to sort, calculate average, and find even index elements
//        int[] sortedNumbers = sortAndCalculate(numbers);
//
//        // Print the results
//        System.out.println("Original Array of Numbers: " + Arrays.toString(numbers));
//        System.out.println("Sorted Array of Numbers: " + Arrays.toString(sortedNumbers));
//
//        // Calculate average and sum of numbers in the array
//        double average = calculateAverage(sortedNumbers);
//        int sum = calculateSum(sortedNumbers);
//
//        System.out.println("Average of Numbers: " + average);
//        System.out.println("Sum of Numbers: " + sum);
//
//        // Calculate average index
//        double averageIndex = calculateAverageIndex(sortedNumbers);
//        System.out.println("Average Index: " + averageIndex);
//
//        // Find elements at even indices
//        int[] evenIndexElements = getEvenIndexElements(sortedNumbers);
//        System.out.println("Elements at Even Indices: " + Arrays.toString(evenIndexElements));
//    }
//
//    public static int[] sortAndCalculate(int[] arr) {
//        // Sort the array of numbers
//        Arrays.sort(arr);
//        return arr;
//    }
//
//    public static double calculateAverage(int[] arr) {
//        // Calculate the average of numbers in the array
//        double sum = calculateSum(arr);
//        return sum / arr.length;
//    }
//
//    public static int calculateSum(int[] arr) {
//        // Calculate the sum of numbers in the array
//        int sum = 0;
//        for (int num : arr) {
//            sum += num;
//        }
//        return sum;
//    }
//
//    public static double calculateAverageIndex(int[] arr) {
//        // Calculate the average index of numbers in the array
//        double sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += i;
//        }
//        return sum / arr.length;
//    }
//
//    public static int[] getEvenIndexElements(int[] arr) {
//        // Extract elements at even indices
//        int[] evenIndexElements = new int[arr.length / 2];
//        for (int i = 0; i < arr.length; i += 2) {
//            evenIndexElements[i / 2] = arr[i];
//        }
//        return evenIndexElements;
//    }
//}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


//	def sort_and_calculate(arr):
//	    # Sort the array of index numbers
//	    sorted_arr = sorted(arr)
//
//	    # Calculate the average index
//	    average_index = sum(sorted_arr) / len(sorted_arr)
//
//	    # Calculate the sum of numbers in the array
//	    sum_of_numbers = sum(sorted_arr)
//
//	    # Extract elements at even locations
//	    even_location_elements = sorted_arr[1::2]  # Assuming index starts from 1
//
//	    return sorted_arr, average_index, sum_of_numbers, even_location_elements
//
//	# Example usage
//	if __name__ == "__main__":
//	    # Sample array of index numbers
//	    index_numbers = [4, 2, 8, 1, 5]
//
//	    # Call the function to sort, calculate average index, and find sum of numbers
//	    # Also, find elements at even locations
//	    sorted_numbers, average, total_sum, even_location_elements = sort_and_calculate(index_numbers)
//
//	    # Print the results
//	    print("Original Array of Index Numbers:", index_numbers)
//	    print("Sorted Array of Index Numbers:", sorted_numbers)
//	    print("Average Index:", average)
//	    print("Sum of Numbers in the Array:", total_sum)
//	    print("Elements at Even Locations:", even_location_elements)
