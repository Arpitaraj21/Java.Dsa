import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n;
        int rev = 0;

        while(n > 0){
            int digit = n% 10;
            rev = 10 * rev + digit;
            n = n/10;
       }
        System.out.println(rev);

        if( rev == temp){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}