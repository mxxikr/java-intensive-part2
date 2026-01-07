package inheritance.calledByFramework;

public class Test {
    protected int data;

    public void setData(int param) {
        System.out.println("Test.setData()");
        if(onSetData(param))
            this.data = param;
        else
            this.data = 0;
    }

    protected boolean onSetData(int param) {
        System.out.println("Test.onSetData()");
        return true;
    }

    public int getData() {
        return data;
    }
}
