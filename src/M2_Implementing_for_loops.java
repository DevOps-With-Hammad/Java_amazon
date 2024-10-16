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


        /** another for loop  **/
        // The string given
        String stringToTravel = "cinema is a great place to watch a movies  ";
        // The variable to count the number of vowels
        int countVowels = 0;
        for(int indexPosition = 0; indexPosition<stringToTravel.length(); indexPosition++) {
            // this method charAt() returns the character at the index number given
            char ch = stringToTravel.charAt(indexPosition);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                countVowels++;
            }
        }
        System.out.println("The total number of vowels in the String is: " + countVowels);





    }
}
