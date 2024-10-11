public class Using_chained_conditions {
    public static void main (String[] args)
    {
        //Using conditions in a real-life scenario
        int dollarsToSpareInPocketToday = 3;

        if( dollarsToSpareInPocketToday >= 15 ) {
            System.out.println("I will go to the Movies");
        } else {
            if(dollarsToSpareInPocketToday >= 3) {
                System.out.println("I will go to a Cafe for a cup of coffee.");
            } else {
                System.out.println("I will chill at home.");
            }
        }

        // Logical Operator
        //marks between 1 and 100
        int marks = 75;

        if(marks > 60) {
            System.out.println("Pass.");
        } else {
            System.out.println("Fail.");
        }
        // problem 1
        int checkVal = 15;

        if(checkVal > 12 ) {
            System.out.println("A");
        }
        if(checkVal < 17) {
            System.out.println("C");
        }

        // problem 2
        int checkVal1 = 15;
        if(checkVal1 == 12) {
            System.out.println("A");
        }
        // problem 3
        int checkVal01 = 15;

        if(checkVal01 < 12) {
            System.out.println("**");
        } else {
            System.out.println("##");
        }


        // problem 4
        int checkVal03 = 15;
        if(checkVal03 > 10) {
            if(checkVal03 < 20) {
                System.out.println("##");
            }
        }

        //Problem 5
        int variable1 = 20, variable2 = 10;

        if(variable1 > 12 && variable2 >25) {
            System.out.println("$#");
        }

        if(variable1<=20 || variable2>=30) {
            System.out.println("#$");
        }
        if(variable1 > 20 || variable2<=12) {
            System.out.println("@@");
        }


    }
}
