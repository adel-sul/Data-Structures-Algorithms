import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {

        int[][] arr = new int[4][4];
        int val = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = val++;
            }
        }
        System.out.println("----- ROTATE 2D ARRAY -----");
        ArrayService.printArray(ArrayService.rotateSameArray(arr));

        int[] arr2 = {1, 2, 3, 4, 5, 6};
        System.out.println("----- REVERSE AN ARRAY -----");
        System.out.println(Arrays.toString(ArrayService.reverseIntArray(arr2)));
    }
}
