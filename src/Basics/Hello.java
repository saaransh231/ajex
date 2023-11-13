//package Basics;
//
//import java.io.LineNumberInputStream;
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class Hello {
//    public static void main(String[] args) {
//
//        List<Integer> list = Arrays.asList(33,33,44,533);
//        List<Integer>list2 =list.stream()
//                .filter(x->x>40)
//                .map(x->x*x)
//                .collect(Collectors.toList())
//                .collect(Collectors.toList());
//        System.out.println(list2);
//
//    }
//}
