import java.util.Scanner;

public class periRect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float l = sc.nextInt();
        float b = sc.nextInt();

        double perimeter = l * b;

        System.out.println("perimeter of reactangle is: " +perimeter);
    }
}