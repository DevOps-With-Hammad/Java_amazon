package com.coursera;

import java.util.Scanner;

public class m2_a_schedule_java {
    public static void main(String[] args) {
        // Create a Scanner variable named "keyboard"
        Scanner keyboard = new Scanner(System.in);

        // Display a menu to get the day of the week from the user
        System.out.println("********** MENU *****************");
        System.out.println("These are the choices for the day of the week.");
        System.out.println("Please enter only values from 1-7:");
        System.out.println(" 1. MONDAY");
        System.out.println(" 2. TUESDAY");
        System.out.println(" 3. WEDNESDAY");
        System.out.println(" 4. THURSDAY");
        System.out.println(" 5. FRIDAY");
        System.out.println(" 6. SATURDAY");
        System.out.println(" 7. SUNDAY");
        System.out.println("**********************************");

        // Variable for getting the day of the week
        int dayOfTheWeek;
        boolean subChoice;


        // Loop to handle user input
        while (true) {
            System.out.println("Enter a day of the week (1 to 7) or 0 to exit: ");
            dayOfTheWeek = keyboard.nextInt(); // Read user input
            subChoice = keyboard.nextBoolean();

            if (dayOfTheWeek == 0) {
                System.out.println("Exiting program. Goodbye!");
                break; // Exits the loop
            }

            if (dayOfTheWeek < 1 || dayOfTheWeek > 7) {
                System.out.println("Invalid input. Please enter a number between 1 and 7.");
                continue; // Ask for input again
            }

            // Switch with case values from 1-7 to handle the schedule
            switch (dayOfTheWeek) {
                case 1:
                    System.out.println("Monday: It is back to work.....");
                    if (subChoice ==true){
                        System.out.println("Ive got lunch ");
                    }
                    break;
                case 2:
                    System.out.println("Tuesday: It is back to work.....Again");
                    break;
                case 3:
                    System.out.println("Wednesday: It is back to work.....Again XD");
                    break;
                case 4:
                    System.out.println("Thursday: It is back to work.....Almost weekend!");
                    break;
                case 5:
                    System.out.println("Friday: WoW a day off ..... XD");
                    break;
                case 6:
                    System.out.println("Saturday: WoW a day off .....Again XD");
                    break;
                case 7:
                    System.out.println("Sunday: Church time ..... :)");
                    break;
            }
        }

        keyboard.close(); // Close the scanner when done
    }
}
