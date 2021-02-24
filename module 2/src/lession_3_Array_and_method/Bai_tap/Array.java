package lession_3_Array_and_method.Bai_tap;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int b[]=new int[a.length];
        int j=0;
        for (int i=a.length-1;i>=0;i--){
            b[j]=a[i];
            j++;
        }
        System.out.println(Arrays.toString(b));//phương thức Arrays của lớp toString là dùng để in mảng.

    }
//public static void main(String[] args) {
//    int a[]={1,2,3,4};
//    for (int i=0;i<a.length;i++){
//        int temp=a[i];
//        a[i]=a[a.length-1-i];
//        a[a.length-1-i]=temp;
//    }
//    System.out.println(Arrays.toString(a));
//}
}
