package org.example.structural.decorator;

public abstract class ShapeDecorator implements Shape {

    protected Shape decoratorShape;

    public ShapeDecorator(Shape shape){
        decoratorShape = shape;
    }

    @Override
    public void draw(){
        decoratorShape.draw();
    }


}
