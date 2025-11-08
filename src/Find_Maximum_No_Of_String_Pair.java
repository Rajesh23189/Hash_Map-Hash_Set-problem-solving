import java.util.HashSet;


public class Find_Maximum_No_Of_String_Pair {

    public static String reverse(String str)
    {
         StringBuilder sb = new StringBuilder(str);
         sb.reverse();
         return sb.toString();
    }

    public static int No_Of_Pair(String[] words)
    {
        HashSet<String> set = new HashSet<>();
        int count = 0;
        for(int i = 0;i < words.length;i++){
            String rev_str = reverse(words[i]);
            if(set.contains(rev_str))
            {
                count++;
                set.remove(rev_str);

            }

            else
                set.add(words[i]);
        }
        return count;
    }


    public static void main(String args[])
    {
        String[] arr = {"ab","cd","ef","gh","ba","dc","fe"};
        int Pair = No_Of_Pair(arr);
        System.out.println("The Number Of String pair is : "+Pair);
    }
}
