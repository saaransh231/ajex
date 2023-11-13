package Basics;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCharacter {
    public static void main(String[] args) {
        String str= "asbestos";
        finds(str);


    }

    private static void finds(String str) {

        Map<Character ,Integer> map = new HashMap<>();

        for(char ch:str.toCharArray()){

            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else {
                map.put(ch,1);

            }
        }

        map.entrySet().stream().forEach(System.out::println);



    }
    }


//    private static void finds(String str){
//
//        char[] ch = str.toCharArray();
//        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
//
//        for(char c :ch){
//            if(map.containsKey(c)){
//                map.put(c,map.get(c)+1);
//            }
//            else{
//            map.put(c,1);
//        }}
//
//        map.entrySet().stream().collect(Collectors.toList()).forEach(System.out::println);
//
////        for(Map.Entry<Character,Integer> entry: map.entrySet()){
////                System.out.println(entry.getKey()+" ="+entry.getValue());
//            }
//        }
//





