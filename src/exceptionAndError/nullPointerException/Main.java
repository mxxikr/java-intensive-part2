package exceptionAndError.nullPointerException;

import polymorphism.ex.Rectangle;
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
        shape.render();
    }
}
