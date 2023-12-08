import java.util.*;

public class PS3Task {

    public static void DecipherAmpersandStar(Scanner sc) {
        System.out.print("Enter the pattern (@ and *): ");
        sc.nextLine();
        String str = sc.nextLine();
        int len = str.length();

        StringBuilder rev = new StringBuilder();
        for (int i=0;i<len;i++) {
            if (str.charAt(i) == '@') {
                rev.append('*');
            }
            if (str.charAt(i) == '*') {
                rev.append('@');
            }
        }

        System.out.println("Modified Pattern: " + rev); 
    }

    public static void DecodeColoredBlocks(Scanner sc) {
        System.out.println("Enter the characters representing the colored blocks (VIBGYORW): ");
        sc.nextLine();
        String coloredBlock = sc.nextLine();
        System.out.print("Decoded Color Pattern: ");
        int len = coloredBlock.length();
        for (int i=0;i<len;i++) {
            ColorNames(coloredBlock.charAt(i));
        }
        System.out.println();   
    }

    public static void ColorNames(char ch) {
        switch(ch) {
            case 'V':
            case 'v':
                System.out.print("Violet ");
                break;

            case 'I':
            case 'i':
                System.out.print("Indigo ");
                break;

            case 'B':
            case 'b':
                System.out.print("Blue ");
                break;
            
            case 'G':
            case 'g':
                System.out.print("Green ");
                break;
            
            case 'Y':
            case 'y':
                System.out.print("Yellow ");
                break;
            
            case 'O':
            case 'o':
                System.out.print("Orange ");
                break;
            
            case 'R':
            case 'r':
                System.out.print("Red ");
                break;
            
            case 'W':
            case 'w':
                System.out.print("White ");
                break;

            default:
                System.out.print("Invalid Color Code! ");
                break;
        }
    }

    public static void ReverseEngineerPalindromes(Scanner sc) {
        System.out.print("Enter the number: ");
        long num = sc.nextLong();
        long temp = num;
        long rev = 0;

        while (temp != 0) {
            long digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }

        if (num == rev) {
            System.out.println(num + " is a palindrome.");
            System.out.println("Key Code!");
        } else {
            System.out.println(num + " is not a palindrome.");
            System.out.println("Unsafe for Operation!");
        }
    }

    public static void DoubleAgentCheck(Scanner sc) {
        System.out.print("Enter the number: ");
        double num = sc.nextDouble();

        if (num == (int)num) {
            System.out.println("\nEntered double value is an integer.");
            System.out.println("Safe for Operation!");
        } else {
            System.out.println("\nEntered double value is not an integer.");
            System.out.println("Unsafe for Operation!");
        }
    }

    public static void GlobalUnitConverter(Scanner sc) {
        int flag = 1;
        sc.nextLine();
        System.out.print("Enter the value with unit (1 km or 1 m): ");
        String value = sc.nextLine();
        
        String[] values = value.split(" ");
        double val =  Double.parseDouble(values[0]);
        String unit = values[1];

        if (unit.equals("km")) {
            double result = val/1.602;
            System.out.println(val + " km = " + result + " miles");
        } else if (unit.equals("m")) {
            double result = val * 1.602;
            System.out.println(val + " miles = " + result + " km");
        }   else {
            flag = 0;
            System.out.println("Invalid unit!");
        }

        if (flag == 1) {
            if (val >= 0 && val <=5000) {
                System.out.println("Operationally viable!");
            } else {
                System.out.println("Not operationally viable!");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        do { 
 
            System.out.println("\nSelect the program you want to execute: ");
            System.out.println("1. Decipher the '@' and '*' Pattern");
            System.out.println("2. Decode Colored Blocks");
            System.out.println("3. Reverse Engineer Palindromes");
            System.out.println("4. Double Agent Checker");
            System.out.println("5. Global Unit Converter");
            System.out.println("6. Exit\n");

            System.out.print("Choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    DecipherAmpersandStar(sc);
                    break;
            
                case 2:
                    DecodeColoredBlocks(sc);
                    break;
            
                case 3:
                    ReverseEngineerPalindromes(sc);
                    break;
            
                case 4:
                    DoubleAgentCheck(sc);
                    break;
            
                case 5:
                    GlobalUnitConverter(sc);
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
