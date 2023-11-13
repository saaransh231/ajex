package Basics;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String str = "firstnonrepeatingf";
        for(char c:str.toCharArray()){
            if(str.indexOf(c) == str.lastIndexOf(c)){
                System.out.println(c);
                break;
            }
        }
    }
}
