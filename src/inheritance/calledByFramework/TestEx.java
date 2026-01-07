package inheritance.calledByFramework;

public class TestEx extends Test {
    //Called by framework
    protected boolean onSetData(int param) {
        System.out.println("TestEx.onSetData()");
        if(param > 100 || param < 0)
            return false;
        return true;
    }
}