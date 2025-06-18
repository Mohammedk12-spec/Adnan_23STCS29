import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryManagementSystem {
    private static List<Book> books = new ArrayList<>(); // List to store books

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Welcome to the Library Management System");
            System.out.println("1. Add a Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addBook(scanner);
                    break;
                case 2:
                    displayBooks();
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
        System.out.println("Thank you for using the Library Management System!");
    }

    private static void addBook(Scanner scanner) {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        System.out.print("Enter book ISBN: ");
        String isbn = scanner.nextLine();
        System.out.print("Enter book genre (Fiction/Non-Fiction): ");
        String genreOrSubject = scanner.nextLine();

        // Determine if it's a Fiction or Non-Fiction book
        Book newBook;
        if (genreOrSubject.equalsIgnoreCase("Fiction")) {
            System.out.print("Enter genre: ");
            String genre = scanner.nextLine();
            newBook = new FictionBook(title, author, isbn, genre);
        } else {
            System.out.print("Enter subject: ");
            String subject = scanner.nextLine();
            newBook = new NonFictionBook(title, author, isbn, subject);
        }

        books.add(newBook);
        System.out.println("Book added successfully!");
    }

    private static void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        System.out.println("List of Books:");
        for (Book book : books) {
            book.displayBookInfo();
            System.out.println(); // Add a blank line for better readability
        }
    }
}
