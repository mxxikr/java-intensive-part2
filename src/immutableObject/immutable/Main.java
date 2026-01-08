package immutableObject.immutable;

public class Main {
    public static void main(String[] args) {
        MyInt d1 = new MyInt(5);
        MyInt d2 = new MyInt(d1.getData());
        MyInt d3 = d2.widthInt(5);

        System.out.println(d1.getData());
        System.out.println(d2.getData());
        System.out.println(d3.getData());
    }
}