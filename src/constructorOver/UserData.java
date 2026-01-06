package constructorOver;

public class UserData {
    private String name;
    private int age;

    UserData() {
        System.out.println("UserData()");
    }

    UserData(String name, int age) {
        this();
        System.out.println("UserData(String, int)");
        this.name = name;
        this.age = age;
    }
}