public class LinkedListTest {

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();
        for (int i = 1; i <= 10; i++) {
            list.addLast(i);
        }
        System.out.println("############# ORIGINAL LIST ############");
        list.print();

        System.out.println("############# REVERSED LIST ############");
        LinkedListService.reverse(list);
        list.print();

        int position = 4;
        System.out.println("############# "+position+" ELEMENT FROM THE BACK ############");
        System.out.println(LinkedListService.getNthFromBack(list, position).value);

        System.out.println("############# MIDDLE NODE ############");
        LinkedListService.middleNode(list);

    }
}
