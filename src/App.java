
import java.util.Scanner;


public class App {

    public static int Factorial1(int k){
        if(k <= 1){
            return 1;
        }
        else{
            return k * Factorial1(k - 1);
        }
    }

    public static int Factorial2(int k){
        if(k <= 1){
            return 1;
        }
        else{
            return k * Factorial2(k - 1);
        }
    }
    

    public static void main(String[] args) throws Exception {
        // series 1 : 1! + 2! + . . . n! takes only one input
        Scanner s = new Scanner(System.in);
        int sum = 1;
        System.out.println("Enter the number");
        int n = s.nextInt();
        for (int i = 1; i < n; i++) {
            sum = sum+Factorial1(i);
        }
        System.out.println(sum);
    }
}
