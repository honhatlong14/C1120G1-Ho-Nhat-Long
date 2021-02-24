package lession_10_stack_queue.bai_tap.demerging;

import java.util.Comparator;

public class ComparatorByAge implements Comparator<MyQueue.Nhansu> {

    @Override
    public int compare(MyQueue.Nhansu o1, MyQueue.Nhansu o2) {
        return o1.getAge()-o2.getAge();
    }
}
