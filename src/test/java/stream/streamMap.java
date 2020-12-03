package stream;

import org.junit.Assert;
import org.testng.annotations.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamMap {
    @Test
    public void steamMap(){
        ArrayList<String> names = new ArrayList<>();
        names.add("Don");
        names.add("Bob");
        names.add("Rahul");

    // print names which have last letter as "a" with Uppercase
    Stream.of("Anila", "Alesha", "Adam", "Yesmin", "Joy")
        .filter(s -> s.endsWith("a"))
        .map(s -> s.toUpperCase())
        .forEach(s -> System.out.println(s));
    // print names which start letter A with Uppercase

    List<String> names1 = Arrays.asList("Anila", "Alesha", "Adam", "Yesmin", "Joy");
    names1.stream()
        .filter(s -> s.startsWith("A"))
        .sorted()
        .map(s -> s.toUpperCase())
        .forEach(s -> System.out.println(s));
    // Merging 2 different lists
        Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
   //newStream.sorted().forEach(s -> System.out.println(s));
        boolean flag = newStream.anyMatch(s -> s.equalsIgnoreCase("Adam"));
    System.out.println(flag);
    Assert.assertTrue(flag);
    }

    @Test
    public void steamCollection(){
        List<String> ls = Stream.of("Aby", "Roby", "Boby", "Coby").filter(s-> s.endsWith("y")).map(s-> s.toUpperCase()).
                collect(Collectors.toList());
    System.out.println(ls.get(1));
    }

    @Test
    public void unique () {
       List<Integer>  values = Arrays.asList(3,4,2,2,7,5,1,9,7);
    // print unique number from this array
    // sort the array
    values.stream().distinct().forEach(s -> System.out.println(s));
    List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
    System.out.println(li.get(2));
    }

    @Test
    public void dist(){
        List<Integer> val = Arrays.asList(5,6,7,7,4,3,1);
        List<Integer> p = val.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(p);
    }

    @Test
    public void tes(){
    Stream.of("Anila", "Mohammad", "Rahman")
        .filter(s -> s.startsWith("M"))
        .map(s -> s.toUpperCase())
        .forEach(s -> System.out.println(s));
    }
    @Test
    public void bit(){
        List<String>  ti = Arrays.asList("Rom", "Bob", "Tom", "Tom", "Mo");
        List<String> c = ti.stream().distinct().sorted().collect(Collectors.toList());
    System.out.println(c);
    }

}

// there is no life for intermediate op if there is no terminal op
// terminal operation will execute only if inter op filter returns true
// we can create stream
// how to se filter is Stream API