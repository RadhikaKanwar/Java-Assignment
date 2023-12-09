import java.util.*;

public class PS4Task {

    public static void PrimeNumberDetector(Scanner sc) {
        System.out.print("Enter the lower limit of the range: ");
        int start = sc.nextInt();
        System.out.print("Enter the upper limit of the range: ");
        int end = sc.nextInt();

        ArrayList<Integer> prime = new ArrayList<>();
        for (int i=start; i<=end; i++) {
            if (isPrime(i)) {
                prime.add(i);
            }
        }

        System.out.println("Prime Numbers in the range: " + prime);

        ArrayList<Integer> quantumPrime = new ArrayList<>();

        for (int num: prime) {
            if (Math.sqrt(num+1) == (int)Math.sqrt(num+1)) {
                quantumPrime.add(num);
            }
        }
        System.out.println("Quantum Prime Numbers: " + quantumPrime);
        System.out.println();
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

    public static void QuantumSimilarity(Scanner sc) {
        System.out.println("Enter the three numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int similar = (n1 == n2 || n2 == n3 || n3 == n1)? 1:0;

        if (similar == 1) {
            System.out.println("Quantum Entangled Pair is presesnt!");
        } else {
            System.out.println("Quantum Entangled Pair is not presesnt!");
        }
    }

    public static void ZeroSequenceFinder(Scanner sc) {
        System.out.print("Enter the number to check the the find the longest sequence of zeros: ");
        int number = sc.nextInt();
        int count = 0, maxCount = 0;
        // looping through each bit of the number
        while (number > 0) {
            if ((number & 1) == 0) {
                count++;
                maxCount = Math.max(count, maxCount);
            }
            else {
                count = 0;
                // reset the count if 1 is found
            }
            
            number >>=1;
        }

        System.out.println("Longest sequence of zeros in the number = " + maxCount); 

        // assuming even number of zeros as Quantum Stable
        if (maxCount % 2 == 0) {
            System.out.println("Quantum Stable Number!");
        } else {
            System.out.println("Quantum Unstable Number!");
        }
    }


    public static void ArrayAnalyzer(Scanner sc) {
        System.out.print("Enter the number of elements in the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        double total = 0.0;

        System.out.println("Enter the elements of the array: ");
        for (int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        double average = total/size;
        boolean isQuantum = true;

        for (int num:arr) {
            if (num % average != 0) {
                isQuantum = false;
                break;
            }
        }

        if ((int)average == average && isQuantum) {
            System.out.println("Quantum Elements are present!");
        } else {
            System.out.println("No Quantum Elements!");
        }

    }

    public static void  SortingQuantum(Scanner sc) {
        System.out.print("Enter the number of elements in the numerical array: ");
        int num1 = sc.nextInt();
        ArrayList<Integer> numericalArray = new ArrayList<>();
        System.out.println("Enter the elements in the array: ");
        for (int i=0;i<num1;i++) {
            numericalArray.add(sc.nextInt());
        }

        System.out.println("Numerical array: " + numericalArray);
        numericalArray.sort(null);
        System.out.println("Sorted numerical array: " + numericalArray);

        System.out.print("\nEnter the number of elements in the string array: ");
        int num2 = sc.nextInt();
        sc.nextLine();
        ArrayList<String> stringArray = new ArrayList<>();
        System.out.println("Enter the elements in the array: ");
        for (int i=0;i<num2;i++) {
            stringArray.add(sc.nextLine());
        }

        System.out.println("String Array: " + stringArray);
        stringArray.sort(null);
        System.out.println("Sorted string Array: " + stringArray);

        int flag = 1;
        int length = 0;
        
        if (num1 != num2) {
            System.out.println("\nNot suitable for Quantum Encryption!");
            System.exit(0);
        } else {
            for (int i=0;i<num1;i++) {
                length = (stringArray.get(i)).length();
                if (length != numericalArray.get(i)) {
                    flag = 0;
                    System.out.println("\nNot suitable for Quantum Encryption!");
                    break;
                }
            }
        }

        if (flag == 1) 
            System.out.println("\nSuitable for Quantum Encryption!");
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
                    ZeroSequenceFinder(sc);
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
