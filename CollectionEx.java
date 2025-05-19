import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class CollectionEx{
    public static void main(String[] args) {
        
 List<Integer> li=new ArrayList<>();
 System.out.println(li.add(3));
 System.out.println( li.add(6));
  System.out.println(li.add(9));

  System.out.println(li.size());//3
  System.out.println(li.isEmpty());//false
  System.out.println(li.contains(5));//false
  System.out.println(li.add(5));
  System.out.println(li.contains(5));//true
  System.out.println(li.remove(3));//3rd index will be removed
  System.out.println(li.remove(Integer.valueOf(5)));//here now it will remove the value of particular indexd

 Stack<Integer> st=new Stack<>();
  System.out.println(st.addAll(li));//all values from li will be added to st
  System.out.println(st.remove(Integer.valueOf(2)));
  System.out.println(st.containsAll(li));
  System.out.println(st.removeAll(li));
  st.clear();
  System.out.println(st.isEmpty());
   /////collections
  Collections.sort(li);
    System.out.println(li);
     System.out.println(Collections.max(li));
    }

   
  
    
    
}