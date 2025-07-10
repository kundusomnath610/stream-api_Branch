package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class Method {
    public static void main(String[] args) {
        
        // Filter return the particular matching
            // Predicate(function) is boolean value Function

        List<String> name = List.of("Aman", "Raja", "Rahul", "Mona");

        List<String> newName = name.stream().filter(e -> e.startsWith("R")).collect(Collectors.toList());
        System.out.println(newName);


        // Map for using return thr total number or Double Number
        List<Integer> number = List.of(3, 6, 7, 4); // Have to print Squre
        // 9, 36, 49, 16 -> output

        List<Integer> newNumber = number.stream().map(i -> i * i)
                                        .collect(Collectors.toList());
        System.out.println(newNumber);


        
                                    

    }

}
