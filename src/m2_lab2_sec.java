/*TODO #1 :- Import the Scanner  */
import java.util.Scanner;
public class m2_lab2_sec {
    public static void main (String [] args) {
        System.out.println(" Welcome to the daily week schedule .");
        /*TODO #2 calling the keyboard Scanner  */
        Scanner keyboard = new Scanner(System.in);
        int dayOfTheWeek;
        int subChoice;

        System.out.println();
        System.out.println("************** Menu **************\n" +
                            "These are the choices of the days of the week\n" +
                            " Pls enter only one value form : 1 >> 7\n" +
                            "   1. MONDAY\n" +
                            "   2. TUESDAY\n" +
                            "   3. WEDNESDAY\n" +
                            "   4. THURSDAY\n" +
                            "   5. FRIDAY\n" +
                            "   6. SATURDAY\n" +
                            "   7. SUNDAY\n");
            System.out.println("what is your day's Number (1>>7)");

            while (true){
                 dayOfTheWeek = keyboard.nextInt();
                if (dayOfTheWeek == 0){
                    System.out.println(" Exiting program goodBye !");
                    break;
                }
                if (dayOfTheWeek <1  || dayOfTheWeek >7 ){
                    System.out.println("Invalid input. Please enter a number between 1 and 7.");
                    continue;
                }
                // Switch with case values from 1-7 to handle the schedule
                switch (dayOfTheWeek) {
                    case 1:
                        System.out.println("Monday: It is back to work.....");
                        System.out.println("*********** SUB MENU FOR MONDAY ************\n" +
                                "   1. Yes, I had my breakfast\n" +
                                "   2. No, I would like one\n" +
                                "**************************************\n ");
                        subChoice = keyboard.nextInt(); /* Here is where you should put your subChoice variable */
                        switch (subChoice){
                            case 1:
                                System.out.println("Good. Now you have a catchup meeting at 9 A.M. Prepare your notes. ");
                                break;
                            case 2 :
                                System.out.println("Lets us divert on Highway 54 and have a Burger on the drive in ");
                                break;

                            default :
                                //user has entered a value which is neither 1 nor 2
                                System.out.println("NO such choice available");
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
    }
}

