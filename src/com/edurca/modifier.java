package com.edurca;

public class modifier {
    public void hammad() {
        int x = 14;
        int y = 20;
        int z = 30;
        int res01 = x--;
        int res02 = y++;
        int res03 = x + y + z;
        System.out.println(" This is none static class");
    }// CLose of this class is none  static class.
    public static void ibrahim(){

        String name = " Hammad Ibrahim ";
        int degree = 30;
        double weight = 55.6;
        boolean is_man = true;
        System.out.println("Name of the developer is  :" +
                "\n"+ name+
                "The degree related to the developer is:" +
                "\n"+ degree +
                "The weight of this developer is :" +
                "\n"+ weight+
                "Is he or she ? :" +
                "\n"  + is_man);
        System.out.println("First result is:" +" The second result is:" +
                "\n");

    }
    public static void main (String[] args ){
        modifier hammadobject = new modifier();
        hammadobject.hammad();
        System.out.println("Separator ");
        ibrahim();


    }

}

