package com.leetcode.fs.stream;

import java.util.stream.IntStream;

public class StreamForLoop {
    public static void main(String[] args) {
        // FOR-LOOP
        for (int idx = 1;
             idx < 5;
             idx++) {
            System.out.println(idx);
        }
// EQUIVALENT STREAM (Java 8)
        IntStream.iterate(1,
                        idx -> idx + 1)
                .limit(4L)
                .forEachOrdered(System.out::println);
// EQUIVALENT STREAM (Java 9+)
        IntStream.iterate(1,
                        idx -> idx < 5,
                        idx -> idx + 1)
                .forEachOrdered(System.out::println);

    }

}
