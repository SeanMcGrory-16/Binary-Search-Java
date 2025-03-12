public class BinarySearch {

    // Iterative Binary Search
    public static int binarySearchIterative(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1; // Target not found
    }

    // Recursive Binary Search
    public static int binarySearchRecursive(int[] arr, int left, int right, int target) {
        if (left > right)
            return -1; // Target not found

        int mid = left + (right - left) / 2;

        if (arr[mid] == target)
            return mid;
        else if (arr[mid] < target)
            return binarySearchRecursive(arr, mid + 1, right, target);
        else
            return binarySearchRecursive(arr, left, mid - 1, target);
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 15, 18, 21};
        int target = 9;

        // Iterative Search
        int iterativeResult = binarySearchIterative(sortedArray, target);
        System.out.println("Iterative Binary Search: Target found at index " + iterativeResult);

        // Recursive Search
        int recursiveResult = binarySearchRecursive(sortedArray, 0, sortedArray.length - 1, target);
        System.out.println("Recursive Binary Search: Target found at index " + recursiveResult);
    }
}
