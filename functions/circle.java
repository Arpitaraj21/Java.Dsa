import java.util.Scanner;

public class circle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r = sc.nextInt();

        double area = 2 * 3.14 * r;
        System.out.println("area of cicle " +area);
    }
}