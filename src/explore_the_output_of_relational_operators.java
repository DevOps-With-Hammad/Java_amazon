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
    }
}
