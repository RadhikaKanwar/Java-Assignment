import java.util.*;

public class PS0Task {

    public static void InputBookDetails(Scanner sc) {
        System.out.print("Enter the ISBN: ");
        long isbn = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter the Title of the book: ");
        String title = sc.nextLine();
        System.out.print("Emter the Author of the book: ");
        String author = sc.nextLine();
        System.out.print("Enter the price of the book: ");
        double price = sc.nextDouble();
        System.out.println("\nBook Details:");
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs." + price);
    }

    public static void checkAvailabilityAndIssueBooks(Scanner sc) {
        System.out.print("Enter the ISBN of the book to be issued: ");
        long isbn = sc.nextLong();

        boolean isAvailable = checkAvailability(isbn);
        if (isAvailable) {
            System.out.println("The book is available!");
            updateAvailabilityStatus(isbn, false);
        } else {
            System.out.println("The book is not available!");
        }
    }

    public static boolean checkAvailability(long isbn) {
        // checking the availability for the book in the database
        return true;
    }

    public static void ReturnBook(Scanner sc) {
        System.out.print("Enter the ISBN of the book to be returned: ");
        long isbn = sc.nextLong();
        updateAvailabilityStatus(isbn, true);
        double lateFees = calculateLateFees(isbn);
        System.out.println("Book returned.\nLate fees: Rs." + lateFees);
        System.out.println("");
    }

    private static void updateAvailabilityStatus(long isbn, boolean returned) {
        // updating availability status in a database
    }

    private static double calculateLateFees(long isbn) {
        // calculating late fees if the book is returned after due date
        return 0.0;
    }

    public static void TemperatureConversion(Scanner sc) {
        System.out.print("Enter the temperature in Fahrenheit: ");
        double temp = sc.nextDouble();
        double celsius = toCelsius(temp);
        System.out.printf("Temperature in Celsius: %.2f celsius",celsius);
        suggestHVACSettings(celsius);
    }

    public static double toCelsius(double temp) {
        return (temp - 32) * 5 / 9;
    }

    public static void suggestHVACSettings(double temp) {
        if (temp < 18) {
            System.out.println("\nTurn on heating.");
        } else if (temp >= 18 && temp <= 25) {
            System.out.println("\nMaintain current temperature.");
        } else {
            System.out.println("\nTurn on air conditioning.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Greeting the librarian
        System.out.println("\n----- Welcome to Shoolini's Library Management System -----");
        
        int choice;
        do { 
 
            System.out.println("\nSelect the program you want to execute: ");
            System.out.println("1. Input Book Details");
            System.out.println("2. Check Availability and Issue Books");
            System.out.println("3. Return Book");
            System.out.println("4. Temperature Conversion in Library HVAC System");
            System.out.println("5. Exit\n");

            System.out.print("Choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    InputBookDetails(sc);
                    break;
            
                case 2:
                    checkAvailabilityAndIssueBooks(sc);
                    break;
            
                case 3:
                    ReturnBook(sc);
                    break;
            
                case 4:
                    TemperatureConversion(sc);
                    break;
            
                case 5:
                    System.out.println("Adios!");
                    sc.close();
                    System.exit(0);
            
                default:
                System.out.println("Invalid choice! Enter a valid option.");
                break;
            }
        } while (choice != 5);
    }
}