package class2.ex;

public class MyString {
    private byte[] string;

    MyString() {
    }

    MyString(String param) {
        this.setString(param);
    }

    MyString(int param) {
        String tmp  = String.format("%d", param);
//        this.setString(tmp);
        string = tmp.getBytes();
    }

    public String getString() {
        if (string == null || string.length <= 0) {
            return "(null)";
        }

        return new String(string);
    }

    public void setString(String param) {
        this.string = param.getBytes().clone();
    }
}