package stream;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.stream.Stream;

public class mapClass {
    @Test
    public void stMap() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Tommy");
        names.add("Nuo");
        names.add("Rah");

        // print names which have last letter as "m" with uppercase
    Stream.of("Abdull", "Hatem", "Rahman", "Mohammad")
        .filter(s -> s.endsWith("m"))
        .map(s -> s.toUpperCase())
        .forEach(s -> System.out.println(s));
    names.stream().filter(s-> s.length()>3).limit(3).forEach(s->System.out.println(s));
    }

    @Test
    public void fil(){
         Long c = Stream.of("Anila", "Alesha", "Adam", "Alam").filter(s-> {
            s.startsWith("A");
            return true;
        }).count();
    System.out.println(c);
    }

}

// there is no life for intermediate op if there is no terminal op
// terminal op will execute only if inter op (filter) return true
// we can create stream
// how to use filter in stream API