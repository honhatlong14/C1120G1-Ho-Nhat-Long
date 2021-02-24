package lession_11_java_collection_framework.bai_tap.luyentaparraylistlinkedlist;

import java.util.Comparator;

public class SapXepTang implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o1.getGia() - o2.getGia());
    }
}
