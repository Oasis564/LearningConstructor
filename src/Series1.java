
import java.util.Scanner;


public class Series1 {

    public static int Factorial(int k){
        if(k <= 1){
            return 1;
        }
        else{
            return k * Factorial(k - 1);
        }
    }

    


    public static void main(String[] args) throws Exception {
        // series 1 : 1! + 2! + . . . n! takes only one input

        // series 2: 1!/x + 2!/x^2 + 3!/x^3 . . . n!/x^n. takes two inputs 
        // series 3: 1!/x^k + 2!/x^k + 3!/x^k . . . n!/x^k. takes three inputs.
        Scanner s = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the series 1 number");
        int n = s.nextInt();
        for (int i = 1; i < n; i++) {
            int fact = Factorial(i);
            System.out.println("The series 1 factorial of "+i+" is "+fact+".");
            sum = sum+fact;
        }
        System.out.println(sum);

    }
}
