//Write a program to initialize a single dimensional array of 8 integers. Print array elements along with the indexes of each element and square of each element in three columns.

import java.util.Scanner;
import java.util.Arrays;

public class IndexArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr = new int[8];
        System.out.println("please enter the array elements: ");
        for(int i= 0 ; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int j =0; j<arr.length;j++){
            System.out.println("index element sqaure");
            System.out.println(j + "\t\t" + arr[j] + "\t\t" + arr[j] * arr[j]);
        }
    }
}

