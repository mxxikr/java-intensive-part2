package class1;

public class Main {
    public static void main(String[] args) {
        MyFirstClass myClass = new MyFirstClass();

        System.out.println(myClass.getClass());
        System.out.println(myClass.getData());
        //myClass.data = 10;
        myClass.setData(10);
        System.out.println(myClass.getData());
    }
}