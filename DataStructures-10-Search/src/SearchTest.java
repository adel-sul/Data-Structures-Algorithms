public class SearchTest {

    public static void main(String[] args) {

        int[] myArr = new int[] {1, 2, 3, 4, 5, 6, 89, 100, 110, 111, 112};

        var myLinearSearch = new MyLinearSearch();
        System.out.println("Linear Search : " + myLinearSearch.linearSearch(myArr,100));

        var myBinarySearch = new MyBinarySearch();
        System.out.println("Binary Search : " + myBinarySearch.binarySearchRecursive(myArr,100));
        System.out.println("Binary Search Non Recursive: " + myBinarySearch.binarySearchNonRec(myArr,100));

        var myTernarySearch = new MyTernarySearch();
        System.out.println("Ternary Search : " + myTernarySearch.ternarySearch(myArr,100));

        var myJumpSearch = new MyJumpSearch();
        System.out.println("Ternary Search : " + myJumpSearch.jumpSearch(myArr,100));

    }
}
