package Basics;

import java.util.Arrays;

public class SumString {

    public static void main(String[] args) {
        String input1 = "1,868,";
        String input2 = "999";




        int[] num1 = convertToDigitsArray(input1);
        int[] num2 = convertToDigitsArray(input2);

        int[] sum = addArray(num1, num2);

        String result = convertToString(sum);
        System.out.println(result);

    }

    private static int[] convertToDigitsArray(String input) {
        int[] digits = new int[input.length()];

        for (int i = 0; i < input.length(); i++) {
            digits[i] = Character.getNumericValue(input.charAt(i));
        }

        return digits;
    }

    private static String convertToString(int[] array){

            StringBuilder result = new StringBuilder();
            int startIndex = 0;

            while(startIndex< array.length && array[startIndex]==0){
                startIndex++;
            }

            for(int i = startIndex; i< array.length;i++){
                result.append(array[i]);
            }
            return result.toString();

        }

        static int[] addArray(int[] num1, int[] num2){

            int [] sum =new int[Math.max(num1.length,num2.length)+1];
            int x = 0;

            for(int i = 1; i<= sum.length;i++){

                int digit1 = (num1.length -i >=0)? num1[num1.length -i]:0 ;
                int digit2 = (num2.length -i>=0)?num2[num2.length -i]:0;


                int tempSum = digit1+digit2+x;
                sum[sum.length - i] = tempSum %10;
                x = tempSum/10;

            }

            return sum;
    }
}
