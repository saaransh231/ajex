package Basics;

//Split the data and sort in ascending order based on date given
//        USD20180510SWKDMT, SGD20100928TW1XTZ, INR20170302STW1XX, USD20150828SZWDTB, GBP20200131SUBTBD
//
//        Pos 0 -3 char is Currency
//        Pos 3 -11 char is Date in YYYYMMDD format
//        Pos 11 - 6 char is User ID
//
//        String data = "USD20180510SWKDMT, SGD20100928TW1XTZ, INR20170302STW1XX, USD20150828SZWDTB, GBP20200131SUBTBD"

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Cognizant {


            public static void main(String[] args) {
                String s = "USD20180510SWKDMT, SGD20100928TW1XTZ, INR20170302STW1XX, USD20150828SZWDTB, GBP20200131SUBTBD";



//                 Split the string into an array of strings
                String[] parts = s.split(", ");

                // Define a custom comparator to sort based on the 3rd to 8th characters
                Comparator<String> customComparator = new Comparator<String>() {
                    @Override
                    public int compare(String s1, String s2) {
                        String substring1 = s1.substring(3, 11);
                        String substring2 = s2.substring(3, 11);
                        return substring1.compareTo(substring2);
                    }
                };

                // Sort the array using the custom comparator
                Arrays.sort(parts, customComparator);

                // Join the sorted array back into a single string
                String sortedString = String.join(", ", parts);

                System.out.println(sortedString);
            }
        }










