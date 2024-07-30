package library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(10);

        // Adding books
        library.addBook(new Book(1, "Effective Java", "Joshua Bloch"));
        library.addBook(new Book(2, "Clean Code", "Robert C. Martin"));
        library.addBook(new Book(3, "Design Patterns", "Erich Gamma"));

        // Display all books
        System.out.println("All Books in the Library:");
        library.displayBooks();

        // Linear search by title
        String searchTitle = "Clean Code";
        Book book = library.linearSearchByTitle(searchTitle);
        if (book != null) {
            System.out.println("\nLinear Search: Found - " + book);
        } else {
            System.out.println("\nLinear Search: Book not found.");
        }
        String searchTitle2 = "x";
        Book book2 = library.linearSearchByTitle(searchTitle2);
        if (book2 != null) {
            System.out.println("\nLinear Search: Found - " + book2);
        } else {
            System.out.println("\nLinear Search: Book not found.");
        }
        // Binary search by title
        searchTitle = "Effective Java";
        book = library.binarySearchByTitle(searchTitle);
        if (book != null) {
            System.out.println("\nBinary Search: Found - " + book);
        } else {
            System.out.println("\nBinary Search: Book not found.");
        }
        searchTitle2 = "y";
        book2 = library.binarySearchByTitle(searchTitle2);
        if (book2 != null) {
            System.out.println("\nBinary Search: Found - " + book2);
        } else {
            System.out.println("\nBinary Search: Book not found.");
        }
    }
}
