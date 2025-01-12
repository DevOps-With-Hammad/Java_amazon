package com.coursera;// Import Java Scanner
import java.util.Scanner;

public class m2_Building_a_schedule {
    public static void main(String [] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println(" Enter the age you want here :");
        int age = keyboard.nextInt();

        System.out.println(" Enter the Money :");
        float money = keyboard.nextFloat();

        keyboard.nextLine();
        System.out.println(" Enter the name :");
        String name = keyboard.nextLine();

        System.out.println("Here is " + name + "  and age "+age + "with money "+ money);
        // User input for conditional statements




    }
}

