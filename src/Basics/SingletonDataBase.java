package Basics;

public class SingletonDataBase {

    private static SingletonDataBase singletonDataBase;
    private SingletonDataBase(){}

    public static SingletonDataBase getInstance(){
        if(singletonDataBase==null){
            singletonDataBase= new SingletonDataBase();
        }
        return singletonDataBase;
    }

    public static void main(String[] args) {
        SingletonDataBase db1;
        db1= SingletonDataBase.getInstance();
    }



}
