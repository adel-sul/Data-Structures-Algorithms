public class MyBinarySearch {
    /*
        Binary Search (Iterative or Recursive)

        PERFORMANCE: O(log2 n)
     */
    public static int binarySearchRecursive(int [] myArr, int value) {
        return binarySearchRecursive(myArr, value, 0, myArr.length - 1);
    }

    public static int binarySearchRecursive(int [] myArr, int value, int left, int right) {
        if (right < left) return -1; // termination condition
        int mid = (left+right)/2;
        if (myArr[mid] == value) return mid;
        // if not found, checking if it's in the right part or left
        if (value < myArr[mid]) {
            return binarySearchRecursive(myArr, value, left, mid-1);
        } else {
            return binarySearchRecursive(myArr, value, mid+1, right);
        }
    }

    public static int binarySearchNonRec(int [] myArr, int value) {
        int left = 0;
        int right = myArr.length-1;
        while (left <= right) {
            int mid = (left+right)/2;
            if (myArr[mid] == value) return mid;
            if (value < myArr[mid]) right = --mid;
            else left = ++mid;
        }
        return -1;
    }
}
