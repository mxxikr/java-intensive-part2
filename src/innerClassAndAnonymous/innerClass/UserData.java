package innerClassAndAnonymous.innerClass;

// 사용자 데이터를 관리하는 외부 클래스
class UserData {
    private final String name;
    private Address info;

    // UserData 객체를 초기화하는 생성자
    UserData(String name, String addr, String phone) {
        this.name = name;
        // 내부 클래스 Address의 인스턴스를 생성하고 초기화함
        this.info =  new Address(addr, phone);
    }

    // Address 객체를 반환하는 getter 메서드
    public Address getInfo() {
        return info;
    }

    // Address를 내부 클래스로 정의함
    class Address {
        private final String addr;
        private final String phone;

        // Address 객체를 초기화하는 생성자
        public Address(String addr, String phone) {
            this.addr = addr;
            this.phone = phone;
        }

        // 사용자 정보와 주소 정보를 결합하여 반환하는 메서드.
        // 내부 클래스에서는 `UserData.this`를 사용하여 외부 클래스의 인스턴스에 접근할 수 있음.
        public String getUserInfo() {
            return UserData.this.name + ", " + this.addr + ", " + this.phone;
        }
    }
}
