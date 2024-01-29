//Write a program that creates integer array of 10 elements, accepts values of arrays and Print the array in reverse

import java.util.Scanner;
import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("enter 10 array elements");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int j =arr.length-1 ;j >= 0;j--){
            System.out.println(arr[j]);
        }
    }
}