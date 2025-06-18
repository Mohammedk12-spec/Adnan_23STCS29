public class Book {
    // Base class: Book
        private String title;
        private String author;
        private String ISBN;
        private boolean isBorrowed;

        // Constructor
        public Book(String title, String author, String ISBN) {
            this.title = title;
            this.author = author;
            this.ISBN = ISBN;
            this.isBorrowed = false; // Initially, a book is not borrowed
        }

        // Getters
        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public String getISBN() {
            return ISBN;
        }

        public boolean isBorrowed() {
            return isBorrowed;
        }

        // Setters
        public void setBorrowed(boolean borrowed) {
            isBorrowed = borrowed;
        }

        // Method to display book information
        public void displayBookInfo() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + ISBN);
            System.out.println("Borrowed: " + (isBorrowed ? "Yes" : "No"));
        }
    }


