
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