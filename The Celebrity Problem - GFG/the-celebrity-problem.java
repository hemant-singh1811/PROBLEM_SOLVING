// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    } 
} // } Driver Code Ends


//User function Template for Java


class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int arr[][], int n)
    {  
		Stack<Integer> stk = new Stack<>();

		for (int i = 0; i < n; i++)
			stk.push(i);

		while (stk.size() > 1) {

			int pop1 = stk.pop();
			int pop2 = stk.pop();

			if (arr[pop1][pop2] == 1 && arr[pop2][pop1] == 0) {
				stk.push(pop2);
			} 
			else if(arr[pop2][pop1] == 1 && arr[pop1][pop2] == 0)
				stk.push(pop1);
		}
		boolean flag=false;
		if (stk.size() == 1) {
			int ans=stk.pop();
			
			for(int i=0;i<n;i++) {
				if((arr[i][ans]==0  || arr[ans][i]==1) && ans!=i)
				{
					flag =true;
					break;
				}
			}
			if(!flag)
			return ans;
			else return -1;
			
		}
		else  return -1;

      }
}