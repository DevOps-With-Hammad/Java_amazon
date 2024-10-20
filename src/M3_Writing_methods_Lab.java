// import the Java Scanner for taking values from user input
import java.util.Scanner;
public class M3_Writing_methods_Lab {
    // Initial position of the gear is P (i.e. Park) so, initializing variable gear with same
    public static String gear = "P";
    // Initial speed is set to 0, initializing variable speed with same
    public static int speed = 0;
    // Engine is initially off so the variable isEngineOn is set to false.
    public static boolean isEngineOn = false;
    // Getting user input via scanner class
    public static Scanner keyBoard = new Scanner(System.in);

    // Starts the car simulation
    public static void startSimulation() {
        // Variable to control the display of the menu
        boolean displayMenu = true;
        // Until the variable displayMenu is true this block will be executed
        while (displayMenu) {
            //  Invoking displayDashboard method to showcase the current state of the car.
            displayDashboard();
            // Get the user choice
            int choice = getUserChoice();
            // Calling processChoice method by passing above integer as a parameter
            processChoice(choice);
            System.out.println();
        }
    }

    // displayDashboard method displays the car dashboard with current state and menu options
    public static void displayDashboard() {
        System.out.println("------ Car Dashboard ------");
        System.out.println("Speed: " + speed);
        // Display the current state of the engine (i.e. on/off)
        System.out.println("Engine: " + (isEngineOn ? "On" : "Off"));
        // Display the gear in which the car is currently in
        System.out.println("Gear: " + gear);
        // Present a Menu which will allow user to choose the specific action
        System.out.println("Menu:");
        System.out.println("1. Turn on/off the engine");
        System.out.println("2. Change gear (P, D, R)");
        System.out.println("3. Accelerate");
        System.out.println("4. Brake");
        System.out.println("5. Exit");
    }

    // getUserChoice function has a return type int which stores the input received from the user
    public static int getUserChoice() {
        // Gets the user's choice from the menu
        System.out.print("Enter your choice: ");
        // Return the user's choice as an integer
        return keyBoard.nextInt();
    }

    // Processes the user's choice from the menu
    public static void processChoice(int choice) {
        switch (choice) {
            // Toggle the engine state
            case 1:
                toggleEngine();
                break;
            // Change the gear
            case 2:
                changeGear();
                break;
            // Accelerate the car
            case 3:
                accelerate();
                break;
            // Apply the brakes
            case 4:
                brake();
                break;
            // Exit/Terminate the simulation
            case 5:
                exitSimulation();
                break;
            // Handle the invalid choice (Any other input from the user except choices given above)
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    // Please implement toggleEngine() method which toggles the engine state, either turning it on or off
    public static void toggleEngine() {
        // Change the engine state here
        isEngineOn =!isEngineOn;
    }

    // Please implement changeGear() method that allows changing the gear according to user input
    public static void changeGear() {
        // Print a message here to ask for an input from user
        System.out.println("Enter gear (p, D, R): ");
        // Set the gear based on user input
        gear = keyBoard.next();

    }

    // Please implement accelerate() function that accelerates the car based on the condition.
    public static void accelerate() {
        // Add condition to check if the engine is on and the gear is not in Park (P)
        if (isEngineOn && gear.equals("P")) {
            // Once the condition is satisfied, increase speed by 10
            speed += 10;

        } else {
            System.out.println("Cannot accelerate while engine is off or in Park (p) gear.");
            // If the condition is not met, print a message stating acceleration is not possible
        }
    }

    // Please implement brake() function that applies the brake according to the condition
    public static void brake() {
        // Add condition to apply the brakes if the engine state is on and the speed is greater than 5
        if (isEngineOn && speed >5) {
            // Once above condition is met, decrease the speed by 5 units
            speed -=5;

        } else {
            // If condition is not met, display error message
            System.out.println("Cannot apply braking while engine is off or at no speed ");
        }
    }

    // Please implement exitSimulation() function that terminates the simulation
    public static void exitSimulation() {
        // Print an informative message about exiting the simulation here
            System.out.println("Exiting  the car  simulation . Goodbye!");
        // Terminate the driving simulation
        System.exit(0);

    }
    public static void  main (String []args){
        startSimulation();

    }
}
