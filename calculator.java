import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ans = 0;
        while(true){
            System.out.println("enter the operator: ");
            char op = in.next().trim().charAt(0);
            System.out.println();

            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                int num1 = in.nextInt();
                int num2 = in.nextInt();

            if(op == '+'){
                ans = num1 + num2;
            }
            if(op == '-'){
                    ans = num1 - num2;
                }
            if(op == '*'){
                    ans = num1 * num2;
                }
            if(op == '/'){
                    ans = num1 / num2;
                }
            if(op == '%'){
                    ans = num1 % num2;
                }
            }
            else if ( op == 'x' || op == 'X'){
                break;
            }
            else{
                System.out.println("enter a valid operator");
            }
        }
    }
}