public class VisitorCounter {
    private static int totalVisitors = 0;
    
    private int visits;
    private String name;

    public VisitorCounter(String name) {
        this.name = name;
        this.visits = 0;
        ++totalVisitors;
    }
    
    public void recordVisit() {
        visits++;
        System.out.println(name + " visited. Session visits: " + visits);
    }
    
    public static void displayTotalVisitors() {
        System.out.println("Total visitors today: " + totalVisitors);
    }
    
    public static int getTotalVisitors() {
        return totalVisitors;
    }

    public static void main(String[] args) {
        VisitorCounter visitor1 = new VisitorCounter("Hamilton");
        VisitorCounter visitor2 = new VisitorCounter("CharlesLeclerc");
        VisitorCounter visitor3 = new VisitorCounter("MarkWebber");
        
        VisitorCounter.displayTotalVisitors();
        
        System.out.println("\nRecordings:");
        visitor1.recordVisit();
        visitor1.recordVisit();
        
        visitor2.recordVisit();
        
        visitor3.recordVisit();
        visitor3.recordVisit();
        visitor3.recordVisit();
        
        System.out.println("\nFinal count:");
        VisitorCounter.displayTotalVisitors();

        System.out.println("\nSession visits:");
        System.out.println(visitor1.name + ": " + visitor1.visits + " visits");
        System.out.println(visitor2.name + ": " + visitor2.visits + " visits");
        System.out.println(visitor3.name + ": " + visitor3.visits + " visits");
    }
}