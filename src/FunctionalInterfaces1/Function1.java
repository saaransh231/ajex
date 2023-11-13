package FunctionalInterfaces1;

import Basics.Employee;

import java.util.function.Function;

public class Function1 {
    public static void main(String[] args) {

      //  Function<Type,ReturnType>,apply,andthen,compose()

        Function<String,String>fb = a->a.toLowerCase();
        System.out.println(fb.apply("HALF"));

        Function<Integer,Double> half = a-> a/2.0;
        half=half.andThen(a->a*3);
        System.out.println(half.apply(10));

    }
}
