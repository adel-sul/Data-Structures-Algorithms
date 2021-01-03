public class MyLinearSearch {
    /*
        Linear Search (Sequential)
        Unordered or order not known
        Scan complete array and see if element is there.

        PERFORMANCE: Best case - O(1). Worst case - O(n)
     */
    public static int linearSearch(int [] myArr, int value) {
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] == value) return i;
        }
        return -1;
    }
}
