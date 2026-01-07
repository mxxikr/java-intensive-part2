package class1.staticField2;

public class Main {
    public static void main(String[] args) {
        MyScore s1 = new MyScore();
        MyScore s2 = new MyScore();
        System.out.println(s2.getLimit());
        System.out.println(s1.getLimit());

        s1.setLimit(90);
        System.out.println(s2.getLimit());
        System.out.println(s1.getLimit());
    }
}
