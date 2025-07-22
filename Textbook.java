public class Textbook extends Book {
    private String subject;
    private int edition;

    public Textbook(String _title, String _author, int pages, String _subject, int _edition) {
        super(_title, _author, pages);
        this.subject = _subject;
        this.edition = _edition;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
        System.out.println("Edition: " + edition);
    }
    
    // Getters:
    public String getSubject() { return subject; }
    public int getEdition() { return edition; }
}