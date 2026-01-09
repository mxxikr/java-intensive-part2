
package linkedListEx4;

public class Main {
    public static void main(String[] args) {
        MyListEx db = new MyListEx(new UserData("Dummy", "Dummy"));
        UserInterface ui = new UserInterface(db);
        ui.run();
    }
}