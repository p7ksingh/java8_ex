package com.p7ksingh.javaex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class StreamsAllCodeSolutions {
        public static void main(String[] args) {
                List<Integer> nums = Arrays.asList(1, 2, 2, 2, 2, 3, 4, 5, 6, 8, 101, 101);
                int[] arr = { 1, 2, 3, 4 };
                // Write a program to find the sum of all elements in a List using streams.
                int sum = nums.stream().mapToInt(Integer::intValue).sum();
                System.out.println(sum);
                // Given a List of integers, write a program to find the maximum element using
                // streams.
                Integer integer = nums.stream().max(Comparator.naturalOrder()).get();
                System.out.println(integer);

                List<String> fruits = Arrays.asList("apple", "banana", "cherry", "coconut", "apple");
                // Given a List of strings, write a program to count the number of strings that
                // start with a specific character using streams.
                long count = fruits.stream().filter(dt -> dt.startsWith("c")).count();
                System.out.println(count);
                // Write a program to convert a List of strings to uppercase using streams.
                fruits.stream().map(String::toUpperCase).forEach(System.out::println);
                // Given a List of integers, write a program to filter out the even numbers
                // using streams.
                // Count the number of elements in a list that satisfy a specific condition
                // using streams.
                long count2 = nums.stream().filter(dt -> dt % 2 == 0).count();
                System.out.println(count2);
                // Write a program to find the average of a List of floating-point numbers using
                // streams.
                List<Double> numsFloat = Arrays.asList(1.3, 2.4, 3.1, 4.2, 5.4);
                double asDouble = numsFloat.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
                System.out.println(asDouble);
                // Given a List of strings, write a program to concatenate all the strings using
                // streams.
                String collect = fruits.stream().collect(Collectors.joining());
                System.out.println(collect);
                // Write a program to remove duplicate elements from a List using streams.
                List<Integer> collect2 = nums.stream().distinct().collect(Collectors.toList());
                System.out.println(collect2);
                // Given a List of objects, write a program to sort the objects based on a
                // specific attribute using streams.

                List<Person> people = Arrays.asList(
                                new Person("Alice", 21),
                                new Person("Anna", 29),
                                new Person("Bob", 30),
                                new Person("Barbie", 56),
                                new Person("Charlie", 20));
                people.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList())
                                .forEach(System.out::println);
                // Write a program to check if all elements in a List satisfy a given condition
                // using streams.
                List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
                boolean allEven = numbers.stream().allMatch(n -> n % 2 == 0);
                System.out.println("All numbers are even: " + allEven);
                // Sort a list of strings in ascending order using streams.
                fruits.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
                // Check if a list contains a specific element using streams.
                boolean anyMatch = nums.stream().anyMatch(dt -> dt.equals(9));
                System.out.println(anyMatch);
                // Create a new list containing the square of each element from the original
                // list using streams
                List<Integer> collect3 = nums.stream().map(dt -> dt * dt).collect(Collectors.toList());
                System.out.println(collect3);
                // Find the average length of strings in a list using streams.
                OptionalDouble average = fruits.stream().mapToInt(String::length).average();
                System.out.println(average);
                // Find the longest string in a list using streams.
                OptionalInt max = fruits.stream().mapToInt(String::length).max();
                System.out.println(max);

                // Group a list of objects based on a specific attribute using streams.
                List<Person> sortedPersion = people.stream()
                                .sorted(Comparator.comparing(Person::getName)
                                                .thenComparing(Person::getAge))
                                .collect(Collectors.toList());
                System.out.println(sortedPersion);
                // Remove null values from a list using streams.
                List<String> collect4 = fruits.stream().filter(Objects::nonNull).collect(Collectors.toList());
                System.out.println(collect4);
                // Find the second smallest element in a list of integers using streams.
                Optional<Integer> first = nums.stream().distinct().sorted().skip(1).findFirst();
                System.out.println(first);
                // Find the intersection of two lists using streams
                List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
                List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8);
                List<Integer> collect5 = list1.stream().filter(list2::contains).collect(Collectors.toList());
                System.out.println(collect5);
        }
}
