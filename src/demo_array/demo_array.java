package demo_array;

public class demo_array {
    public static void main (String []args){
        // creating array of characters
        char[] source = {'H', 'A', 'M', 'M', 'A', 'D'};
        char[] destination = new char[7];
        // copying elements from one array to another
        System.arraycopy(source, 0, destination, 1, 5);
        System.out.println(new String(destination));

        //deleting elements form array.



    }// static void main close
}
