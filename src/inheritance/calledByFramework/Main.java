package inheritance.calledByFramework;

public class Main {
    public static void main(String[] args) {
        TestEx t = new TestEx();
        t.setData(-5);
        System.out.println(t.getData());
    }
}