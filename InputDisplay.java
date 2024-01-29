//Write a program that creates integer array of 10 elements, accepts values of arrays and then displays the values

import java.util.Scanner;
import java.util.Arrays;

public class InputDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("enter 10 array elements: ");
        for(int i = 0 ; i <arr.length; i++){
            arr[i] = sc.nextInt();
            System.out.println(arr[i]);
        }
        for(int j = 0; j< arr.length; j++){
            System.out.println(arr[j]);
        }
    }
}
