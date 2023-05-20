//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            boolean ans = obj.isStraightHand(n, k, a);
            System.out.println(ans ? "True" : "False");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static boolean isStraightHand(int N, int groupSize, int hand[]) {
        if(N%groupSize!=0)
        {
            return false;
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i :hand)
        {
            pq.add(i);
        }
        while(!pq.isEmpty())
        {
            int head=pq.poll();
            for(int j=1;j<groupSize;j++)
            {
                if(!pq.remove(head+j))
                {
                    return false;
                }
            }
        }
        return true;
       
        // code here
    }
}
