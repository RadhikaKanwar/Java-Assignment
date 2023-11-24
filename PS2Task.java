import java.util.*;

public class PS2Task {

    public static void IncrementalNumberSequence(Scanner sc) {

    }

    public static void RepeatedNumberPattern(Scanner sc)  {

    }

    public static void StarDiamond(Scanner sc) {

    }

    public static void NumberPyramid(Scanner sc) {

    }

    public static void MixedNumberPattern(Scanner sc) {

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        do { 
 
            System.out.println("\nSelect the program you want to execute: ");
            System.out.println("1. Generate Incremental Number Sequence");
            System.out.println("2. Visuslize Repeated Number Pattern");
            System.out.println("3. Create a Star Diamond");
            System.out.println("4. Construct a Number Pyramid");
            System.out.println("5. Create a Mixed Number Pattern");
            System.out.println("6. Exit");

            choice = sc.nextInt();

            switch(choice) {
                case 1:
                break;
            
                case 2:
                break;
            
                case 3:
                
                break;
            
                case 4:
                break;
            
                case 5:
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
