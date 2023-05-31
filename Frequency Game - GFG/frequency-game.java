//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;

// Position this line where user code will be pasted.

// Driver class with main function
class GFG {
    // Main function
    public static void main(String[] args)throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());

        // Iterating over testcases
        while (t-- > 0) {
            int n = Integer.parseInt(in.readLine());
            int arr[] = new int[n];

            String s[]=in.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(s[i]);

            Solution obj = new Solution();
            System.out.println(obj.LargButMinFreq(arr, n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// Helper class to find largest number with minimum frequency
class Solution {
    // Function to find largest number with minimum frequency
    public static int LargButMinFreq(int arr[], int n) {
        HashMap<Integer,Integer> hp=new HashMap<>();
        for(int i=0;i<n;i++)
        {
             if (hp.containsKey(arr[i]))
            {
                hp.put(arr[i], hp.get(arr[i]) + 1);
            }
            else
            {
                hp.put(arr[i], 1);
            }
        }
        int minFreq = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> x : hp.entrySet())
        {
            int num = x.getKey();
            int freq = x.getValue();
        if (freq < minFreq)
        {
            minFreq = freq;
            maxValue = num;
        }
        else if (freq == minFreq
                 && maxValue < num) 
        {
            maxValue = num;
        }
    }
 
    return maxValue;
            
        // Your code here
    }
}