package Basics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {


    static List<Employee> list = new ArrayList<Employee>();
    public static void main(String[] args) {

        list.add(new Employee("59-385-1088","Zacharias","Schwerin","zchwerin@gmail.com","Male","True",101146,0));

        list.add(new Employee("73-274-6476","Kyle","Frudd","kfrudd1@ovh.net","Male","FALSE",29310,2));

        list.add(new Employee("85-939-9584","Axe","Gumb","agumb2@twitter.com","Female","FALSE",62291,4));

       // withStream();
        withComparator();
    }

    private static void withComparator() {

        List<Employee> list2=  list.stream()
                        .sorted(Comparator.comparing(Employee::getSalary)
                                .thenComparing(Employee::getEmail))
                                .collect(Collectors.toList());
        System.out.println(list2);



        list.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);

    }

    private static void withStream() {

        list.stream()
                .filter(x->x.getSalary()>30000)
                .map(x->x.getSalary()+5000)
                .forEach(System.out::println);

    }
}
