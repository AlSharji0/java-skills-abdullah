public class Book {
    protected String title;
    protected String author;
    protected int pages;
    protected boolean isAvailable;

    public Book(String _title, String _author, int _pages) {
        title = _title;
        author = _author;
        pages = _pages;
        isAvailable = true; // Set isAvailable to true by default
    }
    
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been borrowed.");
        } 
        else {
            System.out.println(title + " is not available.");
        }
    }
    
    public void returnBook() {
        isAvailable = true;
        System.out.println(title + " has been returned.");
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Available: " + isAvailable);
    }
    
    // Getters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getPages() { return pages; }
    public boolean isAvailable() { return isAvailable; }
}