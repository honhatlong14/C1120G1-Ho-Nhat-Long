package lession_9_list.thuc_hanh.trien_khai_lop_linkedlist_don_gian;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private Object[] elements;

    public MyList() {
        int DEFAULT_CAPACITY = 10;
        elements = new Object[DEFAULT_CAPACITY]; // tạo 1 mảng có kiểu là đối tượng.
    }

    private void ensureCaPa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize); // tạo ra 1 mảng mới.
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCaPa();
        }
        elements[size++] = e;
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size" + i); // 1 exception
        }
        return (E) elements[i]; // để ép kiểu.
    }
}
