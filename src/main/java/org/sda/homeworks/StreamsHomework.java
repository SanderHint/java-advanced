package org.sda.homeworks;

import lombok.AllArgsConstructor;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Using streams, for a given lists:["John", "Sarah", "Mark", "Tyla", "Ellisha","Eamonn"]
 * [1, 4, 2346, 123, 76, 11, 0, 0, 62, 23, 50]
 * a) Sort the list. +
 * b) Print only those names, that start with "E" letter. +
 * c) Print values greater than 30 and lower than 200. + +
 * d) Print names uppercase. +
 * e) Remove first and last letter, sort and print names. -
 * f) *Sort backwards by implementing reverse Comparator and using lambda expression. + -
 *
 * @author Sander
 */
@AllArgsConstructor
public class StreamsHomework {
    public static void main(String[] args) {

        //Using streams, for a given lists:["John", "Sarah", "Mark", "Tyla", "Ellisha","Eamonn"], [1, 4, 2346, 123, 76, 11, 0, 0, 62, 23, 50]
        //Sort the list.
        System.out.println("Sorted names and numbers");
        List<String> namesList = List.of("John", "Sarah", "Mark", "Tyla", "Ellisha", "Eamonn");
        namesList.stream()
                .sorted()
                .forEach(System.out::println);

        List<Integer> numbersList = List.of(1, 4, 2346, 123, 76, 11, 0, 0, 62, 23, 50);
        numbersList.stream()
                .sorted()
                        .forEach(System.out::println);


        //Print only those names, that start with "E" letter.
        System.out.println("Names that start with 'E'");
        Stream<String> namesStartingWithE = namesList.stream()
                .filter(s -> s.startsWith("E"));
        System.out.println(namesStartingWithE.collect(Collectors.toList()));


        //Print values greater than 30 and lower than 200.
        System.out.println("Values between 30 and 200");
        List<Integer> numbersBetweenThirtyAndTwoHundred = numbersList.stream()
                .filter(x -> x >=30)
                .filter(x -> x <= 200)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(numbersBetweenThirtyAndTwoHundred);


        //Print names uppercase.
        System.out.println("Names in uppercase");
        List<String> nameList = Arrays.asList("John", "Sarah", "Mark", "Tyla", "Ellisha", "Eamonn");
        namesList.stream()
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.println(name + " "));

        // Remove first and last letter, sort and print names.
        System.out.println("Names with first and last letter removed");




        //Sort backwards by implementing reverse Comparator and using lambda expression.
        System.out.println("Names and numbers sorted backwards");
        nameList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        numbersList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);


    }
}

