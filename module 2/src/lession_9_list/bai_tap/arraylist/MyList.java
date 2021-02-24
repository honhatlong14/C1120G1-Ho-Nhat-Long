package lession_9_list.bai_tap.arraylist;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    public  Object elements[];

    public MyList(int capacity){
        if (capacity>=0){
            elements = new Object[capacity];
        }else {
            throw new IllegalArgumentException("Capacity: " + capacity);
        }

    }
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public void add(E e , int index){
        if (index > elements.length){
            throw new IndexOutOfBoundsException("index: "+ index);
        }else if (elements.length == size){
            this.ensureCapacity(5);
        }
        if (elements[index] == null){
            elements[index] = elements;
            size++;
        }else {
            for (int i = size +1; i>= index; i--){
                elements[i] = elements[i-1];
            }
            elements[index] = e;
            size++;
        }
    }
    public E remove(int index){
        if (index < 0 || index >elements.length){
            throw new IndexOutOfBoundsException("Error index: " + index);
        }else {
            E e = (E) elements[index];
            for (int i = index; i <size-1 ; i++){
                elements[i] = elements[i+1];
            }
            elements [size -1] = null;
            size--;
            return e;
        }
    }
    public int size()  {
        return this.size;
    }
    public MyList <E> clone(){
        MyList<E> v = new MyList<>();
        v.elements = Arrays.copyOf(elements, size);
        v.size = this.size;
        return v;
    }
    public boolean contains(E e){
        return this.indexOf(e)>=0;
    }
    public int indexOf(E e){
        int index =-1;
        for (int i =0; i<size;i++){
            if (this.elements[i].equals(e)){
                return i;
            }
        }
        return index;
    }
    public boolean add(E e){
        if (elements.length == size){
            this.ensureCapacity(5);
        }
        elements[size] = e;
        size++;
        return true;
    }

    public void ensureCapacity(int minCapacity){
        if (minCapacity >= 0){
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        }else {
            throw new IndexOutOfBoundsException("minCapacity: " + minCapacity);
        }
//        int newSize = elements.length * 2;
//        elements = Arrays.copyOf(elements, newSize);
    }
    public E get(int index){
        return ((E) elements[index]);
    }
    public void clear(){
        size = 0;
        for (int i = 0; i< elements.length; i++){
            elements[i] = null;
        }
    }


}
