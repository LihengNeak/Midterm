package midterm;

import java.util.Scanner;

public class ShortDateConverter {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a short date (YYYY-MM-DD): ");
        String shortDate = scanner.nextLine();

        scanner.close();

        String[] dateParts = shortDate.split("-");
        int year = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int day = Integer.parseInt(dateParts[2]);

        // Convert month number to month name
        String monthName = getMonthName(month);

        System.out.println(monthName + " " + day + ", " + year);
    }

    private static String getMonthName(int month) {
        switch (month) {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return "Invalid Month";
        }
    }
}
