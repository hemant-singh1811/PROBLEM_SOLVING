class Solution {
    public int longestSubarray(int[] nums) {
        
        int z=0;
        
        for(int x:nums){
            if(x==0){
                z++;
            }
        }
        if(z==0) return nums.length-1;
        int[] a=new int[z+2];         
        int n=nums.length;
        a[0]=-1;
        a[z+1]=n;
        int j=1;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                a[j]=i;
                // System.out.println("z");
                j++;
            }
        }
        int ans=0;
        for(int i=1;i<=z;i++){
            // System.out.println("idx : "+a[i]);
            int sub=a[i]-a[i-1] +a[i+1]-a[i]-2;
            
                
            ans=Math.max(ans,sub);
        }
        
        return ans;
        
    }
}