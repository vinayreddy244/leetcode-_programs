//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            Long X = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.reversedBits(X));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static Long reversedBits(Long X) {
        long count[]=new long[32];
        int j=0;
	    while(X>0)
	    {
	        count[j] = (X&1);
	        j++;
	        X=X>>1;
	    }
	    long ans=0,pos=1;
	    for(int i=31; i>=0; i--)
	    {
	        ans = ans + count[i]*pos;
	        pos<<=1;
	    }
	    return ans;
    }
 
        // code here
};