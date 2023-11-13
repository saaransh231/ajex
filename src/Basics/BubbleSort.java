 package Basics;

import java.util.Arrays;

public class BubbleSort {



    public static void main(String[] args) {
        int arr[] = {23, 54, 67, 33, 11, 43, 15, 97};
        int size = arr.length;
        int temp = 0;

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }




        }
        System.out.println(Arrays.toString(arr));
    }
}

