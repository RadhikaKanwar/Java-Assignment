import java.util.*;

public class PS0Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Shoolini's Library Management System");
        
        int choice;
        do { 
 
            System.out.println("\nSelect the program you want to execute: ");
            System.out.println("1. Input Book Details");
            System.out.println("2. Check Availability and Issue Books");
            System.out.println("3. Return Book");
            System.out.println("4. Temperature Conversion in Library HVAC System");
            System.out.println("5. Exit");

            choice = sc.nextInt();

            switch(choice) {
                case 1:
                {

                }
                break;
            
                case 2:
                {

                }
                break;
            
                case 3:
                {

                }
                break;
            
                case 4:
                {

                }
                break;
            
                case 5:
                break;
            
                default:
                System.out.println("Invalid choice! Enter a valid option.");
                break;
            }
        } while (choice != 5);

        sc.close();
    }
}