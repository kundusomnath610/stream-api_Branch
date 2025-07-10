package org.example;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * 
 * Creating the Stream Interface Object.
 * With the help of Stream API...
 * 
 * We are performing the collection Object and Perform the Stream API in
 * Array Also..
 * 
 * Their are lot of method to create the Stream API like 
 * 1. ofNullable
 * 2. of
 * 3. empty
 * 4. Builder
 * All four are same to create to stream API
 */

public class StreamObject {
    public static void main(String[] args) {
        
        // Blank
        Stream<Object> emptyStream = Stream.empty();

        // Array Object Collection to Stream API
        String[] names = {"som", "ram", "shym", "jadhu"};

        Stream<String> stream = Stream.of(names);
        stream.forEach(e -> {
            System.out.println(e);
        });

        // Using Builder to develop Stream API
        Stream<Object> stream2 = Stream.builder().build();
        
        //Using Arrays method with Double, Long, int, float, 
        IntStream intStream = Arrays.stream(new int[]{20, 10, 30, 25,19});
        intStream.forEach(e -> {
            System.out.println(e);
        });

        stream2.close();
        emptyStream.close();

    }

}
