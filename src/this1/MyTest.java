package this1;

public class MyTest {
    public int data;

    MyTest(int param) {
        this.data = param;
    }

    void printData() {
        int data = 3;
        System.out.println(this.data + data);
    }
}
