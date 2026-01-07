package class1.ex2;

public class Main {
    public static void main(String[] args) {
        //MyString src = new MyString("Hello");
        MyString s1 = MyString.newString(10);
        MyString s2 = MyString.newString("Test");
        MyString s3 = new MyString(s1);
        System.out.println(s1.getString());
        System.out.println(s2.getString());
        System.out.println(MyString.getCount());
    }
}
