//Write an array which takes in roll no and marks in 3 subjects for 10 students. Print the roll no, total marks and average for all students.

import java.util.Scanner;
import java.util.Arrays;

public class MarksAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] rno = new int[n];
        int[] s1 = new int[n];
        int[] s2 = new int[n];
        int[] s3 = new int[n];
        double[] total = new double[n];
        double[] avg = new double[n];
        for(int i=0; i<n; i++){
            System.out.println("enter student " + (i+1) + "details: ");
            System.out.println("roll no. ");
            rno[i] = sc.nextInt();
            System.out.println("sub 1 marks ");
            s1[i] = sc.nextInt();
            System.out.println("sub 2 marks ");
            s2[i] = sc.nextInt();
            System.out.println("sub 3 marks ");
            s3[i] = sc.nextInt();
            total[i] = (s1[i] + s2[i] + s3[i]);
            avg[i] = total[i] / 3.0;
        }
        System.out.println("roll no \t total \t avg ");
        for(int i = 0; i<n; i++){
            System.out.println(rno[i] + "\t" + total[i] + "\t" +  avg[i]);
        }
    }
}