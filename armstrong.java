import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while ( n > 0){
            int rem = n % 10;
            n = n/10;
            sum = sum + rem * rem * rem;

        }
        System.out.println(sum);
        if (temp == sum){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not armstrong");
        }
    }
}