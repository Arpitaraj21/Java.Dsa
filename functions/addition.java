import java.util.Scanner;

public class addition {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println(ans);
    }
    static int sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number 1");
        int a = sc.nextInt();
        System.out.println("enter a number 2");
        int b = sc.nextInt();

        int sumation = a + b;
        return sumation;
    }
}