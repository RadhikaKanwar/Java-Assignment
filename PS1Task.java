import java.util.*;

public class PS1Task {
    
    static double G = 6.67408e-11;
    // Gravitational constant

    public static void CalculateEscapeVelocity(Scanner sc) {
        System.out.print("\nEnter the mass of the planet (kg): ");
        double mass = sc.nextDouble();
        System.out.print("Enter the radius of the planet (m): ");
        double radius = sc.nextDouble();
        double escapeVelocity = Math.sqrt((2 * G * mass)/ radius);
        System.out.printf("Escape velocity: %.2f m/s\n", escapeVelocity);
    }

    public static void OxygenAvailabilityCheck(Scanner sc) {
        System.out.print("Enter the atmospheric pressure (kPa): ");
        double atmosphericPressure = sc.nextDouble();
        System.out.print("Enter the oxygen percentage: ");
        double oxygenPercentage = sc.nextDouble();
        double partialPressure = atmosphericPressure * (oxygenPercentage/100);
        System.out.printf("Partial pressure of Oxygen in atmosphere: %.2f kPa\n",partialPressure);

        if (partialPressure >= 16.0) {
            System.out.println("Oxygen level is sufficient for humans.");
        } else {
            System.out.println("Oxygen level is not sufficient for humans.");
        }

    }

    public static void ThrusterCheck(Scanner sc) {
        System.out.print("Enter the current speed (m/s): ");
        double currentSpeed = sc.nextDouble();
        System.out.print("Enter the desired speed (m/s): ");
        double desiredSpeed = sc.nextDouble();
        
        if (currentSpeed < desiredSpeed) {
            System.out.println("Activate thrusters to speed up.");
        } else if (currentSpeed > desiredSpeed) {
            System.out.println("Activate thrusters to slow down.");
        } else {
            System.out.println("Maintain current speed, no thrusters needed.");;
        }
    }

    public static void CalculateOrbitalPeriod(Scanner sc) {
        System.out.print("Enter semi-major axis of the orbit (m): ");
        double semiMajorAxis = sc.nextDouble();
        System.out.print("Enter mass of the primary body (kg): ");
        double mass1 = sc.nextDouble();
        System.out.print("Enter mass of the smaller object (kg): ");
        double mass2 = sc.nextDouble();

        double orbitalPeriod = 2 * Math.PI * Math.sqrt(Math.pow(semiMajorAxis, 3) / (G * (mass1 + mass2)));
        System.out.printf("Orbital Period: %.2f seconds\n", orbitalPeriod);
    }

    public static void StarMap(Scanner sc) {
        System.out.print("Enter the number of celestial bodies to map: ");
        int numCelestialBodies = sc.nextInt();

        Random random = new Random();
        System.out.println("\nStar Map:");
        for (int i = 1; i<=numCelestialBodies; i++) {
            // considering the dimensions of space to be 500 X 500
            int x = random.nextInt(500);
            int y = random.nextInt(500);
            System.out.println("Co-ordinates of Celestial body-" + i + ": (" + x + ", " + y + ")");
        }

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
            System.out.println("6. Exit\n");

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
