public class ArrayService {

    // TODO: Reverse order of an array of unordered integers
    static int[] reverseIntArray(int[] arr) {

        if (arr == null || arr.length == 0) {
            System.out.println("INVALID ARRAY SIZE OR ARRAY IS NULL");
        } else {
            for (int i = 0, j = arr.length-1; i < arr.length/2; i++, j--) {
                arr[i] ^= arr[j];
                arr[j] ^= arr[i];
                arr[i] ^= arr[j];
            }
        }
        return arr;
    }

    // TODO: Rotate a 2-dimensional array using new array
    static int[][] rotateNewArray(int[][] arr) {

        if (arr.length == 0 || arr.length != arr[0].length) {
            System.out.println("ARRAY NEEDS TO BE NOT EMPTY AND N x N size");
            return arr;
        }
        int dimension = arr.length;
        int[][] newArray = new int[dimension][dimension];
        for (int row = 0; row < dimension; row++) {
            int step = 0;
            for (int column = dimension - 1; column >= 0; column --) {
                newArray[row][step++] = arr[column][row];
            }
        }
        return newArray;
    }

    // TODO: Rotate same 2-dimensional array
    static int[][] rotateSameArray(int[][] arr) {

        if (arr.length == 0 || arr.length != arr[0].length) {
            System.out.println("ARRAY NEEDS TO BE NOT EMPTY AND N x N size");
            return arr;
        }
        int n = arr.length;
        for (int layer = 0, first = 0, last = n-1; layer < n/2; layer++, first++, last--) {
            int positionX = first;
            int positionY = last;
            while (positionY > first) {
                int temp                = arr[positionY][first];
                arr[positionY][first]   = arr[last][positionY];
                arr[last][positionY]    = arr[positionX][last];
                arr[positionX][last]    = arr[first][positionX];
                arr[first][positionX]   = temp;
                positionY--;
                positionX++;
            }
        }
        return arr;
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
