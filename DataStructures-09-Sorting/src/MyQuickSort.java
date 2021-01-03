public class MyQuickSort {
    /*
        1. Select a pivot (first element, last, median or random)
        2. Arrange all larger elements on the right, smaller on the left. (Partitioning)
        3. Perform the same steps for the partitions.

        PERFORMANCE: Best case - O(n log n). Worst case - O(n2)
     */
    public void quickSort(int[] myArr) {
        sort(myArr, 0, myArr.length - 1);
    }

    private void sort(int[] array, int start, int end) {
        if (start >= end) return; // termination condition (1 element arrays)

        var boundary = partition(array, start, end);

        sort(array, start, boundary - 1);
        sort(array, boundary + 1, end);
    }

    private int partition(int[] myArr, int start, int end) {
        // arranging larger elements on the right, smaller on the left
        var pivot = myArr[end];
        var boundary = start;
        for (int i = start; i <= end; i++) {
            if (myArr[i] <= pivot)
                swap(myArr, i, boundary++);
        }
        return boundary-1;
    }

    private void swap(int[] myArr, int ind1, int ind2) {
        var temp = myArr[ind1];
        myArr[ind1] = myArr[ind2];
        myArr[ind2] = temp;
    }
}
