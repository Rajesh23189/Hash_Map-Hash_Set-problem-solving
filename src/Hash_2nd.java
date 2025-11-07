import java.util.HashSet;
import java.util.Iterator;

public class Hash_2nd {
    public static void main(String args[])
    {
        HashSet<Integer> h_set = new HashSet<>();
        h_set.add(100);
        h_set.add(200);
        h_set.add(300);
        h_set.add(400);

        //using Iterator
        Iterator<Integer> itr = h_set.iterator();
        while (itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }


        System.out.println();
        //using for each
//        for(int ele : h_set)
//            System.out.print(ele+" ");
    }
}
