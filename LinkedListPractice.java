package collections;

public class LinkedListPractice {


    private Node head;
    private Node tail;
    private int size = 0;

    public void addFirst(int val){
        if(size ==0){
            head = new Node(val);
            tail = head;
        }
        else{
            Node node = new Node(val);
            node.next = head;
            head = node;
        }

        size++;
    }

    public void addLast(int val){
        if(size == 0){
            head = new Node(val);
            tail = head;
        }
        else{
            Node node = new Node(val);
            tail.next = node;
            tail = node;
        }

        size++;
    }

    public void print(){
        Node node = head;
        for (int i =0; i< size; i++){
            System.out.print(node.val+"->");
            node = node.next;
        }
    }

    public void insert(int index, int val){

        Node temp = head;
        for (int i = 1; i < index; i++){
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;

    }

    private class Node {
        private int val;
        private Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        public Node() {
        }

        public Node(int val) {
            this.val = val;
        }
    }
}
