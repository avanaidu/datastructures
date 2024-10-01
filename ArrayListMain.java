package collections;

import java.util.LinkedList;

public class ArrayListMain {
    public static void main(String[] args) {
        MyArrayList list =new MyArrayList();
        list.add("naidu");
        list.add("avu");

        list.remove(1);

        System.out.println(list);

        LinkedList<String> strings = new LinkedList<>();
        strings.add("naidu");
        strings.add("avu");
        strings.add("hyderabd");
        strings.add("kukat");
        
    }
}
