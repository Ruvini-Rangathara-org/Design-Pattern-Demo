package org.example.structural.decorator;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Square in decorator");
    }
}
