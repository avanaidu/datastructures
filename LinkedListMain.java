package collections;

public class LinkedListMain {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);

        list.insertLast(6);
        list.insertLast(7);

        list.insert(5, 1);

        list.display();
        System.out.println(list.delete(2));
        list.display();
    }
}
