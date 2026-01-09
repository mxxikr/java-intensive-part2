package exceptionAndError.exceptionClass;

import polymorphism.ex.Shape;
import polymorphism.ex.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        Shape shape = null;
        if(input == 0)
            shape = new Rectangle();
        else if(input == 1)
            shape = new Triangle();
        try {
            try {
                shape.render();
            }
            catch (MyRuntimeError e) {
                System.out.println(e.msg);
            }
        }
        catch (NullPointerException e) {
            System.out.println("Error: NullPointer");
        }
    }
}
