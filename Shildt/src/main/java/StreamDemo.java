import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        // Create a list of Integer values.
        List<Integer> myList = List.of(7, 18, 10, 24, 17, 5);
        System.out.println("Original list: " + myList);
        // Obtain a Stream to the array list.
        Stream<Integer> myStream = myList.stream();
        // Obtain the minimum and maximum value by uses of min(),
        // max(), isPresent(), and get().
        Optional<Integer> minVal = myStream.min(Integer::compare);
        if (minVal.isPresent())
            System.out.println("Minimum value: " + minVal.get());
        // Must obtain a new stream because previous call to min()
        // is a terminal operation that consumed the stream.
        myStream = myList.stream();
        Optional<Integer> maxVal = myStream.max(Integer::compare);
        if (maxVal.isPresent())
            System.out.println("Maximum value: " + maxVal.get());
        // Sort the stream by use of sorted().
        Stream<Integer> sortedStream = myList.stream().sorted();
        // Display the sorted stream by use of forEach().
        System.out.print("Sorted stream: ");
        sortedStream.forEach(n -> System.out.print(n + " "));
        System.out.println();
        // Display only the odd values by use of filter().
        Stream<Integer> oddVals = myList.stream().sorted()
                .filter(n -> (n % 2) == 1);
        System.out.print("Odd values: ");
        oddVals.forEach(n -> System.out.print(n + " "));
        System.out.println();
        // Display only the odd values that are greater than 5. Notice that
        // two filter operations are pipelined.
        oddVals = myList.stream().filter(n -> (n % 2) == 1)
                .filter(n -> n > 5);
        System.out.print("Odd values greater than 5: ");
        oddVals.forEach(n -> System.out.print(n + " "));
        System.out.println();


     //   Поиск строки максимальной длины
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "Привет", "как", "дела?");
        String max = list.stream().max((s1, s2)-> s1.length()-s2.length()).get();
        ArrayList<String> list3 = new ArrayList<String>();
        Collections.addAll(list3, "Привет", "как", "дела?");
        Stream<String> stream = list3.stream();
        Optional<String> optional = stream.max((s1, s2)-> s1.length()-s2.length());
        String max2 = optional.get();
    }
}