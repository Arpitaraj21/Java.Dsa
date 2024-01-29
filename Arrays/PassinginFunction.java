package com.company;

import java.util.Arrays;

public class PassinginFunction {
    public static void main(String[] args) {
        int[] nums = {1, 23, 45, 89, 13};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[1] = 99;
    }
}