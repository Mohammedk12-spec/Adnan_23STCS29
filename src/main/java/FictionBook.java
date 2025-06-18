 // Subclass: FictionBook
    public class FictionBook extends Book {
        private final String genre;

        public FictionBook(String title, String author, String ISBN, String genre) {
            super(title, author, ISBN); // Call the Book constructor
            this.genre = genre;
        }

     @Override
        public void displayBookInfo() {
            super.displayBookInfo(); // Call the Book's displayBookInfo
            System.out.println("Genre: " + genre);
        }
    }


