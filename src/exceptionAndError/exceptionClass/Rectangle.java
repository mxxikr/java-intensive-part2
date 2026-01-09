package exceptionAndError.exceptionClass;

import polymorphism.ex.Shape;

class Rectangle extends Shape {
    @Override
    public void render() {
        for(int i = 0; i < 5; ++i) {
            for(int j = 0; j < 5; ++j)
                System.out.print("*\t");
            System.out.print('\n');
        }
        throw new MyRuntimeError("TEST MESSAGE");
    }
}