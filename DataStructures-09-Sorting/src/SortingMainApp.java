import java.util.Arrays;

public class SortingMainApp {
    public static void main(String[] args) {
        var myArr = new int [] {15, 6, 3, 1, 22, 10, -1, 13};
        var myBubbbleSort = new MyBubbleSort();
        System.out.println("----- BUBBLE SORT -----");
        System.out.println(Arrays.toString(myBubbbleSort.bubbleSort(myArr)));

        myArr = new int [] {15, 6, 3, 1, 22, 10, -1, 13};
        var mySelectionSort = new MySelectionSort();
        System.out.println("----- SELECTION SORT -----");
        System.out.println(Arrays.toString(mySelectionSort.selectionSort(myArr)));

        myArr = new int [] {15, 6, 3, 1, 22, 10, -1, 13};
        var myInsertionSort = new MyInsertionSort();
        System.out.println("----- INSERTION SORT -----");
        System.out.println(Arrays.toString(myInsertionSort.insertionSort(myArr)));

        myArr = new int [] {15, 6, 3, 1, 22, 10, -1, 13};
        var myMergeSort = new MyMergeSort();
        System.out.println("----- MERGE SORT -----");
        myMergeSort.mergeSort(myArr);
        System.out.println(Arrays.toString(myArr));

        myArr = new int [] {15, 6, 3, 1, 22, 10, -1, 13};
        var myQuickSort = new MyQuickSort();
        System.out.println("----- QUICK SORT -----");
        myQuickSort.quickSort(myArr);
        System.out.println(Arrays.toString(myArr));
    }
}
