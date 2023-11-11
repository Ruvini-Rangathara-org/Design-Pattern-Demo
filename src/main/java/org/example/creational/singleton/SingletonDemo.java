package org.example.creational.singleton;

public class SingletonDemo {

    private static SingletonDemo instance = null;

    private SingletonDemo() {
    }

    public static SingletonDemo getInstance() {
        return instance == null ? instance = new SingletonDemo() : instance;
    }

    public void showMessage() {
        System.out.println("SingletonDemo");
    }

}
