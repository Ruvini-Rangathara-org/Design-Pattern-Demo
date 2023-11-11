package org.example.structural.facade;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw Square in facade");
    }
}
