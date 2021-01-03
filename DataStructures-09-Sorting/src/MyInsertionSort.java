public class MyInsertionSort {
    /*
        Shortest of all sorting algorithms
        The array is virtually split into a sorted and an unsorted part.
        Values from the unsorted part are picked and inserted into the correct position in the sorted part.

        PERFORMANCE: Best case - O(n). Worst case - O(n2)
     */
    public static int[] insertionSort(int[] myArr) {
        // starting from second item because making insertions and first item starting as 'sorted' part
        for (int i = 1; i < myArr.length; i++) {
            int current = myArr[i];
            // index of last item in the sorted part
            int j = i-1;
            while (j>=0 && myArr[j] > current) {
                // shifting operation
                myArr[j+1] = myArr[j];
                j--;
            }
            myArr[j+1] = current;
        }
        return myArr;
    }
}
