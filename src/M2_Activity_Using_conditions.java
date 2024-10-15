public class M2_Activity_Using_conditions {
    public static void main (String [] args){
        /* Task 1: Writing conditional statements
            Your first task is to use an if statement to
             check for the following conditions:
            1.1 Check if a number is equal to zero. */
        int number =0;
        if (number == 1){
            System.out.println(" The value with the number is : " +number);
        }
        /* Task 2: Using Chained conditions
                You are required to use nested if and else statements to create a program that tests for the following scenarios.

                2.1 Write a program that calculates the average of three given subject grades to display the appropriate feedback. Use the following conditions and output:

                Marks between (60 – 69): "Below Average"

                Marks between (70 – 79): "Average"

                Marks between (80– 89): "Good"

                Marks between (90– 100): "Excellent"

        Marks is below 60: "Failing" */
        int grade = 90 ;
        if (grade >= 60 && grade <= 69){
            System.out.println(" Below Average");
        }
        else if (grade >= 70 && grade <= 79 ){
            System.out.println("Average");
        }
        else if (grade >=80 && grade <= 89){
            System.out.println(" Good ");
        }
        else if (grade >= 90 && grade <= 100 ){
            System.out.println("Excellent ");
        }
        else {
            System.out.println(" Falling ");
        }

        /**  Task 2: Using Chained conditions
         Solution 2.1
         The code block below calculates the average of three given subject grades to display the
         appropriate feedback. Try entering different values for the variables "marks1", "marks2"
         and "marks3" so that the average meets the different conditions to produce the different
         outputs. Enter marks between 1 and 100 only.
         **/

        // set the marks
        int marks1 = 80;
        int marks2 = 90;
        int marks3 = 120;

        // calculate the average
        int average = (marks1 + marks2 + marks3) / 3;

        // 1st level "if" condition
        if (average < 60) {
            System.out.println("Failing.");
        } else {
            //corresponding "else" body or area of control of 1st "if"

            //2nd level "if" condition
            if (average < 70) {
                System.out.println("Below Average.");
            } else {
                // 2nd level "else" of 2nd level "if"

                //3rd level "if" condition inside 2nd level "else"
                if (average < 80) {
                    System.out.println("Average.");
                } else {
                    //3rd level "else" of 3rd level "if"

                    //4th level "if" condition inside 3nd level "else"
                    if(average < 90) {
                        System.out.println("Good.");
                    } else {
                        //4th level "else" of 4th level "if"
                        System.out.println("Excellent.");
                    }
                }

            }
        }


    }
}
