public class M3_Writing_methods_signatures_rectangle_area {
    // set the 2 sides of the triangle
    static double rectTall ;
    static double rectWidth;

    // methods to set the width and tall of triangle
    public static void setRectSides(){
        rectTall = 3;
        rectWidth= 2;
    }
    // method to calculate the area of the triangle
    public static double calculateAreaOfRectangle(){
        return rectWidth * rectTall;
    }
    // the main method
    public static void main (String [] args) {
        setRectSides();
        // call the method to calculate the area of the triangle
        double areaOfRectangle = calculateAreaOfRectangle();
        // print the result
        System.out.println("Area of the triangle is : " +areaOfRectangle);
    }

}
