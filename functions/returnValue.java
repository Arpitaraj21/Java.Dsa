import java.util.Scanner;

public class returnValue {
    public static void main(String[] args) {
        int val = Value();
        System.out.println(val);
    }
    static int Value(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        return n;
    }
}