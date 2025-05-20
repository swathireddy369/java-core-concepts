import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<>();
        li.addLast(3);
        li.addLast(4);
        li.addLast(5);
        LinkedList<Integer> li1 = new LinkedList<>();
        li.add(0, 3);
        li.add(1, 4);
        li.add(3, 5);
        HashMap<Integer, String> limap = new LinkedHashMap<>();
    }
}
