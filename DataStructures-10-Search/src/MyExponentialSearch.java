public class MyExponentialSearch {
    /*
        Start with a small range, if value not found, double the size of a range.
        When range found, implement Binary search.

        PERFORMANCE: O(log n)
     */
    public static int exponentialSearch(int [] myArr, int value) {
        // 1. Start with 1 item range
        int bound = 1;
        // 2. Double range size until item is inside or end reached
        while (bound < myArr.length && myArr[bound] < value) { bound *=2; } // double
        // 3. Implement Binary Search for the range
        int left = bound/2; // to exclude previous range
        int right = Math.min(bound, myArr.length-1); // if bound is greater than array length
        return MyBinarySearch.binarySearchRecursive(myArr, value, left, right);

    }
}
