public class MyTernarySearch {
    /*
        Similar to Binary search, instead of two parts Ternary search divides into 3 parts

        PERFORMANCE: O(log3 n)
     */
    public static int ternarySearch(int [] myArr, int value) {
        return ternarySearch(myArr, value, 0, myArr.length - 1);
    }

    public static int ternarySearch(int [] myArr, int value, int left, int right) {
        if (right < left) return -1; // termination condition
        int partition = (right-left)/3;
        int mid1 = left+partition;
        int mid2 = right-partition;

        if (myArr[mid1] == value) return mid1;
        if (myArr[mid2] == value) return mid2;

        // searching for partition containing the value
        if (value < myArr[mid1]) return ternarySearch(myArr, value, left, mid1-1); // left partition
        else if (value < myArr[mid2]) return ternarySearch(myArr, value, mid1+1, mid2-1); // mid partition
        else return ternarySearch(myArr, value, mid2+1, right); // right partition

    }
}
