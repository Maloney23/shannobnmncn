
// ICricket interface
public interface ICricket {
    String getBatsman();
    String getStadium();
    int getRunsScored();
}

// Abstract Cricket class
abstract class Cricket implements ICricket {
    private String batsmanName;
    private String stadiumName;
    private int totalRuns;

    // Constructor
    public Cricket(String batsmanName, String stadiumName, int totalRuns) {
        this.batsmanName = batsmanName;
        this.stadiumName = stadiumName;
        this.totalRuns = totalRuns;
    }

    // Implement interface methods
    @Override
    public String getBatsman() {
        return batsmanName;
    }

    @Override
    public String getStadium() {
        return stadiumName;
    }

    @Override
    public int getRunsScored() {
        return totalRuns;
    }
}

// CricketRunsScored subclass
class CricketRunsScored extends Cricket {

    // Constructor
    public CricketRunsScored(String batsmanName, String stadiumName, int totalRuns) {
        super(batsmanName, stadiumName, totalRuns);
    }

    // Method to print the report
    public void printReport() {
        System.out.println("BATSMAN RUNS SCORED REPORT");
        System.out.println("+++++++++++++++++++");
        System.out.println("CRICKET PLAYER: " + getBatsman());
        System.out.println("STADIUM: " + getStadium());
        System.out.println("TOTAL RUNS SCORED: " + getRunsScored());
    }
}

// RunApplication class
public class RunApplication {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Collect user input
        System.out.print("Enter the cricketer name: ");
        String batsmanName = scanner.nextLine();

        System.out.print("Enter the stadium: ");
        String stadiumName = scanner.nextLine();

        System.out.print("Enter the total runs scored by " + batsmanName + " at " + stadiumName + ": ");
        int totalRuns = scanner.nextInt();

        // Create CricketRunsScored object
        CricketRunsScored cricketReport = new CricketRunsScored(batsmanName, stadiumName, totalRuns);

        // Print the report
        System.out.println();
        cricketReport.printReport();

        scanner.close();
    }
}
