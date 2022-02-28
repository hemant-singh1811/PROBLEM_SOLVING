class Solution {
    public int longestOnes(int[] nums, int k) {
     
        int l=1;
        int h=nums.length;
        
        int ans=0;
        
        while(l<=h){
         
            int mid=(h+l)/2;
            
            boolean ans2=longestOnes(nums,k,mid);
            
            if(ans2){
                ans=mid;
                l=mid+1;
            }else{
                h=mid-1;
            }            
        }
        
        return ans;
    }
    
    public static boolean longestOnes(int[] nums,int k,int mid){
        
        int one=0;
        int n=nums.length;
        for(int i=0;i<mid;i++){
            one+=nums[i];
        }
        
        if(one+k>=mid){
         return true;   
        }
        
        for(int i=1;i<=n-mid;i++){
        
            one-=nums[i-1];
            one+=nums[i+mid-1];
        
        if(one+k>=mid){
         return true;   
        }   
        }
        
        return false;
        
    }
}