package org.example.creational.factory;

public class Factory {

    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("CIRCLE")) return new Circle();
        if(shapeType.equalsIgnoreCase("SQUARE")) return new Square();
        return null;
    }
}
