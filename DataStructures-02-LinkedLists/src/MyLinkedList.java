import java.util.NoSuchElementException;

public class MyLinkedList {

    public class Node {

        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public Node first;
    public Node last;
    public int size;

    public MyLinkedList() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() { return size; }

    public void print() {
        if (isEmpty()) { throw new NoSuchElementException("LINKED LIST IS EMPTY"); }

        var current = first;
        while (current != null) {
            System.out.println("VALUE : " + current.value);
            current = current.next;
        }
    }

    public void addFirst(int value) {
        System.out.println("ADDING "+value+" TO THE BEGINNING OF THE LINKED LIST");
        var node = new Node(value);
        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
        size++;
    }

    public void addInOrder(int value) {
        System.out.println("ADDING "+value);
        var node = new Node(value);
        if (isEmpty()) {
            first = last = node;
        } else if (value <= first.value){
            node.next = first;
            first = node;
        } else {
            var current = first;
            while ((current != last) && (value > current.next.value)) {
                current = current.next;
            }
            if (current.next == null) {
                current.next = node;
                last = node;
            } else {
                node.next = current.next;
                current.next = node;
            }
        }
        size++;
    }

    public void addLast(int value) {
        System.out.println("ADDING "+value+" TO THE END OF THE LINKED LIST");
        var node = new Node(value);
        if (isEmpty()) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public int indexOf(int value) {
        int index = -1;
        if (isEmpty()) { throw new NoSuchElementException("LINKED LIST IS EMPTY"); }
        var current = first;
        while (current != null) {
            index++;
            if (current.value==value) {
                return index;
            }
            current = current.next;
        }
        return -1;
    }

    public boolean contains(int value) {
        if (isEmpty()) { throw new NoSuchElementException("LINKED LIST IS EMPTY"); }
        var current = first;
        while (current != null) {
            if (current.value==value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void removeFirst() {
        if (isEmpty()) { throw new NoSuchElementException("LINKED LIST IS EMPTY"); }
        System.out.println("DELETING FIRST ITEM : " + first.value);
        if (first==last) {
            first = last = null;
        } else {
            first = first.next;
        }
        size --;
    }

    public void removeLast() {
        if (isEmpty()) { throw new NoSuchElementException("LINKED LIST IS EMPTY"); }
        System.out.println("DELETING LAST ITEM : " + last.value);
        if (first==last) {
            first = last = null;
        } else {
            var previous = first;
            var current = first.next;
            while (current.next != null) {
                previous = current;
                current = current.next;
            }
            previous.next = null;
            last = previous;
        }
        size --;
    }

    public Node getPrevious (Node node) {
        if (isEmpty()) { throw new NoSuchElementException("LINKED LIST IS EMPTY"); }
        if (first==last) return null;
        var previous = first;
        while (previous.next!=null) {
            if (previous.next==node) {
                return previous;
            }
            previous = previous.next;
        }
        throw new NoSuchElementException("NODE IS NOT FOUND IN LINKED LIST");
    }

    public int[] toArray() {
        int[] myArr = new int[size];
        if (isEmpty()) {
            throw new NoSuchElementException("LINKED LIST IS EMPTY");
        }
        var current = first;
        int index = 0;
        while (current != null) {
            myArr[index++] = current.value;
            current = current.next;
        }

        return myArr;
    }
}
