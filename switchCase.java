import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

        switch(fruit){
            case "Mango" -> System.out.println("king of the fruit");
            case "Apple" -> System.out.println("king of the ");
            case "Orange" -> System.out.println("king of ");
            case "Grape" -> System.out.println("king ");
            case "default" -> System.out.println("invalid");

        }
    }
}