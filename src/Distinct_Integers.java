import java.util.HashSet;
import java.util.Set;

public class Distinct_Integers {

    public static int count_Dis_int(int[] arr){
        Set<Integer> h_set = new HashSet<>();

        //add array element In h_set
        for(int  i=0;i<arr.length;i++)
            h_set.add(arr[i]);
        //reverse element and add
        for(int  j=0;j<arr.length;j++)
        {
            int num = arr[j];
            int rev_num = 0;
            while(num != 0){
                int l_digit = num%10;
                rev_num = rev_num*10 + l_digit;
                num /= 10;
            }
            h_set.add(rev_num);
        }
        return h_set.size();
    }
    public static void main(String args[])
    {
        int[] arr = {1,32,56,78};
        System.out.println("After Rever Distinct Integer InArray Is: "+count_Dis_int(arr));
    }
}
