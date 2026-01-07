package class2;

public class User {
    private String name;       // 사용자 이름
    private Address address;   // 사용자의 주소 정보 (Address 객체)

    /**
     * 이름, 주소, 전화번호를 받아 User 객체를 생성
     * 내부적으로 new Address()를 호출하여 새로운 Address 객체를 생성하고, 그 참조를 address 변수에 저장
     */
    public User(String name, String address, String phone) {
        this.name = name;
        this.address = new Address(address, phone);
    }

    /**
     * User 객체가 가지고 있는 Address 객체의 참조를 반환
     */
    public Address getAddress() {
        return address;
    }

    /**
     * 사용자 이름을 반환
     */
    public String getName() {
        return name;
    }

    /**
     * 다른 User 객체(rhs)의 내용을 현재 객체로 복사
     * 얕은 복사(shallow copy)
     */
    public void copy(User rhs) {
        this.name = rhs.name;

        // 얕은 복사
        // rhs.address가 가리키는 Address 객체의 메모리 주소(참조)만 복사합
        // 이 객체(this)의 address와 rhs.address는 동일한 Address 객체를 가리키게 됨
        // 원본이나 복사본 중 하나의 주소를 변경하면 다른 하나도 함께 변경됨
        this.address = rhs.address;
    }
}