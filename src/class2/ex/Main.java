package class2.ex;

public class Main {
    public static void main(String[] args) {
        MyString str1 = new MyString("Test");
        System.out.println(str1.getString());
        MyString str2 = new MyString(512);
        System.out.println(str2.getString());
    }
}
