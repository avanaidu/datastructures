package collections;

public class MyLinkedList {

    //Node
    private Node head;
    private Node tail;

    private int size =0;

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.print("END");
    }

    public void insertFirst(int val){
        if(size == 0){
            head = new Node(val);
            tail = head;
            size++;
        }
        else {
            Node temp = head;
            head = new Node(val);
            head.next = temp;
            size++;
        }
    }

    public void insertLast(int val){
        if(size == 0){
            head = new Node(val);
            tail = head;
            size++;
        }
        else{
            Node node = new Node(val);
            tail.next = node;
            tail = node;
            size++;
        }
    }

    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
        }
        else if(index == size-1){
            insertLast(val);
        }
        else{
            Node temp = head;
            for(int i=1; i<index;i++){
                    temp= temp.next;
            }
            Node node = new Node(val, temp.next);
            temp.next = node;
            size++;
        }
    }

    public int deleteFirst(){
        int val = head.value;

        head = head.next;
        if(head ==null){
            tail =null;
        }

        size--;
        return val;
    }

    public int deleteLast(){
        Node temp = head;
        int val = tail.value;
        for (int i = 0; i<size-2; i++){
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
        size--;
        return val;

    }

    public Node get(int index){
        Node node = head;
        for (int i=0;i<index; i++){
            node =node.next;
        }
        return node;
    }
    public int delete(int index){
        int val = get(index).value;

        Node node = head;
        for(int i=0;i<index-1; i++){
            node = node.next;
        }
        node.next = node.next.next;
        //can use get(index-1).next.next
        size--;
        return val;
    }


    private class Node {
       private int value;
       private  Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    };

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                ", size=" + size +
                '}';
    }
}
