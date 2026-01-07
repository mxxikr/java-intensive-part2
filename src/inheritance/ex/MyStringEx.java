package inheritance.ex;

public class MyStringEx extends MyString {
    @Override
    public String onSetString(String param) {
        if(param.compareTo("멍멍이아들") == 0)
            param = "우리귀요미";
        return param;
    }
}
