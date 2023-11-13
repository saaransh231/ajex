package Basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class StreamGroup {
    public static void main(String[] args) {

        List<EmployeeDetails> list = new ArrayList<>();
        list.add(new EmployeeDetails(11,"Ram"));
        list.add(new EmployeeDetails(12,"Sham"));
        list.add(new EmployeeDetails(13,"Ajay"));

       Map<String, List<EmployeeDetails>> newList = list.stream()
               .collect(groupingBy(EmployeeDetails::getName));

        for(Map.Entry<String,List<EmployeeDetails>> map : newList.entrySet()){

            System.out.println(map.getKey() +"  " +map.getValue());



        }
       

    }
}


