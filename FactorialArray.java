//Write a program which takes in 10 values and creates another array which has cubes of the values (or factorial) and prints it.


import java.util.Scanner;
import java.util.Arrays;

public class FactorialArray {
    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        int cube[] = new int[10];
        int[] arr = new int[10];
        System.out.println("enter 10 array elements: ");
        for( i=0 ; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for( j=0 ; j<arr.length ;j++){
            cube[j] = arr[j] * arr[j] * arr[j];
            System.out.print(cube[j] + " ");
        }
    }
}

