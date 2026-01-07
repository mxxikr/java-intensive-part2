package inheritance.ex;

public class MyString {
    private byte[] string;
    private static int count;

    protected MyString() {
    }

    private MyString(String param) {
        this.setString(param);
    }

    private MyString(int param) {
        String tmp  = String.format("%d", param);
//        this.setString(tmp);
        string = tmp.getBytes();
    }

    public MyString(MyString rhs) {
        count++;
        this.deepCopy(rhs);
    }

    public static MyString newString(int param) {
        count++;
        return new MyString(param);
    }

    public static MyString newString(String param) {
        count++;
        if (param == null  || param.length() <= 0) {
            return new MyString("(null)");
        }
        return new MyString(param);
    }

    public static int getCount() {
        return MyString.count;
    }

    public String getString() {
        if (string == null || string.length <= 0) {
            return "(null)";
        }

        return new String(string);
    }

    public void setString(String param) {
        String result = onSetString(param);
        string = result.getBytes().clone();
    }

    public String onSetString(String param) {
        return param;
    }

    public void deepCopy(MyString rhs) {
        this.string = rhs.string.clone();
    }
}