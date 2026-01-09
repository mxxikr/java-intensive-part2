package throwsSample3;

public class Main {
    static void checkedTest() throws MyException {
        int input = 110;
        if(input < 0 || input > 100)
            throw new MyException("MyException");
    }

    static void caller() throws MyException {
        checkedTest();
    }

    public static void main(String[] args) {
        try {
            caller();
        } catch (MyException e) {
            System.out.println(e.getMsg());
        }
    }
}
