package throwsSample;

public class Main {
    static void checkedTest() throws MyException {
        int input = 110;
        if(input < 0 || input > 100)
            throw new MyException("MyException");
    }

    public static void main(String[] args) {
//        checkedTest(); // 오류 발생
    }
}
