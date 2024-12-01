package algorithms;

/**
 * Binary Search
 * When it’s best:
 * The dataset is sorted.
 * You need high efficiency.
 * Advantages: Fast compared to linear search for large datasets.
 * Complexity: O(logn)
 * Limitation: Requires sorted data.
 */

public class BinarySearchAlgo {

    public static int binarySearch(Integer[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while ( start <= end) {

            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 1000, 3284, 5656, 9874, 1000444};
        int target = 9874;
        int result = BinarySearchAlgo.binarySearch(arr, target);
        if (result == -1) {
            System.out.println("Number not found");
        }
        else {
            System.out.println("Element found at index: " + result);
        }
    }
}