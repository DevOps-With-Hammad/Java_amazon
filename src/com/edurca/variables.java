package com.edurca;
public class variables {
    static  int r = 7 ; // r of a circle
    static int side = 7; // side of a square
    static  int height = 3; static int width = 5; // width and height of rectangle

    // ***** Circle first ***** /
    public void Circle01(){
        double  circumferenceOfCircle = r *2 * 3.14 ;
        System.out.println("The circumference  of the Circle : "+ circumferenceOfCircle);
        System.out.println(" This is Circle01 none static Circle ");
    }// end of Circle01


    private void Circle02(){
        double areaOfCircle = r*r *3.14 ;
        System.out.println("The area of the Circle is : " +areaOfCircle);
    }// end of Circle area

    public static  void Circle00(){
        double circumference, area ;
        circumference = r * 3.14 *2 ;
        area = r*r * 3.14 ;
        System.out.println("Circle Circumference is:"+ circumference + "\n" +
                "Circle Area is : "+ area);
    }// end of static method


    // ***** Square Second  ***** /
    public void Square01(){
        double  circumferenceOfSquare = side * 4  ;
        System.out.println("The circumference of square: "+ circumferenceOfSquare);
    }// end of Circle01


    private void Square02(){
        double areaOfSquare =side * side  ;
        System.out.println("The area of the Square is : " +areaOfSquare);
    }// end of Circle area

    public static  void Square00(){
        double circumference, area ;
        circumference =side *4  ;
        area = side * side  ;
        System.out.println("Square Circumference is:"+ circumference + "\n" +
                "Square Area is : "+ area);
    }// end of static method

    // ***** Rectangle  Third   ***** /
    public void Rectangle01(){
        double  circumferenceOfRectangle =(width + height)*2;
        System.out.println("The circumference of Rectangle : "+ circumferenceOfRectangle);
    }// end of Circle01


    private void Rectangle02(){
        double areaOfRectangle =width * height ;
        System.out.println("The area of the Rectangle  is : " +areaOfRectangle);
    }// end of Circle area

    public static  void Rectangle00(){
        double circumference, area ;
        circumference =(width + height) * 2;
        area =width * height;
        System.out.println("Rectangle  Circumference is:"+ circumference + "\n" +
                "Rectangle Area is : "+ area);
    }// end of static method



    // ** ** ** ** creating the main method to call the code for run ** ** ** **
    public static void main (String [] args ){
        Circle00(); // calling the static method of circle .
        // calling none static method
        System.out.println(" ** ** ** ** \n ** ** ** **\n  ");
        variables noneStaticCircle = new variables();
        noneStaticCircle.Circle01();
        // end of calling

        //calling Private method for Circle 2
        variables privateCircle = new variables();
        privateCircle.Circle02();
        System.out.println(" ** ** ** ** \n ** ** ** **\n  ");

        Square00();// calling  the static method of square
        System.out.println(" ** ** ** ** \n ** ** ** ** \n  ");
        variables noneStaticSquare = new variables();
        noneStaticSquare.Square01();
        System.out.println(" This is the private Method for the Square \n ** ** ** ** ");
        noneStaticSquare.Square02();



        System.out.println(" ** ** ** ** \n ** ** ** **\n  ");


        Rectangle00(); // calling the static method of Rectangle
        System.out.println(" ** ** ** ** \n ** ** ** ** \n  ");

        variables noneStaticRectangle = new variables();
        noneStaticRectangle.Rectangle01();


        System.out.println(" ** ** ** ** \n ** ** ** **\n  ");
        variables privateRectangle = new variables();
        privateRectangle.Rectangle02();
    }

}// end of class ## variables ##
