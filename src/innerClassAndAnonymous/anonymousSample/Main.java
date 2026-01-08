package innerClassAndAnonymous.anonymousSample;

public class Main {
    public static void main(String[] args) {
        Parent p1 = new Child();
        p1.print();
        Parent p2 = new Parent() {
            @Override
            public void print() {
                System.out.println("Anonymous class");
            }
        };
        p2.print();
    }
}