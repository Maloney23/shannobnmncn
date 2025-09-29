import java.util.Scanner;

public class CricketRunsApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define arrays for data storage
        String[] stadiums = {"KINGSMEAD", "ST GEORGES", "WANDERERS"};
        String[] batsmen = {"Jacques Kallis", "Hashim Amla", "AB de Villiers"};
        int[][] runs = new int[3][3]; // [stadiums][batsmen]

        System.out.println("SA CRICKETER APPLICATION");
        System.out.println("------------------------");

        // Collect input data
        for (int i = 0; i < stadiums.length; i++) {
            for (int j = 0; j < batsmen.length; j++) {
                System.out.print("Enter the number runs scored by " + batsmen[j] + " at " + stadiums[i] + ": ");
                runs[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        // Display Runs Scored Report
        System.out.println("RUNS SCORED REPORT");
        System.out.println("==================");

        for (int j = 0; j < batsmen.length; j++) {
            for (int i = 0; i < stadiums.length; i++) {
                System.out.println(batsmen[j] + " runs scored at " + stadiums[i] + ": " + runs[i][j]);
            }
            System.out.println();
        }

        // Calculate and display total runs per stadium
        System.out.println("TOTAL RUNS AT STADIUMS");
        System.out.println("======================");

        int[] stadiumTotals = new int[3];
        int maxRuns = 0;
        String stadiumWithMostRuns = "";

        for (int i = 0; i < stadiums.length; i++) {
            int total = 0;
            for (int j = 0; j < batsmen.length; j++) {
                total += runs[i][j];
            }
            stadiumTotals[i] = total;
            System.out.println(stadiums[i] + "\t" + total);

            // Find stadium with most runs
            if (total > maxRuns)
        }
    }