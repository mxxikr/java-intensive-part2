package class2;

public class Address {
    public String address; // 주소
    public String phone;   // 전화번호

    /**
     * 주소와 전화번호를 받아 Address 객체를 생성하는 기본 생성자입니다.
     */
    Address(String address, String phone) {
        this.address = address;
        this.phone = phone;
    }

    /**
     * 다른 Address 객체를 받아 동일한 내용의 새로운 Address 객체를 생성하는 복사 생성자
     * 단순히 주소값(참조)을 복사하는 것이 아니라, 내용을 복사하여 새로운 객체를 만듬
     */
    Address(Address other) {
        this.address = other.address;
        this.phone = other.phone;
    }
}
