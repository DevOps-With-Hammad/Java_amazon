public class Using_chained_conditions {
    public static void main (String[] args)
    {
        //Using conditions in a real-life scenario
        int dollarsToSpareInPocketToday = 15;

        if( dollarsToSpareInPocketToday >= 15 ) {
            System.out.println("I will go to the Movies");
        } else {
            if(dollarsToSpareInPocketToday >= 3) {
                System.out.println("I will go to a Cafe for a cup of coffee.");
            } else {
                System.out.println("I will chill at home.");
            }
        }

    }
}
