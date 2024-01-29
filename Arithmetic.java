//Write a program that creates integer array of 10 elements, accepts values of arrays and Find Sum, Average, Min, Max.

import java.util.Scanner;
import java.util.Arrays;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sum = 0, min, max;
        double avg;
        int[] arr = new int[10];
        System.out.println("enter 10 array elements: ");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        min = arr[0];
        max= arr[0];
        for(int j= 0; j<arr.length; j++){
            sum = sum + arr[j];

            if(min > arr[j]){
                min = arr[j];
            }
            if(max < arr[j]){
                max = arr[j];
            }
        }
        avg = (double)(sum/arr.length);
        System.out.println("sum " +sum);
        System.out.println("avg " +avg);
        System.out.println("min " +min);
        System.out.println("max " +max);
    }
}