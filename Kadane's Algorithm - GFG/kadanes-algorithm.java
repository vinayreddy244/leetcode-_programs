//{ Driver Code Starts
import java.io.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling maxSubarraySum() function
		    System.out.println(obj.maxSubarraySum(arr, n));
		}
	}
}


// } Driver Code Ends

class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    int max(int x,int y)
    {
        if(x>y)
        {
            return x;
        }
        else
        {
            return y;
        }
    }
    long maxSubarraySum(int arr[], int n){
        int lmax=0;
        int gmax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>arr[i]+lmax)
            {
                lmax=arr[i];
            }
            else
            {
                lmax=lmax+arr[i];
            }
            gmax=max(gmax,lmax);
        }
        if(gmax==0)
        {
            return -1;
        }
        else
        {
            return gmax;
        }
        
        // Your code here
        
    }
    
}

