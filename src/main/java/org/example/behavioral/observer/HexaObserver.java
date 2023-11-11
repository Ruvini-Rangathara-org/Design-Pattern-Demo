package org.example.behavioral.observer;

public class HexaObserver extends Observer{

    public HexaObserver(Subject subject){
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Update in Hexa Observer State : "+subject.getState());
    }
}
