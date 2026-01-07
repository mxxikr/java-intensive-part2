package inheritance.overrideSample;

public class Test {
    protected int data;

    public void setData(int param) {
        System.out.println("Test.setData()");
        this.data = param;
    }

    public int getData() {
        return data;
    }
}
