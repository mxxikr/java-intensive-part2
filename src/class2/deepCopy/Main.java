package class2.deepCopy;

public class Main {
    public static void main(String[] args) {
        MyTest t1 = new MyTest(3);
        t1.setAt(0, 10);
        t1.setAt(1, 20);
        t1.setAt(2, 30);
        System.out.println("--- 원본 t1 생성: t1.array = [10, 20, 30] ---\n");

        MyTest t2 = new MyTest(3);
        t2.shallowCopy(t1);
        System.out.println("--- t2에 t1을 얕은 복사 ---");

        MyTest t3 = new MyTest(3);
        t3.deepCopy(t1);
        System.out.println("--- t3에 t1을 깊은 복사 ---");

        MyTest t4 = new MyTest(t1);
        System.out.println("--- t4를 t1의 복사 생성자로 생성 (깊은 복사) ---");
        System.out.println("--- 원본 t1의 내용 변경: t1.setAt(0, -1) ---");
        t1.setAt(0, -1);
        System.out.println("t1.array = [-1, 20, 30]");

        System.out.println("--- 최종 결과 비교 ---");
        System.out.println("t1[0]: " + t1.getAt(0));
        System.out.println("t2[0]: " + t2.getAt(0));
        System.out.println("t3[0]: " + t3.getAt(0));
        System.out.println("t4[0]: " + t4.getAt(0));
    }
}
