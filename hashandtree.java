import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class hashandtree {
    public static void main(String[] args) {
        Set<String> days=new HashSet<>();//gives in random order
        days.add("monday");
        days.add("tuesday");
        days.add("wednesday");
        days.add("thursday");
        days.add("friday");
        days.add("saturday");
        System.out.println(days);
        Set<String> day= new TreeSet<>();//gives in order
        day.add("monday");
        day.add("tuesday");
        day.add("wednesday");
        day.add("thursday");
        day.add("friday");
        day.add("saturday");
        System.out.println(day);
    }
    

}
