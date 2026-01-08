package innerClassAndAnonymous.nestedStatic;

public class Main {
    public static void main(String[] args) {
        // 외부 클래스의 인스턴스를 생성함
        Outer out = new Outer();
        // 외부 클래스 인스턴스를 통해 내부 클래스의 데이터에 접근함
        System.out.println(out.getInnerData());

        // 정적 중첩 클래스의 인스턴스는 외부 클래스의 인스턴스 없이 생성 가능함
        Outer.Inner inClass = new Outer.Inner();
        // 정적 중첩 클래스의 인스턴스를 통해 외부 클래스의 정적 데이터에 접근함
        System.out.println(inClass.getOuterDataStatic());
    }
}
