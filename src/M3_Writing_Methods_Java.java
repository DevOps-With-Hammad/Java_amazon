import java.util.Scanner;
public class M3_Writing_Methods_Java {
    // What is the angle between the hours arm and the minutes arm in an analog Watch when the time is 3:30??!

    // How to code that problem in Java ??
    /**
     * First:  we Know that in an analog watch all the angle sum = 360 degrees.
     * Second: to figure out the angle between each hour and the next is 360 / 12 = 30 degree.
     * Third: we should keep in mind that when the minutes arm moves by 15, 30, 45 or 60 minutes as full round
     * the hours arm moves too according to the movement of the minutes arm
     * Lets give it a try ...
     * Happy coding
     * **/
    //initial the total angle sum

    // Constraints for Watch properties
    public static final int totalWatchAngle = 360;
    public static final int totalHours = 12;
    public static final int totalMinutes = 60;

    // Scanner for user input
    public static Scanner keyboard = new Scanner(System.in);

    // Method to take user input for hours and minutes
    public static int [] takingInput(){
        System.out.println("Hello! Welcome to the analog watch angle calculator ");
        System.out.print("Please Enter the hour: ");
        int hour = keyboard.nextInt();

        System.out.print(" Please enter the minutes: ");
        int minute = keyboard.nextInt();
        return new int [] {hour, minute};
    }
    // Method to calculate the angle between the hours and minutes hands

    public static  void calculateAngle(int hour, int minute){
        // ensure hours with in 1-12
        if (hour < 1 || hour > 12 )
        {
            System.out.print("Invalid hour input . please insert a valid value ");
            return;
        }

        // ensure hours with in 1-12
        if (minute< 1 || minute > totalMinutes )
        {
            System.out.print("Invalid hour input . please insert a valid value ");
            return;
        }

        // Calculate the angles of the hour and minute hands
        double minuteAngle = (minute * 360.0) / totalMinutes; // 6 degrees per minute
        double hourAngle = (hour * 30.0) + (minute * 0.5); // 30 degrees per hour + adjustment

        // Calculate the angle between the two hands
        double angle = Math.abs(hourAngle - minuteAngle);

        // Find the smaller angle out of the two possible ones
        angle = Math.min(angle, totalWatchAngle - angle);

        System.out.printf("The angle between the hour and minute hands is: %.2f degrees\n", angle);
    }
    public static void main(String[] args) {
        int[] time = takingInput(); // Take input for hour and minute
        calculateAngle(time[0], time[1]); // Calculate and print the angle
    }
}
