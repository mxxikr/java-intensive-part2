package gcObject.equalsOver;

public class MyTest {
    int a = 10;

    public int getA() {
        return a;
    }

    public boolean equals(MyTest rhs) {
        return this.a == rhs.a;
    }
}