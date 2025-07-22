public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("CPP basics", "Lewis Hamilton", 111);
        Book book2 = new Book("JAVA basics", "Max Verstappen", 222);
        
        Textbook textbook1 = new Textbook("Taylor's series", "Monk", 12, "Calculus 2", 3);
        
        book1.borrowBook();
        book1.borrowBook();
        book1.returnBook();
        
        textbook1.borrowBook();
        textbook1.returnBook();
        
        System.out.println("\nBook 1 Info:");
        book1.displayInfo();
        
        System.out.println("\nBook 2 Info:");
        book2.displayInfo();
        
        System.out.println("\nTextbook Info:");
        textbook1.displayInfo();
    }
}