import java.util.HashMap;

public class Hash_Map{
    public static void main(String args[])
    {
        HashMap<String , Integer> h_Map = new HashMap<>();
        h_Map.put("Rajesh", 202);
        h_Map.put("Kuheli", 203);
        h_Map.put("Son", 204);
        System.out.println(h_Map);
        h_Map.put("Rajesh",205);
        System.out.println(h_Map);
        //Key Unique , value Not unique
        System.out.println(h_Map.containsKey("Rajesh"));
        System.out.println(h_Map.containsValue(205));
        h_Map.remove("son");


        //get
        System.out.println(h_Map.get("Rajesh"));


        //How to iterate in HashMap



    }
}
