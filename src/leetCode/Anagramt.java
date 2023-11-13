package leetCode;

import java.util.Arrays;
import java.util.HashMap;

public class Anagramt {


        public static boolean isAnagram(String s, String t) {


            char[]ch = s.toCharArray();
            char[]cg = t.toCharArray();

            Arrays.sort(ch);
            System.out.println(ch);
            String s1 = new String(ch);
            System.out.println(s1);

            Arrays.sort(cg);
            String s2 = new String(cg);
            System.out.println(s2);


            if(s1.equals(s2)){
                return true;
            }
            return false;
    }

    public static void main(String[] args) {

            if(isAnagram("ram","maar")){
                System.out.println("iits anagram");

        }
            else {
                System.out.println("not anagram");
            }

    }
}

