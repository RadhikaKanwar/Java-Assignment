import java.util.*;

public class PS5Task {
    public static void TreasureMap(Scanner sc) {
        System.out.print("Enter the number of elements in the array: ");
        int num = sc.nextInt();

        System.out.println("Enter the elements in the array: ");
        int[] arr = new int[num];
        for (int i=0;i<num;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int element = sc.nextInt();

        int index = -1;

        for (int i=0;i<num;i++) {
            if (arr[i] == element) {
                index = i;
            }
        }

        if (index == -1) {
            System.out.println("\nElement not found!");
        } else {
            System.out.println("\nThe number is present at index " + index);
        }
        
        if (isPrime(index)) {
            System.out.println("Prime index!");
        } else {
            System.out.println("No possibility of finding treasure!");
        }
    }        

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int j=2; j*j <= n;j++) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static void LostScrolls(Scanner sc) {
        System.out.print("Enter the number of elements in the array-1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the elements in the array-1: ");
        int[] arr1 = new int[num1];
        for (int i=0;i<num1;i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Elemets of array-1: " + Arrays.toString(arr1));

        System.out.print("\nEnter the number of elements in the array-2: ");
        int num2 = sc.nextInt();

        System.out.println("Enter the elements in the array-2: ");
        int[] arr2 = new int[num2];
        for (int i=0;i<num2;i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println("Elemets of array-2: " + Arrays.toString(arr2));

        int[] merged = new int[num1+num2];
        System.arraycopy(arr1, 0, merged, 0, arr1.length);
        System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);

        Integer[] array = Arrays.stream(merged).boxed().toArray(Integer[]::new);
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("\nMerged and Sorted Array: " + Arrays.toString(array));

        ArrayList<Integer> rareGems = new ArrayList<>();
        for (int num: array) {
            if (isPalindrome(num)) {
                rareGems.add(num);
            }
        }

        if (rareGems.size() == 0) {
            System.out.println("\nNo rare gems are present in the array!");
        } else {
            System.out.println("Rare Gems: " + rareGems);
        }
    }

    public static boolean isPalindrome(int num) {
        long temp = num;
        long rev = 0;

        while (temp != 0) {
            long digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }

        if (num == rev) {
            return true;
        } else {
            return false;
        }
    }

    public static void printJaggedArray(int arr[][]) {
        for (int[]row : arr) {
            for (int ele: row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

    public static int[][] EnigmaPatterns(Scanner sc) {
        System.out.print("Enter the number of rows in the jagged array: ");
        int rows = sc.nextInt();
        int[][] array = new int[rows][];

        for (int i=0;i<rows;i++) {
            System.out.print("Enter the number of columns in row-" + (i+1) + ": ");
            int col = sc.nextInt();
            array[i] = new int[col];
            System.out.println("Enter the elements of row-"+ (i+1) + ": ");
            for (int j=0;j<col;j++) {
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("Jagged array: ");
        printJaggedArray(array);

        String message = decipherPattern(array);
        System.out.println("The deciphered code: " + message);

        return array;
    }

    public static String decipherPattern(int[][] pattern) {
        StringBuilder decipheredMessage = new StringBuilder();
    
        for (int i = 0; i < pattern.length; i++) {
            int rowSum = 0;
            for (int num : pattern[i]) {
                rowSum += num;
            }
            char decodedChar = (char) ('A' + (rowSum - 1) % 26);
            decipheredMessage.append(decodedChar);
        }
    
        return decipheredMessage.toString();
    }
    

    public static void SecondEnigma(Scanner sc, int arr[][]) {
        System.out.print("\nEnter the number of rows in the jagged array: ");
        int rows = sc.nextInt();
        int[][] array = new int[rows][];

        for (int i=0;i<rows;i++) {
            System.out.print("Enter the number of columns in row-" + (i+1) + ": ");
            int col = sc.nextInt();
            array[i] = new int[col];
            System.out.println("Enter the elements of row-"+ (i+1) + ": ");
            for (int j=0;j<col;j++) {
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("Jagged array: ");
        printJaggedArray(array);

        boolean result = comparePatterns(arr, array);
        if (result) {
            System.out.println("\nThe two patterns are similar!");
        } else {
            System.out.println("\nThere is no similarity between the patterns!");
        }
    }

    public static boolean comparePatterns(int[][] pattern1, int[][] pattern2) {
        for (int i = 0; i < pattern1.length; i++) {
            if (!Arrays.equals(pattern1[i], pattern2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void CipherCracker(Scanner sc) {
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int numDigits = (int) Math.log10(num) + 1;

        System.out.print("Enter the number of last digits for addition: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of first didgits for multiplication: ");
        int m = sc.nextInt();

        int sum = 0;
        int addDigits = num % (int)Math.pow(10, n);
        System.out.println("\nThe last " + n + " digits: " + addDigits);
        while (addDigits != 0) {
            sum += (addDigits%10);
            addDigits /= 10;
        }
        System.out.println("The sum of last " + n + " digits = " + sum); 

        int product = 1;
        int divisor = (int)Math.pow(10,numDigits-m);
        int multiplyDigits = num/divisor;
        System.out.println("\nThe first " + m + " digits: " + multiplyDigits);
        while (multiplyDigits != 0) {
            product *= (multiplyDigits%10);
            multiplyDigits /= 10;
        }
        System.out.println("The product of first " + m + " digits = " + product); 

        // difference between the produt and sum is the secret code
        System.out.println("Secret code = " + (product - sum));
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
                    int[][] arr = EnigmaPatterns(sc);
                    SecondEnigma(sc, arr);
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
