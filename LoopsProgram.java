import java.util.Scanner;

public class LoopsProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Factorial Program
        System.out.print("Enter a number to find factorial: ");
        int num = sc.nextInt();

        long factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + num + " = " + factorial);

        // Prime Number Check
        System.out.print("Enter a number to check prime: ");
        int n = sc.nextInt();

        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " is a Prime Number.");
        } else {
            System.out.println(n + " is not a Prime Number.");
        }

        sc.close();
    }
}
