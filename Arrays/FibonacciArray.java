//Write a program which generates 30 terms of Fibonacci no in an array and then prints it.


import java.util.Arrays;

public class FibonacciArray {
    public static void main(String[] args) {
        int[] fibonacci = new int[30];
        int n1=0,n2=1,n3;
        int count = 30;
        System.out.println(n1 +" \n "+n2);
        for(int i=0;i<count;i++){
            n3=n1+n2;
            System.out.println(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
