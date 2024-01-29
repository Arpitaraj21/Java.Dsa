import java.util.Scanner;

public class triangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float l = sc.nextInt();
        float b = sc.nextInt();
        float h = sc.nextInt();

        double area = l * b * h;
        System.out.println("area of triangle " +area);
    }
}