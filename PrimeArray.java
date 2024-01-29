//Write a program to take in 10 values and print only those nos which are prime.

import java.util.Scanner;
import java.util.Arrays;

public class PrimeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int[] arr = new int[10];
        System.out.println("enter 10 array elements: ");
        for(int i=0; i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("prime numbers: ");
        for(int i =0 ; i<arr.length; i++){
            int j = 2;
            int p = 1;
            while(j < arr[i]){
                if(arr[i] % j == 0){
                    p = 0;
                    break;
                }
                j++;
            }
            if(p == 1){
                System.out.println(" " +arr[i]);
            }
        }
    }
}

