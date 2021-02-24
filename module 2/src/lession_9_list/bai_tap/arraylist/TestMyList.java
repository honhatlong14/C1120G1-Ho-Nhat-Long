package lession_9_list.bai_tap.arraylist;

public class TestMyList {
    private int id;
    private String name;

    public TestMyList(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        TestMyList a =new TestMyList(1,"long");
        TestMyList b =new TestMyList(3,"long2");
        TestMyList c =new TestMyList(5,"long3");
        TestMyList d =new TestMyList(2,"long4");
        TestMyList e =new TestMyList(4,"long5");
        TestMyList f =new TestMyList(6,"long6");

        MyList<TestMyList> testMyListMyList = new MyList<>();
        MyList<TestMyList> newestMyListMyList = new MyList<>();

        testMyListMyList.add(a);
        testMyListMyList.add(b);
        testMyListMyList.add(c);
        testMyListMyList.add(d);
        testMyListMyList.add(e);
        testMyListMyList.add(f,2);
//        System.out.println(testMyListMyList.get(2).getName());
//        System.out.println(testMyListMyList.indexOf(c));
//        System.out.println(testMyListMyList.contains(f));
        newestMyListMyList = testMyListMyList.clone();
        TestMyList testMyList = newestMyListMyList.remove(1) ;
        System.out.println( testMyList.getName());
        for (int i = 0; i<newestMyListMyList.size(); i++){
            System.out.println(newestMyListMyList.get(i).getName());
        }

//        for (int i = 0; i<testMyListMyList.size(); i++){
//            TestMyList testMyList =(TestMyList) testMyListMyList.elements[i];
//            System.out.println(testMyList.getId());
//            System.out.println(testMyList.getName());
//        }
    }
}
