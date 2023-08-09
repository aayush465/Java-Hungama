package com.java.practice.javafxdemo;




interface Person {
    void greet();
}

//class Student implements Person {
//    @Override
//    public void greet() {
//        System.out.println("Namaste");
//    }
//
//}

public class AnonymousInnerClassDemo {
    public static void main(String[] args) {
//        Person student = new Student();
//        student.greet();
        Person person = new Person(){

            @Override
            public void greet() {
                System.out.println("Namaste from AnonymousInner class");
            }
        };
        person.greet();
    }
}

