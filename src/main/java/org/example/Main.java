package org.example;

import org.example.creational.factory.Factory;
import org.example.creational.factory.Shape;
import org.example.creational.singleton.SingletonDemo;

public class Main {
    public static void main(String[] args) {

        // Singleton Design Pattern
        SingletonDemo instance = SingletonDemo.getInstance();
        instance.showMessage();


        // Factory Design Pattern
        Factory factory = new Factory();
        Shape circle = factory.getShape("CIRCLE");
        circle.draw();


    }
}