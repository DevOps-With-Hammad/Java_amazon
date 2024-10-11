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

        //  Problem 6
        int month = 11;
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
            case 12:
                System.out.println("December");
            default:
                System.out.println("Invalid month for playing with snow in our zone.");
        }

        // For Loop Problem
        int i;
        for(i=1; i <= 5 ; i++)
            System.out.println(" " + i);
            System.out.println(" # " + i);

         // Problem with while loop
        int loopVar = 1;
        while (loopVar <= 3) {
            System.out.print("Value= " + loopVar);
            loopVar += 2;
        } // the correct output for the following code is ??
         // also what if the loopVar += 5 0r LoopVar += 1 >>
        // the correct output for the following code is?


        // Problem 7
        int loopVar01 = 1;

        do {
            System.out.print ("  " + loopVar01);
            loopVar01++;
        } while (loopVar01 <= 3);


        // Problem 8
        int x = 12;

        if(x > 10 ) {
            System.out.print("A");

            switch(x){
                case 12:
                    System.out.print("B");
                    break;
                case 14:
                    System.out.print("D");
                    break;
            }


        } else {
            System.out.print("Z");
        }

    }

}
