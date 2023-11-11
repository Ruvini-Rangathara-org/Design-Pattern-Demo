package org.example.structural.decorator;

public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw(){
        decoratorShape.draw();
        setRedShape();
    }

    private void setRedShape(){
        System.out.println(" set red border");
    }
}
