package com.coursera;

public class explore_the_output_of_relational_operators {
    //Explore the output of relational operators
    public static void main (String [] args ){
        //Full Gas Tank is 10
        int CurrentGasTankLevel = 2;
        int halfGasTankValue= 5;

        if (CurrentGasTankLevel <= halfGasTankValue){
            System.out.println("GO to Gas station ");
        }
        System.out.println(" On x-mas road trip ");
        //Explore the output of relational operators
        System.out.println(" 10 == 10: " + (10 == 10));
        System.out.println(" 10 == 20: " + (10 == 20));
        System.out.println(" 10 != 20: " + (10 != 20));
        System.out.println(" 20 > 10: " + (20 > 10));
        System.out.println(" 10 >= 20: " + (10 >= 20));
        System.out.println(" 10 < 20: " + (10 < 20));
        System.out.println(" 20 <= 20: " + (20 <= 20));

        //Explore decision-making with conditional statements
        int MoneyLeftWithTonie = 300;
        if (MoneyLeftWithTonie >= 300 ){
            System.out.println("Go to Las Vegas");
        }
        System.out.println("On a home trip with Parents ");


        //  🖥️ TODO 1:  Add an if statement to the code block below to display things Toni would like to do, only when moneyLeftWithToni >=300.
        int MoneyLeftWithMe = 1500;
        //1(a): Put your if-statement here to check if moneyLeftWithMe> =300.
        //1(b): Put the display statements within the curly braces of the if.
        if (MoneyLeftWithMe <= 1499){
            System.out.println("Go to Las Vegas " );
            System.out.println("Enjoy some luck games");
            System.out.println("Enjoy some concerts");
            System.out.println("Enjoy fine dining");
            System.out.println("Go on a helicopter ride");
            System.out.println("Go shop for some souvenirs");
        }
        System.out.println("On a trip with parents ");

        //🖥️ TODO 4: In the code block below, remove the curly braces of the if statement and run it again.
        int MoneyWithMe1 = 450;
        if (MoneyWithMe1 >= 950 ){
            System.out.println("Go to Las Vegas");
            System.out.println("Enjoy some luck games");
            System.out.println("Enjoy some concerts");
            System.out.println("Enjoy fine dining");
            System.out.println("Go on a helicopter ride");
            System.out.println("Go shop some souvenirs");
        }
        System.out.println("On trip to Parents . ");

        //🖥️ TODO 5: Add an else statement to the code block below that displays “Think about the money” if moneyLeftWithToni is less than 300
        //Select Run.
        int MoneyLeftWithMM = 100;
        if (MoneyLeftWithMM >= 300 ) {
            System.out.println("Go to Las Vegas");
            System.out.println("Enjoy some luck games");
            System.out.println("Enjoy some concerts");
            System.out.println("Enjoy fine dining");
            System.out.println("Go on a helicopter ride");
            System.out.println("Go shop some souvenirs");
        }
        else {
            System.out.println("On trip to parents.");
        }


       // 🖥️ TODO 6: moneyLeftWithToni >=300 go to Las Vegas and do the things he wants.
       // 🖥️ TODO 7: else if moneyLeftWithToni <= 200 but less than 300, then go to Hoover Dam.
      // 🖥️ TODO 8: else if moneyLeftWithToni <=100 but less than 200, then go to Area 51.
      //🖥️ TODO 9: else if moneyLeftWithToni <= 50 but less than 100, then have an ice cream.
      //🖥️ TODO 10: else if moneyLeftWithToni <50, then think about the money spent.

        int MoneyWithMm = 050;
        if (MoneyWithMm <= 300){
            System.out.println("GoTo Las Vegas snd do the thing you want");
        }
        else if ( MoneyWithMm <= 200 && MoneyWithMm < 300 )
        {
            System.out.println("Go to area 51 ");
        }
        else if (MoneyWithMm <= 100 && MoneyWithMm <200 )
        {
           System.out.println("Then you have an Ice Cream");
        }
        else if (MoneyWithMm <= 50 && MoneyLeftWithMe <100)
        {
            System.out.println("Think about the money spent ");
        }

        // Manipulate a String with index numbers
        String testString = "This is a test which is nice";
        int indexOfSearch1= testString.indexOf("Java"); // returns -1
        int indexOfSearch2 = testString.indexOf("is"); // returns 2
        int indexOfSearch3 = testString.indexOf("est"); // returns 11

        System.out.println("testString.indexOf(\"Java\") : " + testString.indexOf("Java"));
        System.out.println("testString.indexOf(\"is\") : " + testString.indexOf("is"));
        System.out.println("testString.indexOf(\"est\") : " + testString.indexOf("est"));


        // Another manipulation of string with index numbers with Java

        String MyName = "Software Engineering Java Developer coder ";
        int IndexOfSearch_1 = MyName.indexOf("Eng");
        int IndexOfSearch_2 = MyName.indexOf("coder");
        int IndexOfSearch_3 = MyName.indexOf("ware");
        System.out.println(IndexOfSearch_1); // 9
        System.out.println(IndexOfSearch_2);// 36
        System.out.println(IndexOfSearch_3);// 4


        // StartIndexPosition substring **

        String myName=  " This is a small test ";
        System.out.println(myName); // This is a small test
        System.out.println(myName.substring(6)); // is a small test
        System.out.println(myName.substring(8)); // a small test
        System.out.println(myName.substring(11)); // small test
        System.out.println(myName.substring(16)); //test

        //  ** The  trim()method **
        // can be utilized to eliminate leading and trailing spaces. For example, you’ll remove the spaces from the String "This is a test" as in the example below
        System.out.println(myName.trim() );

        //  ** equalsIgnoreCase(String stringToCompare) **
        System.out.println(myName.substring(16) + myName.equalsIgnoreCase(myName.substring(16))); // test false
        System.out.println((myName.substring(17) + (myName.equalsIgnoreCase(myName.substring(16))))); // test false

        // ** equals(<String stringToCompareTo> **
        String password = "secRetOfM3*@";

        if(password.equals("secRetOfM3*@") ) {
            System.out.println("Welcome");
        }
        if(password.compareTo("secRetOfM3*@0") == 1) {
            System.out.println("Welcome");
        }


        // ** Determine if a String is empty **
        String testString1 = "";

        if( testString1.isEmpty() ) {
            System.out.println("The String is empty");
        }

        // **  Determine if a String contains a substring **
        String fullTitle = "I'm a Software Engineer ";
        String Title = "Engineer";

        if( fullTitle.contains(Title) ) {
            System.out.println("The Title  " + Title + " exists in the Full Title role   " + fullTitle);
        }
    }
}
