package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;

public class Student {
    String name;
    String city;
    int age;

    public Student(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }
}


class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("Ram", "Kolkata", 23));
        list.add(new Student("Sham", "pune", 22));
        list.add(new Student("Dham", "Chennai", 27));
        list.add(new Student("Ram", "Kolkata", 23));

        list.stream().sorted(Comparator.comparing(Student::getName)).forEach(System.out::println);

        Collections.sort(list, new GetByName());

        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }
}
    class GetByName implements Comparator<Student> {


        @Override
        public int compare(Student o1, Student o2) {
            return o1.name.compareTo(o2.name);
        }
    }
