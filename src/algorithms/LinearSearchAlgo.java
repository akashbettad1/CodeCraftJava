package algorithms;

/**
 * Linear Search
 * When it’s best:
 * Small datasets.
 * The data is unsorted.
 * Simplicity is valued over speed.
 * Advantages: Easy to implement.
 * Complexity: 𝑂(n)
 */

public class LinearSearchAlgo {

    // Method to perform linear search
    public static int linearSearch(int[] arr, int target) {
        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element is the target
            if (arr[i] == target) {
                return i; // Return the index of the target
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60};
        int target = 40;

        int result = linearSearch(array, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
