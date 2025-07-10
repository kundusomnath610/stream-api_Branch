package org.example;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

       //List<Integer> list =  List.of(20, 25, 10, 15, 40);
       //System.out.println(list);

       List<Integer> list2 = Arrays.asList(20, 50, 35, 31, 50);
    //    //System.out.println(list2);

    //    ArrayList <Integer> list3 = new ArrayList<>();

    //    for (Integer integer : list) {
    //         if (integer % 2 == 0) {
    //             list3.add(integer);
    //         }
    //    }
    //    System.out.println(list3);

       // Using Stream API

       List<Integer> evenNum = list2.stream().filter(integer -> integer % 2 == 0)
                     .collect(Collectors.toList());

        System.out.println(evenNum);

        List<Integer> bigNum = list2.stream().filter(integer -> integer >= 20).collect(Collectors.toList());
        System.out.println(bigNum);
       

    }
}