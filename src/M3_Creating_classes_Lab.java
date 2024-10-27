public class M3_Creating_classes_Lab {
    /**
     Create a class named Car to represent the properties of a car.

     🖥️  It’s time to get coding!

     Step 1: Create a class named Car
     **/
    public class car{
        /**
         *
         * Step 2: Add properties to the Car class
         * The Car class will store information such as the make, model, year, and color of the car.
         *
         *  🖥️ TODO :  Create variables with appropriate data types.
         *
         */
        String make; // stores the car's make (like Ford , Toyota )
        String model; // stored car's specific model name (like Mustang, Camry)
        String color; // stores the car's color (like Red, Silver )
        int year; // stores the car's manufacturing year like (2020)

        /**
         Step 3: Add a simple method to the Car class
         Create a method that returns the car details with each detail contained on a new line.

         🖥️ TODO :  Create a method named getCarDetails inside the Car class. Make the return type of the method as String.
         */
        public String getCarDetails(){
            return "Make: " + make + "\nModel: "+ model + "\nCOlor: "+ color
                    + "\nYear" +year;
        }
    }


    public static  void main(String []args){
        System.out.println("welcome to care manufacture ");
    }
}
