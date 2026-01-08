package innerClassAndAnonymous.nestedStatic;

// 외부 클래스
class Outer {
    private int data = 5; // 외부 클래스의 인스턴스 변수
    private static int dataStatic = 10; // 외부 클래스의 정적 변수

    // 내부 클래스의 데이터에 접근하는 메서드
    int getInnerData() {
        Inner inner = new Inner(); // 내부 클래스 인스턴스 생성
        return inner.getInData(); // 내부 클래스의 인스턴스 변수에 접근함
    }

    // 정적 중첩 클래스
    static class Inner {
        private int inData = 50; // 정적 중첩 클래스의 인스턴스 변수
        // 정적 중첩 클래스는 정적 멤버를 가질 수 있음
        private static int inDataStatic = 100;

        // 정적 중첩 클래스의 인스턴스 변수에 접근하는 메서드
        int getInData() {return inData;}
        // 외부 클래스의 정적 변수에 접근하는 메서드
        // 정적 중첩 클래스는 외부 클래스의 인스턴스 멤버에 접근할 수 없음
        int getOuterDataStatic() {return Outer.dataStatic;}
    }
}
