class Solution { 
         
   public static int rob(int[] nums) { 
           int n=nums.length;  
         if(n==0) return 0;
         if(n==1) return nums[0];
           int n1=0;
           int n2=0;
           if(n>0)
           n1=nums[n-1];
           if(n>1)
           n2=Math.max(nums[n-2],n1);
    
           for(int i=n-3;i>=0;i--){ 
               
               int ans=Math.max(n2,nums[i]+n1);
              
               n1=n2;
               n2=ans;
           }
           return n2; 
       } 
}