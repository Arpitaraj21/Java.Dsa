import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if( n < 0){
            System.out.println("enter a valid number");
        }
        else{
            long factorial = 1;

            for (int i = 1 ; i <= n ; i++){
                factorial = factorial * i;
            }
            System.out.println("the factorial of  " + n + "is " + factorial);
        }
    }
}