package inheritance.overrideSample;

public class Main {
    public static void main(String[] args) {
        Test t1 = new TestEx();
        TestEx t2 = new TestEx();

        t1.setData(5);
        t2.setData(5);
    }
}
