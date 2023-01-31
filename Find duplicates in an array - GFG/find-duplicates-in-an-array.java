//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer> list=new ArrayList<>();
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> m:mp.entrySet())
        {
            if(m.getValue()>1)
            {
                list.add(m.getKey());
            }
        }
        if(list.size()==0)
        {
            list.add(-1);
        }
        Collections.sort(list);
        return list;
        
        // code here
    }
}
