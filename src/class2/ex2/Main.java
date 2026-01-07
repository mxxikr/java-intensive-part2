package class2.ex2;

public class Main {
    public static void main(String[] args) {
        MyString src = new MyString("Hello");
        MyString dst = new MyString(src);
        System.out.println(src.getString());
        System.out.println(dst.getString());

        src.setString("World");
        System.out.println(src.getString());
        System.out.println(dst.getString());
    }
}
