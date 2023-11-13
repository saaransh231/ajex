package Basics;

public class Finterface implements FunctionalInterface {

    public int say(int a,int b){
        int c = a*b;

        return c;
    }

    public static void main(String[] args) {

        Finterface finterface =  new Finterface();
        finterface.say(4,6);
    }






}
