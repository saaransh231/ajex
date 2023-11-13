package Basics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {
    public static void main(String[] args) {



        List<Integer> list = Arrays.asList(33,33,44,44,76,533);
        list.stream()
                .filter(x->x>40)
                .map(x->x*x)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
