import java.util.Scanner;

public class SubAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int product = a *b;
        System.out.println("the product of two number is: "+product);
        int sum = a + b;
        System.out.println("the sum of the two number is: "+sum);

        int subtract = product - sum;
        System.out.println(subtract);
    }
}