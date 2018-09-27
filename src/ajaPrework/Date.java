

package ajaPrework;


import java.util.Scanner; //  user input.
import java.time.LocalDate; // Import LocalDate
import java.time.Period;  // Import Period

public class Date {

    // main method.
    public static void main(String[] args) {
 {
	
}
    
        //  date 1 input 
        System.out.print("Enter Date1 in YYYY-MM-DD format: ");

        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);
        
        String oldestDateString = scanner.nextLine();

        LocalDate oldestDate = LocalDate.parse(oldestDateString);

        System.out.println("Date1 " + oldestDate );
        System.out.print("Enter Date2 in  YYYY-MM-DD format: ");

        String newestDateString = scanner.nextLine();
        LocalDate newestDate = LocalDate.parse(newestDateString);
        System.out.println("Date 2 " +  newestDate );

        Period difference = oldestDate.until(newestDate);

        int days = difference.getDays();
        int months = difference.getMonths();
        int years = difference.getYears();
        scanner.close();

        System.out.println( months + " Months, " + days + " Days, and " + years + " Years.");
    }
}