package com.edurca;

public class oddvseven {
    public void odd (){
        int value = 100;
        while (value> 0) {
            if (value % 2 != 0) {
                System.out.println(value); // return the odd numbers form 1 to 100
            }// end of if statement
            value--;
        }// end of while statment
    } // end of the odd class

    public static void  even (){
        int xvalue = 100 ;
        while( xvalue >0){
            if (xvalue %2 ==0){
                System.out.println(xvalue); // printing odd number.
            }// end of if statement
            xvalue--;
        }// end of while loop
    }// end of static class even

    public static void main (String []args ){
        oddvseven obj = new oddvseven();// you must create an object for the private function
        obj.odd();// then call it using this object
        even();// Here , you just need to call it .
    }
}
