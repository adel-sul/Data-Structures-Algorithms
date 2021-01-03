public class HeapTest {
    public static void main(String[] args) {
        MyHeap myHeap = new MyHeap();
        myHeap.insert(22);
        myHeap.insert(32);
        myHeap.insert(91);
        myHeap.insert(2);
        myHeap.insert(100);
        myHeap.insert(101);
        myHeap.insert(600);
        myHeap.insert(3);
        myHeap.insert(1);
        myHeap.print();
    }
}
