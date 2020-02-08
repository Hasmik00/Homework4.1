package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        //Questions 1,2,3,5

        List<String> strings = new ArrayList<>();

        strings.add(" Stairway");
        strings.add(" to");
        strings.add(" heaven");

        //region No1
        //Question 1: To uppercase
        List<String> modified1 = strings.stream()
                .map((each) -> each.toUpperCase())
                .collect(Collectors.toList());

        System.out.println("_____________________________________");
        System.out.println("Question 1: To uppercase");
        System.out.println("_____________________________________");
        modified1.forEach((each) -> System.out.println(each));
        System.out.println();
        //endregion

        //region No2
        //Question 2: length less tan 4
        List<String> modified2 = strings.stream()
                .filter((each) -> each.length() < 4)
                .collect(Collectors.toList());

        System.out.println("_____________________________________");
        System.out.println("question 2: length less tan 4");
        System.out.println("_____________________________________");
        modified2.forEach((each) -> System.out.println(each));
        System.out.println();
        //endregion

        //region No3
        //Question 3: flatMap
        List<String> strings2 = new ArrayList<>();

        strings.add(" - ");
        strings.add(" Led");
        strings.add(" Zeppelin");

        List<List<String>> favourite = Arrays.asList(strings2, strings);

        List<String> combined = favourite.stream()
                .flatMap((list) -> list.stream())
                .collect(Collectors.toList());

        System.out.println("_____________________________________");
        System.out.println("question 3: flatMap");
        System.out.println("_____________________________________");
        combined.forEach((each) -> System.out.print(each));
        System.out.println();
        System.out.println();
        //endregion

        //region No4
        //Question 5: sum of numeric collection
        List<Integer> numbers = Arrays.asList(5, 10, 15);

        Integer sum = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("_____________________________________");
        System.out.println("Question 5: sum of numeric collection");
        System.out.println("_____________________________________");
        System.out.println(sum);
        System.out.println();
        //endregion

    }
}
