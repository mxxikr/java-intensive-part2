package class1.inheritance.superSample;

public class TestEx extends Test {
    public TestEx() {
        System.out.println("TestEx()");
    }

    public TestEx(int param) {
        super(param);
        System.out.println("TestEx(int)");
    }
}