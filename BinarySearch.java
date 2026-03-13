import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {3,4,5,6,7,2,1};
        int target = 5;

        // Step 1: Sort the array
        Arrays.sort(arr);

        int start = 0;
        int end = arr.length - 1;

        // Step 2: Binary Search Loop
        while (start <= end) {

            // Step 3: Find middle index
            int mid = start + (end - start) / 2;

            // Step 4: Check if target is found
            if (arr[mid] == target) {
                System.out.println("Element found at index: " + mid);
                return;
            }

            // Step 5: If target is greater, search right half
            else if (arr[mid] < target) {
                start = mid + 1;
            }

            // Step 6: If target is smaller, search left half
            else {
                end = mid - 1;
            }
        }

        // Step 7: If element not found
        System.out.println("Element not found");
    }
}
