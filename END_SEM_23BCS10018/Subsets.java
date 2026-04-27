import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int arr[]={1,2,3};
       List<List<Integer>> list =helper(arr);
       for(List<Integer> dup:list)
       {
         for(int i:dup)
         {
           System.out.print(i+" ");
         }
         System.out.print("\n");
       }
      
    }
    
      public static List<List<Integer>> helper(int[] nums) {
        List<List<Integer>> arr =new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<(1<<n);i++)
        {
            List<Integer> first=new ArrayList<>();
            for(int j=0;j<n;j++)
            {
                if((i&(1<<j))!=0)
                first.add(nums[j]);
            }
            arr.add(first);
        }
        return arr;
    }
}