import java.util.*;

public class PS2Task {

    public static void IncrementalNumberSequence(Scanner sc) {
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println();
        for(int i=1;i<=rows;i++) {
            int counter = 1;
            for (int j=1;j<=i;j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void RepeatedNumberPattern(Scanner sc)  {
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println();
        for(int i=1;i<=rows;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void StarDiamond(Scanner sc) {
        System.out.print("Enter the number of rows in the diamond: ");
        int rows = sc.nextInt();
        System.out.println();
        int num = (rows+1)/2;
        
        // upper triangle
        for(int i=1;i<=num;i++){
            // leading spaces
            for(int k=num-i;k>0;k--) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("* " );
            }
            System.out.println();
        }

        // bottom triangle
        for(int i=num-1;i>=1;i--){
            // leading spaces
            for(int k=num-i;k>0;k--) {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--) {
                System.out.print("* " );
            }
            System.out.println();
        }
    }

    public static void NumberPyramid(Scanner sc) {
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println();
        int counter = 1;
        for(int i=1;i<=rows;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void MixedNumberPattern(Scanner sc) {
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println();
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
            System.out.println("6. Exit\n");

            System.out.print("Choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    IncrementalNumberSequence(sc);    
                    break;
            
                case 2:
                    RepeatedNumberPattern(sc);
                    break;
            
                case 3:
                    StarDiamond(sc);
                    break;
            
                case 4:
                    NumberPyramid(sc);
                    break;
            
                case 5:
                    MixedNumberPattern(sc);
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
