package Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DeleteList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(3);

       List<Integer> newList =  list.stream().distinct().collect(Collectors.toList());

        System.out.println(newList);



    }



}
