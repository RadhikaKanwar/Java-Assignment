import java.util.*;

public class PS4Task {

    public static void PrimeNumberDetector(Scanner sc) {

    }

    public static void QuantumSimilarity(Scanner sc) {

    }

    public static void ZeroSequence(Scanner sc) {

    }

    public static void ArrayAnalyzer(Scanner sc) {

    }

    public static void  SortingQuantum(Scanner sc) {

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        do { 
 
            System.out.println("\nSelect the program you want to execute: ");
            System.out.println("1. Prime Number Detector");
            System.out.println("2. Quantum Similarity");
            System.out.println("3. Zero Sequence in Binary");
            System.out.println("4. Array Analyzer");
            System.out.println("5. Sorting Quantum Data");
            System.out.println("6. Exit\n");

            System.out.print("Choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    PrimeNumberDetector(sc);
                    break;
            
                case 2:
                    QuantumSimilarity(sc);
                    break;
            
                case 3:
                    ZeroSequence(sc);
                    break;
            
                case 4:
                    ArrayAnalyzer(sc);
                    break;
            
                case 5:
                    SortingQuantum(sc);
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

        sc.close();
    }
}
