package immutableObject.immutable;

class MyInt {
    private final int data;

    public MyInt(int param) {
        data = param;
    }

    public int getData() {
        return data;
    }

    public MyInt widthInt(int param) {
        return new MyInt(this.data + param);
    }
}
