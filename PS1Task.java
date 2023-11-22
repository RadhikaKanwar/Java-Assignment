import java.util.*;

public class PS1Task {

    public static void CalculateEscapeVelocity(Scanner sc) {

    }

    public static void OxygenAvailabilityCheck(Scanner sc) {
        
    }

    public static void ThrusterCheck(Scanner sc) {

    }

    public static void CalculateOrbitalPeriod(Scanner sc) {

    }

    public static void StarMap(Scanner sc) {

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        do { 
 
            System.out.println("\nSelect the program you want to execute: ");
            System.out.println("1. Calculate Escape Velocity");
            System.out.println("2. Oxygen Availability Check");
            System.out.println("3. Thruster Check");
            System.out.println("4. Calculate Orbital Period");
            System.out.println("5. Star Map");
            System.out.println("6. Exit");

            System.out.print("Choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    CalculateEscapeVelocity(sc);
                    break;
            
                case 2:
                    OxygenAvailabilityCheck(sc);
                    break;
            
                case 3:
                    ThrusterCheck(sc); 
                    break;
            
                case 4:
                    CalculateOrbitalPeriod(sc);
                    break;

                case 5:
                    StarMap(sc);
                    break;
            
                case 6:
                System.out.println("Adios!");
                sc.close();
                System.exit(0);
            
                default:
                System.out.println("Invalid choice! Enter a valid option.");
                break;
            }
        } while (choice != 6);
    }
}
