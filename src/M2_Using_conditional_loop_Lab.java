import java.util.Scanner;

public class M2_Using_conditional_loop_Lab {
    // Using conditional loop activity Lab .
public static void main (String [] args ){
    /**  🖥️  It’s time to get coding!

     🖥️  TODO 1: In the main method, declare and initialize the five variables to:

     track if the car is on or off (Boolean)

     * hold the gear of the car (P, D, R)

     * track the current speed of the car (int)

     * store the user's menu choice (int)

     * a scanner object to read the user's input.
     **/

    boolean isEngineOn = false;
    String gear = "P";
    int speed = 0;
    int choice = 0;
    Scanner keyboard = new Scanner(System.in);

    /** 🖥️  It’s time to get coding!

     🖥️  TODO 2: Press Enter a few times to create empty lines in the program.

     Add print statements to indicate the current state of the car to the user. Note that this should be the first print statement displayed.
     **/
    System.out.println("------ Car Dashboard -------- ");
    System.out.println(" Speed: " + speed);
    System.out.println(" Gear: " + gear);

    /**
     *  🖥️  It’s time to get coding!
     *
     * 🖥️  TODO 3: Add print statements to create the display menu for options available to the user.
     *
     */
    //////////////////////////////////////////////////////
    while (choice !=5) {
        System.out.println("------ Car Dashboard ------");
        System.out.println("Speed: " + speed);
        System.out.println("Engine running: " + isEngineOn);
        System.out.println("Gear: " + gear);
        System.out.println("------ End Car Dashboard ------");
        System.out.println();
        System.out.println("Menu:");
        System.out.println("1. Turn on/off the engine");
        System.out.println("2. Change gear (P, D, R)");
        System.out.println("3. Accelerate");
        System.out.println("4. Brake");
        System.out.println("5. Exit");
        /**
         * 🖥️  TODO 4: Prompt the user for their choice and store it in the choice variable.
         */
        System.out.print("Enter your choice: ");
        choice = keyboard.nextInt();

        System.out.print("Menu item selected : " + choice);
        System.out.println();
        //////////////////////////////////////////////////////
        /**
         * 🖥️  TODO 5: Insert a switch statement to provide five menu options to the user. The user enters a menu number, which is captured in the choice variable. The value is then checked in a switch statement.
         */
        switch (choice) {
            case 1:
                isEngineOn = !isEngineOn;
                break;
            case 2:
                System.out.print("Enter gear (P, D, R): ");
                gear = keyboard.next();
                break;
            case 3:
                if (isEngineOn && !gear.equals("P")) {
                    speed += 10; // speed = speed+10
                } else {
                    System.out.println("Cannot accelerate while engine is off or in Park (P) gear.");
                }
                break;
            case 4:
                if (isEngineOn && speed > 0) {
                    speed -= 5; // speed = speed-5
                } else {
                    System.out.println("Cannot apply braking while engine is off or car not moving.");
                }
                break;

            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
    System.out.println();
    System.out.println("Turning off engine and exiting the car. Goodbye!");
  }
}
