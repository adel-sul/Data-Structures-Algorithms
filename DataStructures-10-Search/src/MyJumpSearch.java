public class MyJumpSearch {
    /*
        Dividing array in equal blocks and implementing Linear search inside a block containing value.

        PERFORMANCE: O(sqrt n)
     */
    public static int jumpSearch(int [] myArr, int value) {
        // 1. Calculate block size
        int blockSize = (int) Math.sqrt(myArr.length);

        // 2. Set start point
        int start = 0;
        int next = blockSize;

        // 3. Jump Blocks
        while (start < myArr.length && myArr[next-1] < value) {
            start = next;
            next += blockSize;
            if (next > myArr.length) next = myArr.length; // condition to not go out of bounds for last block
        }

        // 4. Perform a Linear Search
        for (int i = start; i < next; i++) {
            if (myArr[i] == value) return i;
        }
        return -1;
    }
}
