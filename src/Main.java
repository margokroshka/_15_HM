import java.io.FileWriter;
import java.io.Writer;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.lang.Integer.*;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        Random random = new Random();
//        for (int i = 0; i < 50; i++) {
//            list.add(random.nextInt(100));
//        }
//        Stream<Integer> stream = list.stream();
//        stream.distinct()
//                .filter(x->(x>=7&x<=17))
//                .filter(x->(x%2==0))
//                .map(x->(x*2))
//                .sorted()
//                .map(x-> IntStream.range(0,4))
//                .map(IntStream::average);
//


        main2();
    }

    public static void main2() {
        ArrayList<Student> students = new ArrayList<>();
        String name = "Margo";
        String name1 = "Darua";
        String name2 = "Alan";
        String name3 = "Khloy";

        for (int i = 0; i < 10; i++) {
            if(i == 0) {
                students.add(new Student("Mads"));
            }
            if(i > 0 && i < 3){
                students.add(new Student(name));
            }else if(i > 2 && i < 5){
                students.add(new Student(name1));
            }else if(i > 4 && i < 7){
                students.add(new Student(name2));
            }else if(i > 6){
                students.add(new Student(name3));
            }
        }



        Stream<Student> stream = students.stream();
        long count = stream.distinct()
                .filter(x -> x.getName().equalsIgnoreCase("MaRgo")).count();
        System.out.println(count);


        Stream<Student> stream1 = students.stream();
       stream1.filter(x -> x.getName().toLowerCase().startsWith("A".toLowerCase()))
                .distinct()
                .forEach(System.out::println);

        Stream<Student> stream2 = students.stream();
        System.out.println(stream2.sorted((o1, o2) -> {
            if (o1.getName().compareTo(o2.getName()) > 0) {
                return 1;
            } else {
                return -1;
            }
        }).findFirst());

//                    .filter(x->(x>=7&x<=17))
//                    .filter(x->(x%2==0))
//                    .map(x->(x*2))
//                    .sorted()
//                    .map(x-> IntStream.range(0,4))
//                    .mapToInt(x-> Integer.parseInt(x).average())
//                    .forEach();

    }
}
