//package Basics;
//
//import java.util.*;
//
//class Solution {
//    public int  bestAverageCalculator(String[][] scores) {
//    Map<String,List<Integer>> map = new HashMap<>();
//    for(String[] score : scores){
//        String name = score[0];
//        int currentScore = Integer.parseInt(score[1]);
//
//        if(map.containsKey(name)){
//
//            List<Integer>list = new ArrayList<>();
//            list.add(currentScore);
//            map.put(name,list);
//        }
//
//    }
//
//    int bestavg;
//    for(List<Integer> value: map.values()){
//
//        int sum = 0;
//        int count = 0;
//        for(int i:value){
//
//            sum+=i;
//            count++;
//        }
//        int avg = (int) Math.floor(sum/count);
//        if(avg>bestavg){
//            bestavg = avg;
//        }
//        return bestavg;
//    }
//
//
//
//
//    }
//
//}