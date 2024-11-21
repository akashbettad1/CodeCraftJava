package codingpractices;

public class SecondLargestNumberCheck {

    public int findSecondLargestNumber(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void main (String[] args) {
        SecondLargestNumberCheck secondLargestNumberCheck = new SecondLargestNumberCheck();
        System.out.println(
                secondLargestNumberCheck.findSecondLargestNumber(new int[] {173, 6, 100, 5000, 154}));

        System.out.println(
                secondLargestNumberCheck.findSecondLargestNumber(new int[] {113, 700, 20, 3200, 457}));
    }
}