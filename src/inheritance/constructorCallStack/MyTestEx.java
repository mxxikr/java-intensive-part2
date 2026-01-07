package inheritance.constructorCallStack;

public class MyTestEx extends MyTest {
    private int childData = 20;

    MyTestEx() {
        System.out.println("MyTestEx()");
    }
    public int getChildData() {
        return childData;
    }
}