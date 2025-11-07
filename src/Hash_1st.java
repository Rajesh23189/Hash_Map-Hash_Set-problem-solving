
import java.util.ArrayList;
import java.util.HashSet;
public class Hash_1st {
    public static void main(String args[])
    {

      //Time complexity of Insert  Is O(1)
      HashSet<Integer> set = new HashSet<>();
      set.add(20);
      set.add(100);
      set.add(10);
      set.add(-8);
      System.out.println(set);


      //serch --> give anser true/false; time complexity O(1)
        System.out.println(set.contains(100));

        //for set size : time complexity O(1)
        System.out.println(set.size());

        //remove : Time Complexity O(1)
        set.remove(100);
        System.out.println(set.size());


        //If value is not content and use the remove then give false not give error

        System.out.println(set.remove(100));


        //Convert Into arry
        set.add(20);
        set.add(100);
        set.add(10);
        set.add(-8);

        Object[] arr = set.toArray();
        for(Object obj : arr)
        {
            System.out.print(obj+" ");
        }
    }
}
