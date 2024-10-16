public class M2_Implementing_for_loops {
    public static void main (String [] args ){
        int scoopsSold;
        /*For loop */
        for (scoopsSold = 0; scoopsSold <10 ; scoopsSold ++ ){
            System.out.println(scoopsSold);
        } /* Simple for loop to count form 0 to 9 */

        System.out.println("Selling chocolate ice cream: 20 scoops");
        for(scoopsSold=0; scoopsSold<20; scoopsSold++) {
            System.out.println("Sold Scoop No: " + (scoopsSold + 1));
        }
        System.out.println("No more chocolate scoops left in box.");
    }// Small program for FOR loop
}
