package gcObject.jolUsing;

import org.openjdk.jol.info.ClassLayout;

public class Main {
    public static void main(String[] args) {
        MyTest t = new MyTest();
        System.out.println(
                ClassLayout.parseClass(MyTest.class).toPrintable()
        );

        System.out.println(
                ClassLayout.parseInstance(t).toPrintable()
        );

        System.out.printf("Hash code: %X\n", t.hashCode());
        System.out.printf(
                ClassLayout.parseInstance(t).toPrintable()
            );
    }
}
