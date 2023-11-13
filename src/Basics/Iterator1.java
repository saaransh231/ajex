package Basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i =0;i<10;i++)
            list.add(i);
        Iterator<Integer>it = list.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            System.out.println(i);
        }
    }
}
