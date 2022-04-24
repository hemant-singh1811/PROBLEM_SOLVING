
class Solution {

    public int minimumSize(int[] nums, int max) {
        
        
        Arrays.sort(nums);
        int n=nums.length;
        if(n==0) return 0;
        int l=1;
        int h=nums[n-1];
        
        int ans=0;
        while(l<=h){
            
            int mid=(2*l-(l-h))/2;
            
            if(is(nums,mid,max)){
                ans=mid;
                h=mid-1;
            }else{
                l=mid+1;
            }            
        }
        return ans;
    }
    
    public static boolean is(int[] nums,int mid ,int max){
        
        for(int x:nums){
            
            if(x>mid){
                    int y=x-(x%mid);
                 y= y/mid;
                if(x%mid==0) y--;
                
                if(max>=y) max-=y;
                else return false;
            } 
        }
        
        return true;
        
    }

}