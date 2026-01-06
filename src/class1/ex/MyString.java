package class1.ex;


public class MyString {
    private byte[] string;

    public String getString() {
        if (string == null || string.length <= 0) {
            return "(null)";
        }

        return new String(string);
    }

    public void setString(String param) {
        this.string = param.getBytes().clone();
    }

    public int length() {
        if(string == null) {
            return 0;
        }
        return this.string.length;
    }

    public int compareTo(String param) {
        if(string == null) {
            return -1;
        }
        return param.compareTo(new String(string));
    }
}
