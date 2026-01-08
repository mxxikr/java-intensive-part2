package innerClassAndAnonymous.localClass;

// 외부 클래스 Main 정의
public class Main {
    // 외부 클래스의 private 멤버 변수
    private String name = "현실";

    // 메서드 run 정의
    void run() {
        // run 메서드 내부에 지역 내부 클래스 LocalInner를 정의
        class LocalInner {
            // 지역 내부 클래스의 멤버 변수
            int age = 20;

            // 외부 클래스의 멤버 변수에 접근하는 메서드
            String getName() {
                return name;
            }

            // 지역 내부 클래스 자신의 멤버 변수에 접근하는 메서드
            int getAge() {
                return this.age;
            }
        }

        // 지역 내부 클래스의 인스턴스 생성
        LocalInner localInner = new LocalInner();
        // 지역 내부 클래스의 메서드 호출
        System.out.println(localInner.getName());
        System.out.println(localInner.getAge());
    }

    // 메인 메서드
    public static void main(String[] args) {
        // Main 클래스의 인스턴스 생성
        Main main = new Main();
        // run 메서드 호출
        main.run();
    }
}
