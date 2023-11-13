package Basics;

import java.util.Arrays;
import java.util.List;

public class EvenStream {
    public static void main(String[] args) {
        List<Integer> list =  Arrays.asList(23,65,97,65,98);
//        list.stream().filter(a->a%2==0).sorted().forEach(System.out::println);
        list.stream().filter(a->a%2==0).map(a->a*a).forEach(System.out::println);

    }
}
