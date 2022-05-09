class Solution {
    public int maxProfit(int[] p) {
        int k=p.length,s=0,h=Integer.MIN_VALUE;
        for(int i=0;i<k-1;i++)
        {
            int b=p[i+1]-p[i];
            if(b>0)
            {
                s+=b;
            }
        }
        return s;
    }
}