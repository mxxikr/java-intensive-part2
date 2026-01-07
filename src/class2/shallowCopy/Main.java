package class2.shallowCopy;

import class2.User;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Hosung", "Hanam", "010-1111-1111");
        User user2 = new User("Hoon", "Seoul", "010-2222-2222");

        System.out.println("--- 복사 전 user1 ---");
        System.out.println(user1.getName());
        System.out.println(user1.getAddress().address);
        System.out.println(user1.getAddress().phone);
        System.out.println();

        System.out.println("얕은 복사");
        user1.copy(user2);
        System.out.println();

        // user2 객체의 주소 정보를 변경
        System.out.println("--- user2의 주소와 전화번호 변경 ---");
        user2.getAddress().phone = "010-3333-3333";
        user2.getAddress().address = "Busan";
        System.out.println("user2 주소: " + user2.getAddress().address);
        System.out.println("user2 번호: " + user2.getAddress().phone);
        System.out.println();

        System.out.println("--- 변경 후 user1 ---");
        System.out.println(user1.getName());
        System.out.println(user1.getAddress().address);
        System.out.println(user1.getAddress().phone);
    }
}