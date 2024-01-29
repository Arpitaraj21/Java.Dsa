//Write a program to create a single dimensional array of 20 integers. Print array element in a single line with one space between each element. Also print sum of elements present at even indexes and sum of elements present at odd indexes in array.

import java.util.Scanner;
import java.util.Arrays;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];
        int evenSum = 0, oddSum = 0;
        for(int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int j=0; j<arr.length;j++){
            if(arr[j] % 2 == 0){
                evenSum = evenSum + arr[j];
            }
            if(arr[j] % 2 !=0){
                oddSum = oddSum + arr[j];
            }
        }
        for(int j=0; j<arr.length;j++){
            System.out.print(arr[j] + " ");
        }
        System.out.println("sum of even num is " +evenSum);
        System.out.println("sum of odd num is " +oddSum);
    }
}