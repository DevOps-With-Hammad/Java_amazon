package control_statement;

public class control_statement {
    public static void main (String [] args ){
        // ** ** **  If Else Loop in Java ** ** //
        int a = 5;  int b = 10;
        if (a> b ){
            System.out.println(" A is greater than B because a=" + a+ " and b ="+b);
        }
        System.out.println("A is greater than A because a=" + a+ " and b ="+b);
        System.out.println("Welcome to Java Coding ");


        // ** ** ** While Loop ** ** ** //
        // evaluate a certain condition
        // while loop is an iteration loop that gets itself executed until the provided condition in the loop is true

        System.out.println("Hello ");
        int n =5;
        while (n <= 0);
        {
            System.out.println(n++);
        }

        int i = 120;
        do {
            System.out.println(i);
            i = i + 1;
        }while (i<= 100);
    }
