package clase12;
public class Book {

    String title;
    static boolean borrowed; //por defecto es FALSA

    // Constructor
    public Book(String bookTitle) {
        title = bookTitle;
    }
   
    // Marks the book as rented - SET
    public void borrowed() {
        borrowed = true;
    }
   
    // Marks the book as not rented - SET
    public void returned() {
        borrowed = false;
    }
   
    // Returns true if the book is rented, false otherwise - GET
    public boolean isBorrowed() {
        return borrowed;
    }
   
    // Returns the title of the book - GET
    public String getTitle() {
        return title;
    }

//    public static void main(String[] arguments) {
//        // Small test of the Book class
//        Book example = new Book("The Da Vinci Code");
//        
//        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
//        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
//        example.borrowed();
//        System.out.println("Borrowed? (should be true): " + example.isBorrowed());
//        example.returned();
//        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
//    }
} 