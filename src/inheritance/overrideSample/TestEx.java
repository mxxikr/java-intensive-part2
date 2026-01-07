package inheritance.overrideSample;

public class TestEx extends Test {
    public void setData(int param) {
        System.out.println("TestEx.setDataEx()");
        if(param < 0)
            param = 0;
        super.setData(param);
    }
}