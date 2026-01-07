package polymorphism.ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();

        Shape shape;

        if (input == 0) {
            shape = new Rectangle();

        } else {
            shape = new Triangle();
        }

        shape.render();
        if(shape instanceof Rectangle)
            System.out.println("Rectangle class object");
        else
            System.out.println("Triangle class object");
    }
}
