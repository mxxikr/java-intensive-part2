package class1.this1;

public class Main {
    public static void main(String[] args) {
        MyTest t1 = new MyTest(5);
        MyTest t2 = new MyTest(10);

        System.out.println(t1.data);
        System.out.println(t2.data);
        t1.printData();
    }
}
