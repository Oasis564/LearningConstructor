import java.util.Scanner;

public class Series3 {

    public static int Factorial(int k){
        if(k <= 1){
            return 1;
        }
        else{
            return k * Factorial(k - 1);
        }
    }

    public static void main(String[] args){
        // series 3: 1!/x^k + 2!/x^k + 3!/x^k . . . n!/x^k. takes three inputs.
        Scanner s = new Scanner(System.in);
       
        float sum = 0;

        System.out.println("Enter the factorial number first");
        int n = s.nextInt();
        System.out.println("Enter the first number for the power");
        int x = s.nextInt();
        System.out.println("Enter the second number for the power");
        int k = s.nextInt();
        for (int i = 1; i <= n; i++) {
            int fact = Factorial(i);
            float pow = (float) Math.pow(x, k);
            float fp = fact/pow;
            System.out.println("The series 3 factorial of "+i+" is "+fact+", " + "FP is "+fp+"."+", and the power is "+pow+", the factorial is "+fact+".");
            sum = sum + fp;
        }

        System.out.println(sum);
    }
}
