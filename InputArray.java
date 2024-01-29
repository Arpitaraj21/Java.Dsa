import java.util.Scanner;
import java.util.Arrays;

public class InputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

//        int[] array = new int[5];
//        int[] array = { 1, 2, 4 ,8 ,9};
//        System.out.println(array[0]);

//        input using for loops

//        for(int i = 0; i < arr.length ; i++){
//            arr[i] = sc.nextInt();
//        }

        String [] str = new String[5];

        for(int i = 0; i <str.length ; i++){
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));

//        modify

        str[1]= "Arpita";
        System.out.println(Arrays.toString(str));
    }
}
