//Write a program that creates integer array of 10 elements, accepts values of arrays and Find sum of all odd numbers

import java.util.Scanner;
import java.util.Arrays;

public class oddArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr = new int[10];
        int sum =0;
        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int j = 0; j<arr.length;j++){
            if(arr[j] % 2 != 0){
                System.out.println(arr[j]);
                sum = sum + arr[j];
            }
        }
        System.out.println(sum);
    }
}