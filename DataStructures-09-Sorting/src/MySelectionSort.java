public class MySelectionSort {
    /*
        Sorts an array by repeatedly finding the minimum element (for ascending order)
        from unsorted part and putting it at the beginning.
        The algorithm maintains two parts in a given array.
        1. The part which is sorted
        2. Remaining part which is unsorted

        In every iteration, the minimum from the unsorted part is moved to the sorted part.
        PERFORMANCE: Best case - O(n2). Worst case - O(n2)
     */
    public static int[] selectionSort(int[] myArr) {

        for (int i = 0; i < myArr.length; i++) {
            // minimum index assigned to current item
            int minIndex = i;
            for (int j = i+1; j < myArr.length; j++) {
                // finding the index of smallest item in current iteration
                if(myArr[j]<myArr[minIndex]) minIndex = j;
            }
            // swapping current item with smallest from unsorted group
            if (i != minIndex) swap(myArr, i, minIndex);
        }
        return myArr;
    }

    private static void swap(int[] myArr, int ind1, int ind2) {
        int temp = myArr[ind1];
        myArr[ind1] = myArr[ind2];
        myArr[ind2] = temp;
    }
}
