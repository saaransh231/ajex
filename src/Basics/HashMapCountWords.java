package Basics;

import java.util.HashMap;
import java.util.Map;

public class HashMapCountWords {
    public static void main(String[] args) {

        String str= "I will be selected for for hem project project project";
        String[] words = str.split(" ");
        Map<String, Integer> hashMap = new HashMap<>();


        for (String word : words) {


            if(hashMap.containsKey(word)){
                hashMap.put(word,hashMap.get(word)+1);
            }
            else
                hashMap.put(word,1);

            // Asking whether the HashMap contains the
            // key or not. Will return null if not.
//            Integer integer = hashMap.get(word);
//
//            if (integer == null)
//                // Storing the word as key and its
//                // occurrence as value in the HashMap.
//                hashMap.put(word, 1);
//
//            else {
//                // Incrementing the value if the word
//                // is already present in the HashMap.
//                hashMap.put(word, integer + 1);
//            }
        }
        System.out.println(hashMap);
    }
}
