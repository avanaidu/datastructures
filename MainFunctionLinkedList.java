package collections;

public class MainFunctionLinkedList {

    public static void main(String[] args) {
        LinkedListPractice linkedListPractice = new LinkedListPractice();
        linkedListPractice.addFirst(1);
        linkedListPractice.addLast(2);

        linkedListPractice.addFirst(3);
        linkedListPractice.addFirst(5);

        linkedListPractice.insert(2, 7);
        linkedListPractice.print();
    }
}
