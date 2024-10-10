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
    }
}
