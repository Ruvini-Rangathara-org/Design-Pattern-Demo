package org.example.behavioral.observer;

public class Main {
    public static void main(String[] args) {

        Subject subject = new Subject();
        new BinaryObserver(subject);
        new HexaObserver(subject);

        System.out.println("\nset state as 1");
        subject.setState(1);

        System.out.println("\nset state as 2");
        subject.setState(2);

        System.out.println("\nset state as 3");
        subject.setState(3);

    }
}
