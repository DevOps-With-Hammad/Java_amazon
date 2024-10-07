public class Lab1 {
    public static void main (String [] args) {
        String bookTitle = "The Adventures of Captain Fantastic and the Magical Unicorn";
        int titleLength = bookTitle.length();
        System.out.println("Length of the book title: " + titleLength);

        //Declare and initialize the length of the shortened book title
        int maxLenght = 20;
        String ShortBookTitle;
        if (bookTitle.length()> maxLenght) {

            ShortBookTitle= bookTitle.substring(0,20);
            System.out.println("Original Title : " + bookTitle);
            System.out.println("Shorten Title  :" + ShortBookTitle);
        }

        // Declare and initialize the searchWord
        String searchWord = "Captain";

        // Check if the searchWord is present in book title
        boolean containsWord = bookTitle.contains(searchWord);
        System.out.println("Does the title contain the word \"" + searchWord + "\"? " + containsWord);
    }
}
