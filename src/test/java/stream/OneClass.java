package stream;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.stream.Stream;

public class OneClass {
    @Test
    public void regular(){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Adam");
        names.add("Don");
        names.add("Zia");
        names.add("Mitu");
        names.add("Naushin");
        int count = 0;

        for(int i=0; i<names.size(); i++ ) {
            String actual = names.get(i);
            if(actual.startsWith("M")) {
                count++;

            }

        }
    System.out.println(count);
    }

    @Test
    public void steamFilter(){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Adam");
        names.add("Don");
        names.add("Zia");
        names.add("Mitu");
        names.add("Masuma");
        names.add("Naushin");
// intermidiate opreation
        Long c = names.stream().filter(s ->s.startsWith("M")).count();
    System.out.println(c);

    // theer is no life for intermediate op if there is no terminal op
        // terminal operation will execute only if interm op filter returns true

   Long d = Stream.of("Adam", "Don", "Zia", "Mitu", "Masuma", "Naushin").filter(s->
   {
           s.startsWith("M");
           return true;

}). count();
    System.out.println(d);
    names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
    }
}



// Lamda exression  new arrow operator left side parameter  and right sight action