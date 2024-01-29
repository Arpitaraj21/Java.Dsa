//Design a function void print( ) with a single dimensional array x[ ] and n (as size of the array) as function arguments. The function calculates sum of only single digit and sum of only double digit elements from the array. Design a main() function to input size of the array ‘len' and single dimensional array of size 'len', and print the required result by invoking the function print( ).


import java.util.Scanner;
import java.util.Arrays;

public class ArrayFunction {
    public static void main(String[] args) {
        int sumSingle = 0, sumDouble =0;
        int ans1 = sumSingle;
        int ans2 = sumDouble;

    }
    static void print(int x[], int n){
        int sumSingle = 0, sumDouble =0;
        for(int i=0; i<n; i++){
            if(x[i] >0 && x[i] <=9){
                sumSingle += x[i];
            }
            else if (x[i] >= 10 && x[i] <=99){
                sumDouble += x[i];
            }
        }
        System.out.println("sum of single digit = " +sumSingle);
    }
}