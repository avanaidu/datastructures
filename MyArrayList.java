package collections;

import java.util.Arrays;

public class MyArrayList {
    int default_size = 10;
    Object[] elements = new Object[default_size];
    private int size =0;

    //add
    public void add(Object object){
        elements[size] = object;
        size++;
        if(elements.length == size){
            Object[] elementsNew = new Object[default_size * 2];
            for (int i = 0; i< elementsNew.length; i++) {
                elementsNew[i] = elements[i];
            }
            elements = elementsNew;
        }
    }
    //get
    public Object get(int index){
        return elements[index];
    }

    //remove
    public void remove(int index){
        for (int i =index; i<size; i++){
            elements[i] = elements[i+1];
        }
        size--;
    }
    //size
    public  int size(){
        return size;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "default_size=" + default_size +
                ", elements=" + Arrays.toString(elements) +
                ", size=" + size +
                '}';
    }
}
