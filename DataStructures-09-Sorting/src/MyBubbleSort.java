public class MyBubbleSort {
    /*
        Simplest of all sorting algorithms (comparing neighbors)
        1. Start from the beginning and compare Nth and Nth+1 element.
        2. If  Nth is greater swap them
        3. Continue first two steps array.length times

        In every iteration Nth+1 largest element bubbles up to its order.
        PERFORMANCE: Best case - O(n). Worst case - O(n2)
     */
    public static int[] bubbleSort(int[] myArr) {
        for (int i = 0; i < myArr.length; i++) {
            // 'no swap' check.
            boolean swapped = false;
            // since largest item is bubbled up to the end after each iteration, we don't need to use it for comparison
            for (int j = 0; j < myArr.length-1-i; j++) {
                if(myArr[j]>myArr[j+1]) {
                    swap(myArr, j, j+1);
                    swapped = true;
                }
            }
            // if 'no swap' in inner loop, array is sorted already
            if(!swapped) return myArr;
        }
        return myArr;
    }

    private static void swap(int[] myArr, int ind1, int ind2) {
        int temp = myArr[ind1];
        myArr[ind1] = myArr[ind2];
        myArr[ind2] = temp;
    }
}
