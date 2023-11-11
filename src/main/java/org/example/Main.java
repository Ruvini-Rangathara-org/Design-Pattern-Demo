package org.example;

import org.example.creational.singleton.SingletonDemo;

public class Main {
    public static void main(String[] args) {

        // Singleton design pattern
        SingletonDemo instance = SingletonDemo.getInstance();
        instance.showMessage();



    }
}