package org.example;

import org.example.creational.factory.Factory;
//import org.example.creational.factory.Shape;
import org.example.creational.singleton.SingletonDemo;
import org.example.structural.decorator.Circle;
import org.example.structural.decorator.RedShapeDecorator;
import org.example.structural.decorator.Square;
import org.example.structural.facade.ShapeMaker;

import org.example.structural.decorator.Shape;

public class Main {
    public static void main(String[] args) {

        // Singleton Design Pattern
        SingletonDemo instance = SingletonDemo.getInstance();
        instance.showMessage();


//        // Factory Design Pattern
//        Factory factory = new Factory();
//        Shape circle = factory.getShape("CIRCLE");
//        circle.draw();

        // Facade Design Pattern
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawSquare();



        //Decorator Design Pattern
        Shape circle1 = new Circle();
        RedShapeDecorator redShapeDecorator1 = new RedShapeDecorator(new Circle());
        RedShapeDecorator redShapeDecorator2 = new RedShapeDecorator(new Square());

        System.out.println("without decorator");
        circle1.draw();

        System.out.println("circle with red shape decorator");
        redShapeDecorator1.draw();

        System.out.println("square with red shape decorator");
        redShapeDecorator2.draw();


    }
}