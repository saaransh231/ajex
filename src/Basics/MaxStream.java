package Basics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxStream {
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(23,65,76,67);
        int s = list.stream().max(Integer::compare).get();
        Optional<Integer> sr = list.stream().sorted(Comparator.reverseOrder()).findFirst();
        System.out.println(sr);
    }
}
