package org.example.behavioral.observer;

public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject){
        this.subject = subject;
        subject.attach(this);

    }

    @Override
    public void update() {
        System.out.println("Update in Binary Observer State : "+subject.getState());
    }
}
