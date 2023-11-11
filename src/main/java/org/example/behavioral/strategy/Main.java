package org.example.behavioral.strategy;

public class Main {

    public static void main(String[] args) {

        //operation change by runtime, call only one method

        Context context1 = new Context(new Addition());
        int result1 = context1.executeOperation(4, 2);
        System.out.println("Result 1 : "+result1);

        Context context2 = new Context(new Subtraction());
        int result2 = context2.executeOperation(6, 2);
        System.out.println("Result 2 : "+result2);

    }

}
