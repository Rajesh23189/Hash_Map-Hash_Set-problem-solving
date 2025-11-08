import java.util.HashMap;


public class Hash_Map_Iterate {
    public static void main(String args[])
    {
        HashMap<String , Integer>  map = new HashMap<>();
        map.put("Rajesh",200);
        map.put("Kuheli",201);
        map.put("Manik",202);
        map.put("Pramanik",203);
        map.put("Manik-Pramanik",204);

        for(String key : map.keySet()){
            int val = map.get(key);
            System.out.println(key+" "+val);//Print key && Value
        }


        //entry set  : key value pair
        for (Object pair : map.entrySet())
        {
            System.out.println(pair);
        }


    }
}
