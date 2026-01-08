package innerClassAndAnonymous.innerClass;

public class Main {
    public static void main(String[] args) {
        UserData user = new UserData("Hosung", "Seoul", "010-1111-111");
        System.out.println(user.getInfo().getUserInfo());
        UserData.Address addr = user.new Address("Hanam", "010-2222-2222");
        System.out.println(addr.getUserInfo());
    }
}
