import java.util.Scanner;

public class PS5Task {
    public static void TreasureMap(Scanner sc) {

    }

    public static void LostScrolls(Scanner sc) {

    }

    public static void EnigmaPatterns(Scanner sc) {

    }

    public static void SecondEnigma(Scanner sc) {

    }

    public static void CipherCracker(Scanner sc) {

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        do { 
 
            System.out.println("\nSelect the program you want to execute: ");
            System.out.println("1. The Treasure Map");
            System.out.println("2. The Lost Scrolls");
            System.out.println("3. The Enigma Pattern");
            System.out.println("4. The Second Enigma");
            System.out.println("5. The Cipher Cracker");
            System.out.println("6. Exit\n");

            System.out.print("Choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    TreasureMap(sc);
                    break;
            
                case 2:
                    LostScrolls(sc);
                    break;
            
                case 3:
                    EnigmaPatterns(sc);
                    break;
            
                case 4:
                    SecondEnigma(sc);;
                    break;
            
                case 5:
                    CipherCracker(sc);
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
