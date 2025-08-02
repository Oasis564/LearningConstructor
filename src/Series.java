
import java.util.Scanner;

public class Series {
    //the below function has the same name as the class so that is why it is a constructor

    // series 1 : 1! + 2! + . . . n! takes only one input
    public Series(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            int fact = Factorial(i);
            System.out.println("The series 1 factorial of " + i + " is " + fact + ".");
            sum = sum + fact;
        }
        System.out.println(sum);

    }

    public Series(int n, int x) {
        int sum = 0;

        for (int i = 1; i < n; i++) {
            int fact = Factorial(i);
            int pow = (int) Math.pow(x, 2);
            int fp = fact / pow;
            System.out.println("The series 2 factorial of " + i + " is " + fact + ".");
            sum = sum + fp;
        }

        System.out.println(sum);

    }

    public Series(int n, int x, int k) {
        float sum = 0;

        for (int i = 1; i <= n; i++) {
            int fact = Factorial(i);
            float pow = (float) Math.pow(x, k);
            float fp = fact / pow;
            System.out.println("The series 3 factorial of " + i + " is " + fact + ", " + "FP is " + fp + "." + ", and the power is " + pow + ", the factorial is " + fact + ".");
            sum = sum + fp;
        }

        System.out.println(sum);

    }

    public static int Factorial(int k) {
        if (k <= 1) {
            return 1;
        } else {
            return k * Factorial(k - 1);
        }
    }

    public static void main(String[] args) {

        // series 2: 1!/x + 2!/x^2 + 3!/x^3 . . . n!/x^n. takes two inputs 
        // series 3: 1!/x^k + 2!/x^k + 3!/x^k . . . n!/x^k. takes three inputs.
        Scanner s = new Scanner(System.in);
        System.out.println("Choose Series 1, Series 2, Series 3");
        System.out.println("series 1 : 1! + 2! + . . . n!");
        System.out.println("series 2: 1!/x + 2!/x^2 + 3!/x^3 . . . n!/x^n.");
        System.out.println("series 3: 1!/x^k + 2!/x^k + 3!/x^k . . . n!/x^k.");

        int choice = s.nextInt();

        if (choice == 1) {
            //create an object of series with one parameter
            System.out.println("Enter the series 1 number");
            int n = s.nextInt();
            Series s1 = new Series(n);
        } else if (choice == 2) {
            System.out.println("Enter the factorial");
            int n = s.nextInt();
            System.out.println("Enter the power");
            int x = s.nextInt();
            Series s2 = new Series(n, x);
        } else if (choice == 3) {
            System.out.println("Enter the factorial number first");
            int n = s.nextInt();
            System.out.println("Enter the first number for the power");
            int x = s.nextInt();
            System.out.println("Enter the second number for the power");
            int k = s.nextInt();
            Series s3 = new Series(n, x, k);
        }
        else{
            System.out.println("Cant go past 3");
        }
    }
}
