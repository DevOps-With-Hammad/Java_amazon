public class M3_Writing_method_signatures {
        // Area of a square  = side * side
        static double sideOfSquare;
        // Method to set the side of the Square
    public static void setSideOfSquare(){
        sideOfSquare = 5.2;

    }
    // Method to calculate the area of the Square .
    public static double calculateAreaSquare (){
        return sideOfSquare * sideOfSquare;
    }
    // the main Method
    public static void main (String [] args ){
        // set the side of square
        setSideOfSquare();

        // call the method to calculate the area of the square .
        // and store the result given  back by the method in a variable
        double areaOfSquare = calculateAreaSquare();
        // print the result
        System.out .println(" Area of the Square with side " + sideOfSquare+ "is : " +
                "" + areaOfSquare);
    }
}
