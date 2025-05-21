import java.util.stream.*;
import java.util.*;

public class StreamEx {
    public static void main(String[] args) {
        // from collection to stream
        List<Integer> li = Arrays.asList(5, 1, 2, 9, 5, 32, 3, 4);
        Stream<Integer> number = li.stream();
        System.out.println(number.filter((Integer num) -> num > 33).count());
        // from array to stream
        Integer[] arr = new Integer[] { 45, 678, 899 };
        Stream<Integer> streaData = Arrays.stream(arr);
        streaData.map((Integer num) -> num * 9)
                .forEach((Integer n) -> System.out.println(n));
        List<Integer> fiResult = Arrays.stream(arr).map((Integer num) -> num * 0)
                .peek((Integer n) -> System.out.println(n)).collect(Collectors.toList());
        System.out.println("wooo" + fiResult);

        // from static method

        Stream<Integer> streamData = Stream.of(3, 4, 5, 7, 8, 9, 8);
        // from streambuilder
        Stream.Builder<Integer> streamData1 = Stream.builder();
        streamData1.add(9);
        streamData1.add(5);
        streamData1.add(3);

        // from stream iterate

        Stream<Integer> streamDataIt = Stream.iterate(100, ((Integer num) -> num + 100)).limit(9);
        // flatmap
        String[][] list = new String[][] { { "B", "a", "A", "hiii", "hello", "hdbfhdkgaekg", "asdjkfnhaslfhdf" },
                { "hiii" },
                { "sam" } };

        System.out.println(Arrays.stream(list)
                .flatMap((sentence) -> Arrays.stream(sentence)).sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toSet()));
        // System.out.println(st);

        // peek

        System.out.println(Arrays.stream(list).map((st) -> Arrays.stream(st))
                .collect(Collectors.toSet()));
    }
}