package polymorphism.ex2;

public class Rectangle implements Shape {
    @Override
    public void render() {
        for(int i = 0; i < 5; ++i) {
            for(int j = 0; j < 5; ++j) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
