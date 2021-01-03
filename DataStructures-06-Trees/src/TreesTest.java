public class TreesTest {
    public static void main(String[] args) {


        Tree myTree = new Tree();
        int[] myArr = {10, 6, 8, 20, 4, 9, 5, 17, 42, 47, 29};

        for (int i = 0; i < myArr.length; i++) {
            myTree.insert(myArr[i]);
        }

        System.out.println("PreOrder Traverse Tree");
        myTree.traversePreOrder();
        System.out.println("\n");
        System.out.println("InOrder Traverse Tree");
        myTree.traverseInOrder();
        System.out.println("\n");
        System.out.println("PostOrder Traverse Tree");
        myTree.traversePostOrder();

    }
}
