package inheritance.constructorCallStack;

public class MyTest {
    private int parentData = 10;

    MyTest() {
        System.out.println("MyTest()");
    }
    public int getData() {
        return parentData;
    }

    public void printData() {
        System.out.println(parentData);
    }
}
