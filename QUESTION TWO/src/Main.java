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
