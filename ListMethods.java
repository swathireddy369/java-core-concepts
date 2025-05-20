import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListMethods {
    public static void main(String[] args) {

        List<Integer> li = new ArrayList<>();
        li.add(100);
        li.add(200);
        li.add(300);
        li.forEach((Integer val) -> System.out.println(val));
        li.replaceAll((Integer val) -> -1 * val);

        li.sort((Integer val1, Integer val2) -> val1 - val2);

        li.get(2);
        li.set(1, 300);
        li.indexOf(7);
        li.lastIndexOf(5);

        ListIterator<Integer> listIterator = li.listIterator();// child of iterator
        System.out.println("listIterator" + listIterator);
        System.out.println("listIterator" + listIterator.hasNext());
        System.out.println("listIterator" + listIterator.next());
        listIterator.remove();
        System.out.println("sampe " + listIterator.next());
        // System.out.println("listIterator" +listIterator.remove());
    }
}