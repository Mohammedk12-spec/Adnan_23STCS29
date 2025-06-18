// Subclass: NonFictionBook
public class NonFictionBook extends Book {
    private String subject;

    public NonFictionBook(String title, String author, String ISBN, String subject) {
        super(title, author, ISBN); // Call the Book constructor
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public void displayBookInfo() {
        super.displayBookInfo(); // Call the Book's displayBookInfo
        System.out.println("Subject: " + subject);
    }
}
