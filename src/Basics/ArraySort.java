package Basics;

import java.util.*;

        class Anagramm {
            public List<List<String>> groupAnagrams(String[] strs) {

                public List<List<String >> groupAna(String[] strs){



                }

                Map<String, List<String>> map = new HashMap<>();

                for (String word : strs) {
                    char[] ch = word.toCharArray();
                    Arrays.sort(ch);

                    String newWord = new String(ch);

                    if (!map.containsKey(newWord)) {
                        map.put(newWord, new ArrayList<>());
                    }

                    map.get(newWord).add(word);

                }

                return new ArrayList<>(map.values());

            }

        }


        Map<String,List<Strinh>> map = new HashMap<>()


                for(String word: str){
                    chaar[]ch = word.tocharArray();

                    Array.sort(ch)

                        String newWird = new String(ch)

                        if(!map.containsKey(newWord)){

                            map.put(newWord,new arrayList<>)
                        }




                        }




