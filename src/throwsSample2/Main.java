package throwsSample2;

public class Main {
    static void checkedTest() throws MyException {
        int input = 110;
        if(input < 0 || input > 100)
            throw new MyException("MyException");
    }

    public static void main(String[] args) {
        try {
            checkedTest();
        } catch (MyException e) {
            System.out.println(e.getMsg());
        }
    }
}
