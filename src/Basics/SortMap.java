package Basics;

import java.util.*;
import java.util.stream.Collectors;

public class SortMap {
    public static void main(String[] args) {
        //


        Map<String,Integer> map = new HashMap<>();
        map.put("Thursday",4);
        map.put("Sunday",01);
        map.put("Monday",2);

        List<Map.Entry<String,Integer>> entryList = new ArrayList<>(map.entrySet());

        List<Map.Entry<String,Integer>> sortedList = entryList.stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList());;

                sortedList.forEach(e-> System.out.println(e.getKey()+","+e.getValue()));


    }


}



