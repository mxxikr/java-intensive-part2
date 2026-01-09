package throwsSample2;

public class MyException extends Exception {
    MyException(String param) {
        msg = param;
    }
    private String msg;
    public String getMsg() {
        return msg;
    }
}