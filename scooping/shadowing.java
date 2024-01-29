import java.util.Scanner;

public class shadowing {
    static int a = 99;
    public static void main(String[] args) {
        System.out.println(a);
        int a = 10;
        System.out.println(a);
        fun();
    }
    static void fun(){
        System.out.println(a);
    }
}