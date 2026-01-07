package polymorphism.ex2;

public class Triangle implements Shape {
    @Override
    public void render() {
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
