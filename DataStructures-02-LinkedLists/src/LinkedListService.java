import java.util.NoSuchElementException;

public class LinkedListService {

    // TODO: Reverse the nodes of a singly linked list in one pass
    public static MyLinkedList reverse(MyLinkedList list) {
        if (list.isEmpty()) { throw new NoSuchElementException("LINKED LIST IS EMPTY"); }
        if (list.first == list.last){ return list; }
        else {
            var previous = list.first;
            var current = list.first.next;
            while (current != null) {
                var temp = current.next;
                current.next = previous;
                previous = current;
                current = temp;
            }
            list.last = list.first;
            list.last.next = null;
            list.first = previous;
        }
        return list;
    }

    // TODO: Find the Nth node from the end in one pass
    public static MyLinkedList.Node getNthFromBack(MyLinkedList list, int position) {
        if (list.isEmpty() || position > list.size()) { throw new NoSuchElementException("LINKED LIST IS EMPTY OR POSITION IS GREATER THAN SIZE OF THE LIST"); }
        var a = list.first;
        var b = list.first;
        for (int i = 1; i < position; i++) {
            b = b.next;
        }
        while (b.next != null) {
            a = a.next;
            b = b.next;
        }
        return a;
    }

    // TODO: Find the middle of a linked list in one pass
    public static void middleNode(MyLinkedList list) {
        if (list.isEmpty()) { throw new NoSuchElementException("LINKED LIST IS EMPTY"); }
        var a = list.first;
        var b = list.first;
        while (b.next != null && b.next.next != null) {
            a = a.next;
            b = b.next.next;
        }
        if (b.next == null) {
            System.out.println("MIDDLE NODE IS : " + a.value);
        } else {
            System.out.println("MIDDLE NODES ARE : " + a.value + " AND " + a.next.value);
        }
    }

    // TODO: Check singly linked list if it is a Palindrome

    // TODO: Sort the singly linked list in descending order
}

