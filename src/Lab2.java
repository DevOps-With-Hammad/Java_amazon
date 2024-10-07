public class Lab2 {
    public static void main (String[] args) {
        //Task 0 :-
        // Print the Superhero's Name and date of introduction .
        String[] superheroes = {"Batman", "Superman", "Wonder Woman", "Spider-Man", "Iron Man"};
        int[] introductionYears = {1939, 1938, 1941, 1962, 1963};
        System.out.println(superheroes[0]);
        System.out.println(superheroes[1]);
        System.out.println(superheroes[2]);
        System.out.println(superheroes[3]);
        System.out.println(superheroes[4]);
        // Task 1 : -
        System.out.println(introductionYears[0]);
        System.out.println(introductionYears[1]);
        System.out.println(introductionYears[2]);
        System.out.println(introductionYears[3]);
        System.out.println(introductionYears[4]);
        // Task 2:-

        System.out.println("Original superhero name at position 3:"+superheroes[2]);
        String P3Modfied = superheroes[2] ="Thor";
        System.out.println("Modified superhero name at position 3: " + P3Modfied);
        //Task 3: -
        System.out.println("Original introduction year for superhero at position 3:" + introductionYears[2]);
    }
}
