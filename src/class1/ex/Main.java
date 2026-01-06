package class1.ex;

public class Main {
    public static void main(String[] args) {
        MyString str = new MyString();

        System.out.println(str.length());
        System.out.println(str.getString());

        str.setString("Hello Java");

        System.out.println(str.getString());
        System.out.println(str.length());
        System.out.println(str.compareTo("Hello Java"));
    }
}
