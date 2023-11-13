package Basics;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

class SingletonD{

    private static SingletonD db;
    private SingletonD(){

    }

    public static SingletonD getInstance() {


        if (db == null) {

            db = new SingletonD();

        }
        return db;


    }

    public static void main(String[] args) {
        SingletonD db2;
        db2=SingletonD.getInstance();
    }



}