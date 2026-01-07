package class2.ex2;

public class MyString {
    private byte[] string;

    MyString() {
    }

    MyString(MyString rhs) {
        this.deepCopy(rhs);
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

    public void deepCopy(MyString rhs) {
        this.string = rhs.string.clone();
    }
}