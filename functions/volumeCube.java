import java.util.Scanner;

public class volumeCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextInt();

        double vol = a * a * a ;
        System.out.println(vol);
    }
}