package class2.staticField;

public class MyTest {
    private int data;
    public void setData(int param) { this.data = param; }
    public int getData() { return this.data; }

    public static void printData(MyTest obj) {
        System.out.println(obj.data);
    }
}
