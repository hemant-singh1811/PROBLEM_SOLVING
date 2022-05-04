class Solution {
public:
    int maxOperations(vector<int>& nums, int k) { 
        sort(nums.begin(), nums.end());
        
        int s=0, e=nums.size()-1; 
      int count=0;
        
        while(s<e){            
            int sum=nums[s]+nums[e];
            
            if(sum==k){
                count++;
                s++;
                e--;
            }
            else if(sum>k) e--;
            else s++;          
        }
        return count;
    }
};