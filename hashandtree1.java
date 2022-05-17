import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class hashandtree1 {
    public static void main(String[] args) {
        List<Integer> id= new ArrayList<>();
        id.add(5);
        id.add(1);
        id.add(7);
        id.add(6);
        System.out.println(id);
        id.remove(3);//takes index
        System.out.println(id);

        List<Integer> number=new ArrayList<>();
        number.add(1);
        number.add(3);
        number.add(2);
        number.add(6);
        System.out.println(number);

        Set<Integer> order = new HashSet<>(id);
        order.addAll(number);
        System.out.println(order);
        order.remove(5);//takes value!
        System.out.println(order);
    }
}
