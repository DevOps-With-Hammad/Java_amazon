package com.edurca;

public class java {
    public void test()
    {
        System.out.println("Hello From Java   \n" +
                "This is a non static method in Java");

    }// close of test()

    public static void staticJava(){
        System.out.println("Hello form Java " +
                "\n" +
                "This is a static method in java ");
    }
    public static void main (String[] args) {
        java javaobject = new java();
        System.out.println("Java ");
        javaobject.test(); // here it requires objects to work

        System.out.println("Hello World ");
        staticJava(); // here it's a static one no need to object here to run
    }

}
