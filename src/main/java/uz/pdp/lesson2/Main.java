package main.java.uz.pdp.lesson2;

import main.java.uz.pdp.lesson2.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Usmon", 12),
                new Person("Ali", 13),
                new Person("Bobur", 15),
                new Person("Zubayr", 12),
                new Person("Alisher", 13),
                new Person("Javohir", 12),
                new Person("Bahodir", 15),
                new Person("Abbos", 16)
        );
        people.stream()
                .collect(Collectors.groupingBy(Person::getAge))
                .forEach((key, value) -> {
                    System.out.println(key + ": " + value);
                });


    }
}
