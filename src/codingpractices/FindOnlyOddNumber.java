package codingpractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindOnlyOddNumber {

    public static void main(String[] args) {

        // Print only odd numbers.
        List<Integer> list = Arrays.asList(1,3,5,8,1000,99);
        list.stream().filter(n -> n%2 != 0).forEach(System.out::println);


        // Find only string containing vowels.
        List<String> stringList = Arrays.asList("sky", "fly", "Monica", "Jack", "Czck");
        List<String> stringsWithVowels = stringList.stream()
                .filter(s -> s.toLowerCase().matches(".*[aeiou].*"))
                .collect(Collectors.toList());

        System.out.println("Strings containing vowels: " + stringsWithVowels);
    }
}
