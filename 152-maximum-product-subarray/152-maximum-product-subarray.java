class Solution {
public int maxProduct(int[] nums) {
int n = nums.length;
int minProduct=nums[0];
int maxProduct= nums[0];
int ans =nums[0];

    for(int i =1;i<n;i++)
    {
        if(nums[i]<0)
        {
            //swap maxProduct and minProduct if nums[i]<0
            int tmp = maxProduct;
            maxProduct= minProduct;
            minProduct=tmp;


        }
        
        maxProduct=Math.max(maxProduct*nums[i], nums[i]);
        minProduct=Math.min(minProduct*nums[i],nums[i]);
        ans = Math.max(ans,maxProduct);
        
    }
    return ans;
    
}
}