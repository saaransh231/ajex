package Basics;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int arr[] = {23,54,67,54,86};

        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
        System.out.println(arr[arr.length-2]);

    }
}
