//Write a program that creates integer array of 10 elements, accepts values of arrays and Search for a number in an array of 10

import java.util.Scanner;
import java.util.Arrays;

public class findElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int i,j,x,flag=0;
        System.out.print("enter the array elements");
        for(i=0;i<arr.length;i++)
            arr[i] = sc.nextInt();
            System.out.println("enter the element you wanna search: ");
            x= sc.nextInt();
            for(j =0; j<arr.length;j++){
                if(arr[j] == x){
                    flag =1;
                    break;
                }
                else{
                    flag = 0;
                }
            }
        if(flag == 1){
            System.out.println("the element is in the position " +(j +1 ));
        }
        else{
            System.out.println("element not found");
        }
    }
}