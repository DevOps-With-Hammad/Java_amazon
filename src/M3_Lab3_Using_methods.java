public class M3_Lab3_Using_methods {

    // Array to sort the names of ingredients
    static String ingredients[];
    //Variable for sorting the status of sandwich.
    // is ready or not
    static  boolean isSandwichRead;
    public static void gatherIngredients(){
        ingredients = new  String[4];
        ingredients[0]= new String ("Bread");
        ingredients[1]= new String("Checkins Slices ");
        ingredients[2] = new String("cheese Slices");
        ingredients[3]= new String("lettuce");
        System.out.println("All ingredients arranged ");
    }
    public static void assembleSandwich(){
        if(ingredients.length == 4){
            if (ingredients[0].equals("Bread") &&
                    ingredients[1].equals("Checkins Slices ") &&
                    ingredients[2].equals("cheese Slices")
                    && ingredients[3].equals("lettuce") ){
                // assemble the sandwich
                System.out.println(" Assembling the sandwich now ");
                isSandwichRead= true;
            }
        }
    }
    public static void serveSandwich(){
        //
        if (isSandwichRead== true){
            System.out.println("Serving Sandwich now ... ");
        }
    }
    public static void main (String []args){
        // gather ingredients
        gatherIngredients();
        //assemble a sandwich
        assembleSandwich();
        //serve sandwich
        serveSandwich();
    }
}
