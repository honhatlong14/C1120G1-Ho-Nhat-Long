package lession_11_java_collection_framework.bai_tap.luyentaparraylistlinkedlist;

import java.util.Comparator;

public class SapXepgiam implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return (int)(o2.getGia() - o1.getGia());
    }
}
