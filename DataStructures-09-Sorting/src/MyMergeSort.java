import java.util.Arrays;

public class MyMergeSort {
    /*
        Divide and Conquer Paradigm.
        1. Divide: This involves dividing the problem into some sub problem.
        2. Conquer: Solve sub problems.
        3. Combine: Combine the sub-solutions to get the final solution.

        We continue to break down the list until we get sub lists with one element.
        Sort sub lists and merge them to produce sorted sublist/list.
        PERFORMANCE: Best case - O(n). Worst case - O(n)
     */
    public void mergeSort(int[] myArr) {
        // termination criteria
        if(myArr.length < 2) return;

        // dividing array into left and right sub arrays
        int mid = myArr.length/2;
        int[] leftArray = Arrays.copyOfRange(myArr, 0, mid);
        int[] rightArray = Arrays.copyOfRange(myArr, mid, myArr.length);

        mergeSort(leftArray); // call merge sort recursively for left sub-array
        mergeSort(rightArray); // call merge sort recursively for right sub-array
        merge(leftArray, rightArray, myArr); // merge solutions
    }

    private void merge(int[] left, int[] right, int[] result) {
        int i = 0, j=0, k=0;
        while (i < left.length && j < right.length) {
            if(left[i] <= right[j]) result[k++] = left[i++];
            else result[k++] = right[j++];
        }
        while (i < left.length) result[k++] = left[i++];
        while (j < right.length) result[k++] = right[j++];
    }
}
