package Basics;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("abc",567);
        map.put("gfg",349);
        map.put("jgs",787);



        Set<Map.Entry<String, Integer>> keyValueSet = map.entrySet();

        map.entrySet().stream()
                .filter(k->k.getValue()>500)
                .forEach(System.out::println);


        System.out.println("------------------");

        for(Map.Entry<String,Integer> key:keyValueSet){

            System.out.println(key.getKey()+" "+key.getValue());

        }


    }
}
