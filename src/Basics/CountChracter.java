package Basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountChracter {
    public static void main(String[] args) {
        String str = "hsttterfhst";

        HashMap<String, Long> map = Arrays.stream(str.split(""))
                        .map(String::toLowerCase).collect(Collectors.groupingBy(str2->str2,HashMap::new, Collectors.counting()));

        System.out.println(map);
    }
}
