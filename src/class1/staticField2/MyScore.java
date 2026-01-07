package class1.staticField2;

public class MyScore {
    private static int limit = 80;

    public void setLimit(int limit) {
        MyScore.limit = limit;
    }

    public int getLimit() {
        return limit;
    }
}
